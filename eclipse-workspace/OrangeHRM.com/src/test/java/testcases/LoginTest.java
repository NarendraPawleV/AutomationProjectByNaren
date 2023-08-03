package testcases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;


public class LoginTest  extends Base{
	
		@Test
		public void login() throws InterruptedException {
			
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		String actTitle=driver.getTitle();
		String expTitle="OrangeHRM";
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("test case is passed");
		
		}	
	}

