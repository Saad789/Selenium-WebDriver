package P3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineTeaCompany {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium - Saad(C06)\\Browser Drivers\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    // Open the website
    
    driver.get("http://www.practiceselenium.com/welcome.html");
    
    // Select Menu
    
    driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]/a")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451955160']/span")).click();
	Thread.sleep(2000);
	
	// Enter Billing Information
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mohammedsaad@talentsprint.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Mohammed Saad");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("TalentSprint,PSR Prime Towers,Gachibowli");
	Thread.sleep(2000);
	
	new Select(driver.findElement(By.xpath(".//*[@id='card_type']"))).selectByIndex(1);
	
	driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4486556822461234");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='cardholder_name']")).sendKeys("SAAD");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='verification_code']")).sendKeys("54321");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button")).click();
	Thread.sleep(2000);
	// Close Browser
	   driver.quit();
	}

}
