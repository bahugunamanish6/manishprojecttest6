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
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("manishbahuguna6@gmail.com");
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("456@dkgfhg55");
	}
	
		

}
