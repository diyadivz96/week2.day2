package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
System.out.println("The Title is " + driver.getTitle());
driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
WebElement elementss = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
elementss.sendKeys("tab is used");
elementss.sendKeys(Keys.TAB);
System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled());
}
}
