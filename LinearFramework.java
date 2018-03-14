package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinearFramework {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium - Saad(C06)\\Browser Drivers\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();   
	
	// Open Application with URL
    
    driver.get("http://adactin.com/HotelAppBuild2/");
    
    //User Login
    
    driver.findElement(By.id("username")).sendKeys("Antony11");
	Thread.sleep(10000);
    driver.findElement(By.name("password")).sendKeys("Antony11");
    Thread.sleep(10000);
	driver.findElement(By.xpath(".//*[@id='login']")).click();
	Thread.sleep(10000);
	
	String staticText = driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[1]")).getText();
	System.out.println(staticText);
	String DynamicText= driver.findElement(By.xpath(".//*[@id='username_show']")).getAttribute("value");
	System.out.println(DynamicText);
	
	// User Search Hotel
	new Select(driver.findElement(By.xpath(".//*[@id='location']"))).selectByIndex(4);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='hotels']"))).selectByIndex(2);
	// To close the browser
	driver.quit();
	
	}

}
