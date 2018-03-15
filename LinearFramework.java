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
	
	//Get Default Text
	
	String staticText = driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[1]")).getText();
	System.out.println(staticText);
	String DynamicText= driver.findElement(By.xpath(".//*[@id='username_show']")).getAttribute("value");
	System.out.println(DynamicText);
	
	// User Search Hotel
	
	new Select(driver.findElement(By.xpath(".//*[@id='location']"))).selectByIndex(4);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='hotels']"))).selectByIndex(2);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='room_type']"))).selectByIndex(3);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='child_room']"))).selectByIndex(1);
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='Submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='radiobutton_0']")).click();
	driver.findElement(By.xpath(".//*[@id='continue']")).click();
	
	// Book Hotel
	
	driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("Mohammed");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("Saad");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("TalentSprint,Gachibowli");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='cc_num']")).sendKeys("4448236598981234");
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='cc_type']"))).selectByIndex(2);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='cc_exp_month']"))).selectByIndex(8);
	Thread.sleep(2000);
	new Select(driver.findElement(By.xpath(".//*[@id='cc_exp_year']"))).selectByIndex(9);
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='cc_cvv']")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='book_now']")).click();
	Thread.sleep(2000);
	
	// Order Number
	
	String OrderNumber= driver.findElement(By.xpath(".//*[@id='order_no']")).getAttribute("value");
	System.out.println(OrderNumber);
	driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
	
	// To close the browser
	driver.quit();
	
	}
}
