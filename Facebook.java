package week2.day2.assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Diya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input"))
				.sendKeys("8523469571");
		driver.findElement(By.xpath("(//div[@id='password_field']//input)")).sendKeys("ssssss");
		WebElement testDropDown = driver.findElement(By.id("day"));
		Select dropdown = new Select(testDropDown);
		dropdown.selectByVisibleText("6");
		WebElement testDrop = driver.findElement(By.id("month"));
		Select drop = new Select(testDrop);
		drop.selectByValue("11");
		WebElement testDown = driver.findElement(By.id("year"));
		Select down = new Select(testDown);
		down.selectByIndex(26);
		driver.findElement(By.xpath("//label[@class='_58mt']/following-sibling::input")).click();

	}
}
