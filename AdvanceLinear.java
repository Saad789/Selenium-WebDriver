package P.Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceLinear {

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
	    
	    String DivExpected = "2.5";
	    System.out.println("The Expected Result is " +DivExpected);
	    
	    String DivActual = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The Actual Result is " +DivActual);
	    
	    // Comparing Expected Result with Actual Result
	    
	    String result = "";
	    if(DivActual.equals(DivExpected) == true) {
	    	System.out.println(result = "Test Case is Passed");
	        }
	    else{
	    	result = "Test Case is Failed";
	    }
	    
	    // Perform Percentage
	    
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(2);
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
	    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	    Thread.sleep(5000);
	    
	    String Percentage = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The value of Percentage is " +Percentage);
	    
	    String PercentExpected = "2.5";
	    System.out.println("The Expected Result is " +PercentExpected);
	    
	    String PercentActual = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The Actual Result is " +PercentActual);
	    
	    // Comparing Expected Result with Actual Result
	    
	    String result1 = "";
	    if(PercentActual.equals(PercentExpected) == true) {
	    	System.out.println(result = "Test Case is Passed");
	        }
	    else{
	    	System.out.println(result = "Test Case is Failed"); 
	    
	    // Perform Multiplication
	    
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(3);
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
	    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	    Thread.sleep(5000);
	    
	    String Mul = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The value of Multiplication is " +Mul);
	    
	    String MulExpected = "40";
	    System.out.println("The Expected Result is " +MulExpected);
	    
	    String MulActual = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The Actual Result is " +MulActual);
	    
	    // Comparing Expected Result with Actual Result
	    
	    String result2 = "";
	    if(MulActual.equals(MulExpected) == true) {
	    	System.out.println(result = "Test Case is Passed");
	        }
	    else{
	    	System.out.println(result = "Test Case is Failed"); 
	    	Thread.sleep(2000);
	   
	    // Perform Substraction
	    
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(4);
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
	    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	    Thread.sleep(5000);
	    
	    String Sub = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The value of Substraction is " +Sub);
	    
	    String SubExpected = "5";
	    System.out.println("The Expected Result is " +SubExpected);
	    
	    String SubActual = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The Actual Result is " +SubActual);
	    
	    // Comparing Expected Result with Actual Result
	    
	    String result3 = "";
	    if(SubActual.equals(SubExpected) == true) {
	    	System.out.println(result = "Test Case is Passed");
	        }
	    else{
	    	System.out.println(result = "Test Case is Failed");
	    
	    // Perform Addition
	    
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	    new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(0);
	    driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("4");
	    driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	    Thread.sleep(5000);
	    
	    String Sum = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The value of Addition is " +Sum);
	    
	    String SumExpected = "14";
	    System.out.println("The Expected Result is " +SumExpected);
	    
	    String SumActual = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	    System.out.println("The Actual Result is " +SumActual);
	    
	    // Comparing Expected Result with Actual Result
	    
	    String result4 = "";
	    if(SumActual.equals(SumExpected) == true) {
	    	System.out.println(result = "Test Case is Passed");
	        }
	    else{
	    	System.out.println(result = "Test Case is Failed");
	    
	    //Close Browser
	      driver.quit();
          }
        }
	  }
	 }
	}
  }
