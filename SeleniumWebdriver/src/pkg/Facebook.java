package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "../SeleniumWebdriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        
        WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Manish");
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Bahuguna");
		
		WebElement email=driver.findElement(By.cssSelector("input[name= 'reg_email__'"));
		email.sendKeys("manishbahuguna6@gmail.com");
		
		WebElement pass=driver.findElement(By.id("password_step_input"));
		pass.sendKeys("456@dkgfhg55");
		
		WebElement SignUp=driver.findElement(By.name("wesubmit"));
		
		SignUp.click();
		
		driver.close();
	}
	
		

}
