package Guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		String tagname = driver.findElement(By.id("email")).getTagName();
		
		System.out.println(tagname);
		
		//System.exit(0);
	}

}
