package testbase;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class NewTest1 {
	
	// public static WebDriver driver;
	 public static WebDriver driver=null;



	    public static WebDriver startdriver(){


	    	 System.setProperty("webdriver.gecko.driver","C:\\Automation\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	   	  driver =new FirefoxDriver();
	        return driver;

	        }

	 
	/* @BeforeSuite
  public void launchDriver(){

	  
	  System.setProperty("webdriver.gecko.driver","C:\\Automation\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	  driver =new FirefoxDriver();
    //  return driver;

}
  @Test*/
  public static WebDriver getDriver() {
      return driver;
    }
  
  

  public static void closeDriver(){
    if(driver!=null){
      driver.close();
      
    }
  }
  
  
  
  }
