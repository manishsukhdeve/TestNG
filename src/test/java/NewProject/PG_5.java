package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG_5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String alertMessage = "";
		
		String baseURL = "http://output.jsbin.com/usidix/1";
		
		driver.get(baseURL);
		
		driver.findElement(By.cssSelector("body > input[type=button]")).click();
		
		alertMessage = driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		driver.switchTo().alert().accept();
		
		driver.close();


		
	}

}
