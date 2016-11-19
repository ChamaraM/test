package testsuit;



import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testbase.command;
import testbase.NewTest1;
import testbase.*;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys; 


public class NewTest {
	

	@BeforeTest
public void a(){
		
		close.clearsession();
		
		
	}
		
	
	  @AfterTest
	  public void b()
	  {
		  NewTest1.closeDriver();
		  NewTest1.getDriver().manage().deleteAllCookies();
	  }
	  
  @Test
  public void f() throws InterruptedException {
	  command tr = new command();
	NewTest1.startdriver();
	/* WebDriver driver = new InternetExplorerDriver();
		WebDriver dr = new FirefoxDriver();*/
	  
	  
	  
	  NewTest1.getDriver().get("http://www.sliit.lk");
	//Clear the text field and Search for GMAIL web site 
	 // driver.findElement(By.id("lst-ib")).clear(); 
	//  driver.findElement(By.id("lst-ib")).sendKeys("GMAIL"); 
	  tr.type("Gmail",By.id("lst-ib"));
	  NewTest1.getDriver().findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	//click on appropriate result

	NewTest1.getDriver().findElement(By.linkText("Gmail - Google")).click();
	Thread.sleep(5000);
	
	 tr.type("cha.com", By.id("Email"));
	 Thread.sleep(5000);
	 
	 tr.type("chamara.madushan2@gmail.com", By.id("Email"));
	//click on next button
	 NewTest1.getDriver().findElement(By.id("next")).click();
	Thread.sleep(5000);
	
	tr.type("921250215", By.id("Passwd"));
	NewTest1.getDriver().findElement(By.id("signIn")).click();
	Thread.sleep(5000);

	//verify the user name
	NewTest1.getDriver().findElement(By.xpath("//span[@class='gb_P gb_R']")).isDisplayed();
	NewTest1.getDriver().findElement(By.xpath("//*[contains(text(), '******')]"));
	  
	  
	  
	 
	  
  }
  

  
}
