package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("diyadivz96@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String firstResultingLeadName = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		System.out.println("Name of the First Resulting lead is " + firstResultingLeadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("The title is " + title);
		} else
			System.out.println("Wrong title is displayed");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
// check  "firstResultingLeadName" is same as "duplicateLeadName"		
		String duplicateLeadName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (duplicateLeadName.equals(firstResultingLeadName)) {
			System.out.println(
					"The 'dupliacte lead name' is same as the 'fist resulting lead name' : " + duplicateLeadName);
		}
		driver.close();
	}

}
