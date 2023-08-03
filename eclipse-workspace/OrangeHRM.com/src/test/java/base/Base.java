package base;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	protected  WebDriver driver;
	protected  Properties prop=new Properties() ;
	protected FileReader  fis;
	protected String baseUrl;
	//public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public  void setUp() {

            	WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                System.out.println(baseUrl);
                driver.get(baseUrl);
	
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
}
