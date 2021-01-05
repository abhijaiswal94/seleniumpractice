package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yout {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../test1/chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		
		List<WebElement> video = d.findElements(By.id("img"));
		int n= video.size();
		System.out.println("no. of videos"+n);
		for(int i=0;i<n;i++)
		{
			Thread.sleep(5000);
			video.get(i).click();
			
			Thread.sleep(5000);
			d.navigate().back();
		}
		
		System.out.println("videos played succesfully");
	}

}
