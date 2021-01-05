package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mmt {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../test1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.className("")).sendKeys(Keys.ENTER);;
			
		
	}

}
