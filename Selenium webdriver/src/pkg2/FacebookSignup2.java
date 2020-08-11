package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup2 
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "../Selenium webdriver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        
	        WebElement firstname=driver.findElement(By.cssSelector("input#u_0_m"));
			firstname.sendKeys("Manish");
			
			WebElement lastname=driver.findElement(By.cssSelector("input#u_0_o"));
			lastname.sendKeys("Bahuguna");
			
			WebElement mobileNo=driver.findElement(By.cssSelector("input#u_0_r"));
			mobileNo.sendKeys("manishbahuguna6@gmail.com");
			
			WebElement pass=driver.findElement(By.cssSelector("input[id='password_step_input'"));
			pass.sendKeys("456@dkgfhg55");
		
			
			WebElement day= driver.findElement(ByCssSelector("select#day"));
			Select d= new Select(day);
			d.selectByIndex(2);
			
			WebElement month= driver.findElement(ByCssSelector("select[id='month']"));
			Select m= new Select(month);
			m.selectByValue("3");
			
			WebElement year= driver.findElement(ByCssSelector("select#year"));
			Select y= new Select(year);
			y.selectByVisibleText("2013");
			
			WebElement gender= driver.findElement(ByCssSelector("label_58mt"));
			gender.click();
			driver.findElement(By.name("wesubmit")).click();
			
			
	}

	private static By ByCssSelector(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
