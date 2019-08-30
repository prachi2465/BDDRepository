package selen;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

	 

	public class MyTest {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:/BDD733/SeleniumProject/src/main/java/aa/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://google.com");
	    WebElement element=driver.findElement(By.name("q"));
	    Thread.sleep(5000);
	    element.sendKeys("java");
	    element.submit();
	    Thread.sleep(5000);
	    driver.quit();
	}
	}
