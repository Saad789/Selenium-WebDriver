package P2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineCalc {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium - Saad(C06)\\\\Browser Drivers\\\\chrome\\\\chromedriver.exe");	
    WebDriver driver = new ChromeDriver();
    
    // Open Application with URL
    
    driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
    Thread.sleep(2000);
    
    // Perform Division
    
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(1);
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
    Thread.sleep(5000);
    
    String Div = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
    System.out.println("The value of division is " +Div);
    
    // Perform Percentage
    
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(2);
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
    Thread.sleep(5000);
    
    String Percentage = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
    System.out.println("The value of Percentage is " +Percentage);
    
    // Perform Multiplication
    
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(3);
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
    Thread.sleep(5000);
    
    String Mul = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
    System.out.println("The value of Multiplication is " +Mul);
   
    // Perform Substraction
    
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(4);
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
    Thread.sleep(5000);
    
    String Sub = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
    System.out.println("The value of Substraction is " +Sub);
    
    // Perform Addition
    
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(0);
    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
    Thread.sleep(5000);
    
    String Sum = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
    System.out.println("The value of Addition is " +Sum);
    
	}
}
