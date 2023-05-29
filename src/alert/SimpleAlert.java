package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        
	        driver.get("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	       
	        WebElement simple=driver.findElement(By.id("alertButton"));
	        simple.click();
	        Alert simpleAlert=driver.switchTo().alert();
	        simpleAlert.accept();
	}

}
