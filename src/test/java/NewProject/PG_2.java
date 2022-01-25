package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.facebook.com/";
		String tagName = "";
		
		driver.get(baseURL);
		
		tagName = driver.findElement(By.id("email")).getTagName();
		
//		WebElement getText = driver.findElement(By.id("email"));
//		System.out.println(getText.getText());
		
		
		System.out.println(tagName);
		
		driver.close();
		
		System.exit(0);
		
		
	}

}
