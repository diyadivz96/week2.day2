package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imageHtml {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
System.out.println("The Title is " + driver.getTitle());
driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
driver.navigate().back();
Thread.sleep(3000);
WebElement elementBrokenimage = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[2]"));
if(elementBrokenimage.getAttribute("naturalWidth").equals("0")){
	System.out.println("The image is broken");
}else {
	System.out.println("The image is not broken");
}
WebElement elementkey = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]"));
elementkey.click();
Actions actions = new Actions(driver);
actions.moveToElement(elementkey).click().perform();
}
}

