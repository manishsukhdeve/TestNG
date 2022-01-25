package NewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG_1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tour";
		String actualTitle = "";
		
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(actualTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
//		System.out.println(driver.getPageSource());
		
//		driver.close();
		driver.quit();
		
	}

}
