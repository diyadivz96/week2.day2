package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
System.out.println("The Title is " + driver.getTitle());

WebElement dIndex= driver.findElement(By.id("dropdown1"));
Select Dropdown1 = new Select(dIndex);
Dropdown1.selectByIndex(1);

WebElement dText = driver.findElement(By.name("dropdown2"));
Select Dropdown2 = new Select(dText);
Dropdown2.selectByVisibleText("Selenium");

WebElement dValue= driver.findElement(By.id("dropdown3"));
Select Dropdown3 = new Select(dValue);
Dropdown3.selectByValue("1");

WebElement numOptions = driver.findElement(By.className("dropdown"));
Select Dropdown4 = new Select(numOptions);
List<WebElement> options = Dropdown4.getOptions();
int size = options.size();
System.out.println("Total number of dropdown options : "+size);

WebElement sendkeys = driver.findElement(By.xpath("(//div[@class='example']/select)[5]"));
sendkeys.sendKeys("Selenium");

WebElement multipleSelection = driver.findElement(By.xpath("((//div[@class='example']/select))[6]"));
Select Dropdown5 = new Select(multipleSelection);
Dropdown5.selectByValue("1");

}}
