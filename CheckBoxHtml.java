package week2.day2.assignment;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
System.out.println("The Title is " + driver.getTitle());
driver.findElement(By.xpath("//div[@class='example']/input[1]")).click();
driver.findElement(By.xpath("//div[@class='example']/input[4]")).click();
WebElement elementSelected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
if(elementSelected.isSelected()) {
	System.out.println("Selenium is checked");}
else{
	System.out.println("Selenium is not checked");}
WebElement firstElement = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
if(firstElement.isSelected()) 
	firstElement.click();
WebElement secondElement = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
if(secondElement.isSelected())
	secondElement.click();

List <WebElement> Checkboxes =  driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
for (WebElement webElements : Checkboxes) {
	webElements.click();
    }}}









