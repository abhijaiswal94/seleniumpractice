package Pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class you {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../test1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement video=driver.findElement(By.id("thumbnail"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		String focusedWindow=driver.getWindowHandle();
		
		Set<String> all=driver.getWindowHandles();
		
		System.out.println("windows total"+all.size());
		
		System.out.println("before switchng url"+driver.getCurrentUrl());
		for(String s:all)
		{
			driver.switchTo().window(s);
		}
		System.out.println("After Switching url "+driver.getCurrentUrl());
		driver.switchTo().window(focusedWindow);
		System.out.println("final url"+driver.getCurrentUrl());
}
}