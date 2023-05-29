package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lunch the chrome browser
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        //lunch the Url
	        driver.get("https://demoqa.com/alerts");
	        //maximize the screen
	        driver.manage().window().maximize();
	      
	        //find wenelement to click element.
	       WebElement element= driver.findElement(By.id("confirmButton"));
	       //this method goes exact webelement and click the target
	       ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].click();", element);
	       //switch to main window to child window to perform alert
	        Alert confirmationAlert=driver.switchTo().alert();
	        //accept the confirmation alert
	        confirmationAlert.accept();
	}

}
