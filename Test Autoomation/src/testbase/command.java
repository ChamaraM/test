package testbase;
import org.openqa.selenium.By; 


public class command {
	//WebDriver dr = new InternetExplorerDriver();
	//WebDriver dr = new FirefoxDriver();
	
	 
	public void type(String i,By obi){
		/*NewTest ts = new  NewTest();
		  WebDriver driver;*/
		
		 // System.setProperty("webdriver.gecko.driver","C:\\Automation\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//  driver =new FirefoxDriver();
		  NewTest1.getDriver().findElement(obi).clear();
		  NewTest1.getDriver().findElement(obi).sendKeys(i);
	}
}
    