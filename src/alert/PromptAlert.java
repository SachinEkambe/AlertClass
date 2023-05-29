package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//lunch the chrome browser
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        //lunch the Url
	        driver.get("https://demoqa.com/alerts");
	        //maximize the screen
	        driver.manage().window().maximize();
	      
	        //find wenelement to click element.
	       WebElement element= driver.findElement(By.id("promtButton"));
	       //this method goes exact webelement and click the target
	       ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click();", element);
	       Alert PromptAlert=driver.switchTo().alert();
	       PromptAlert.sendKeys("Sachin Ekambe");
	       Thread.sleep(2000);
	       PromptAlert.accept();
	}

}
