package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/selenium/deprecated.html";
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Deprecated")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
