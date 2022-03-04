package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

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
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("aaa");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		if (driver.getTitle().contains("Testleaf"))
			System.out.println("I confirm the Title has testleaf");
		else
			System.out.println("The title does not have the testleaf");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("amnet");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement UpdatedCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		System.out.println("Company Name is updated in the View Lead page : " + UpdatedCompanyName.getText());

	}
}
