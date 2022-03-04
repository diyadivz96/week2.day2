package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
System.out.println("The Title is " + driver.getTitle());
System.out.println(driver.findElement(By.id("home")).getTagName());
System.out.println(driver.findElement(By.id("position")).getLocation());
System.out.println(driver.findElement(By.id("color")).getText());
System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
System.out.println(driver.findElement(By.id("size")).getSize());

}

}
