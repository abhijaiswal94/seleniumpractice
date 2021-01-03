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
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement city = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		city.click();
		
		for (int i=0;i<5;i++)
		{
			city.sendKeys(Keys.ARROW_DOWN);
		}
		city.sendKeys(Keys.ENTER);
		
	}

}
