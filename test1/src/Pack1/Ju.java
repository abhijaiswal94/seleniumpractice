package Pack1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	
public class Ju {
	ChromeDriver driver;
	@Before
	public void a()
	{
		System.out.println("test1");System.setProperty("webdriver.chrome.driver", "../test1/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Test() throws InterruptedException
	{
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("abhishek");
	
		WebElement createnewaccount=driver.findElement(By.id("u_0_2"));
		createnewaccount.click();
		Thread.sleep(5000);
		WebElement First=driver.findElement(By.id("u_2_b"));
		First.sendKeys("Abhi");
		WebElement name=driver.findElement(By.id("u_2_d"));
		name.sendKeys("jaiswal");
		Thread.sleep(5000);
		WebElement Num=driver.findElement(By.id("u_2_g"));
		Num.sendKeys("9876543210");
		WebElement Pw=driver.findElement(By.id("password_step_input"));
		Pw.sendKeys("Qwerty123");
		WebElement drop=driver.findElement(By.name("birthday_day"));
		Select s=new Select(drop);
		s.selectByVisibleText("5");
		WebElement drop1=driver.findElement(By.name("birthday_month"));
		Select t=new Select(drop1);
		t.selectByVisibleText("May");
		WebElement drop2=driver.findElement(By.name("birthday_year"));
		Select u=new Select(drop2);
		u.selectByVisibleText("1994");
		Thread.sleep(2000);
		WebElement rad1=driver.findElement(By.id("u_2_2"));
		
		rad1.click();
				Thread.sleep(2000);
		WebElement Submit=driver.findElement(By.id("u_2_s"));
		Submit.click();
	}
	@After
	public void end()
	{
		driver.close();
	}

}
