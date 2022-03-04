package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
System.out.println("The Title is " + driver.getTitle());
driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
driver.navigate().back();
WebElement clickingElement = driver.findElement(By.partialLinkText("without clicking me?"));
String attribute = clickingElement.getAttribute("href");
System.out.println("The link is going to " + attribute);

WebElement elementBroken = driver.findElement(By.linkText("Verify am I broken?"));
elementBroken.click();
String title = driver.getTitle();
System.out.println(title);
if (title.contains("404 Not Found"))
{
	System.out.println("The link is  broken" );
}else {
	System.out.println("The link is not going to 404 page ");
}
driver.navigate().back();	
driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();	
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("The Number Of links is " + links.size());}
}
