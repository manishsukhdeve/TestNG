package NewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG_3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
//		driver.close();	// It closes only the browser window
		driver.quit();	// quit(), all windows will be closed. 
		
	}

}
