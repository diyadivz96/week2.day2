package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Dhivya");
		driver.findElement(By.id("lastNameField")).sendKeys("P");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Diya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("DD");
		driver.findElement(By.name("departmentName")).sendKeys("it");
		driver.findElement(By.name("description")).sendKeys("ssss");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("diyadivz96@gmail.com");
		WebElement testDropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(testDropDown);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("editing will be used...");
		driver.findElement(By.xpath("//div[@class='form']//input[@class='smallSubmit']")).click();
		System.out.println("The titlt is: " + driver.getTitle());
		if (driver.getTitle().contains("Testleaf"))
			System.out.println("I confirm the Title has testleaf");
		 else 
		
			System.out.println("The title does not have the testleaf");

	}

}
