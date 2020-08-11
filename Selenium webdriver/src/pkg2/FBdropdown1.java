package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBdropdown1 
{
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "../Selenium webdriver/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();		

		  driver.get("https://www.facebook.com/");
	        
	      driver.manage().window().maximize();
		  WebElement username = driver.findElement(By.name("firstname"));
	       username.sendKeys("Manish");	       	  
	       
	       WebElement lastname = driver.findElement(By.name("lastname"));
	       lastname.sendKeys("Bahuguna");
	       
	       WebElement mobileNo = driver.findElement(By.name("reg_email__"));
	       mobileNo.sendKeys("564565545");
	       
	       WebElement newpasswd = driver.findElement(By.cssSelector("input#password_step_input"));
	       newpasswd.sendKeys("5644@ABc");
	       
	       WebElement day = driver.findElement(By.id("day"));
	       day.click();
	       	       
	       Select s = new Select(day);
	       s.selectByIndex(26);
	       Thread.sleep(1000);
	       
	       WebElement month = driver.findElement(By.id("month"));
	       month.click();
	       Select s1 = new Select(month);
	       s1.selectByValue("7");
	       Thread.sleep(1000);
	       
	       WebElement year = driver.findElement(By.id("year"));
	       year.click();
	       Select s2 = new Select(year);
	       
	       	s2.selectByVisibleText("1990");
	       	Thread.sleep(1000);	       
	       
	       WebElement gender = driver.findElement(By.cssSelector("input._8esa"));
	       gender.click();
	        
	       WebElement submit = driver.findElement(By.name("websubmit"));
	       submit.click();
	       
      
	}

}
