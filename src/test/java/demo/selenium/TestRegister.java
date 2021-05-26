package demo.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestRegister {
	WebDriver driver;
	
	
	

	@Test(priority=1)
	public void testRegister() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "http://localhost:9000/account/register";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.navigate().refresh();
		
		driver.findElement(By.name("login")).sendKeys("nguyenhang9193");
		driver.findElement(By.name("email")).sendKeys("asdnk@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bueno123456789");
		driver.findElement(By.name("confirmPassword")).sendKeys("bueno123456789");
		WebElement btnLogin = driver.findElement(By.className("btn-primary"));
		btnLogin.click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
	}
	
	@Test(priority=2)
	public void testRegister2() throws InterruptedException {
try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url = "http://localhost:9000/account/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			driver.findElement(By.name("login")).sendKeys("nguyenhang9193");
			driver.findElement(By.name("email")).sendKeys("asdnk@gmail.com");
			driver.findElement(By.name("password")).sendKeys("bueno123456789");
			driver.findElement(By.name("confirmPassword")).sendKeys("bueno12345678");
			WebElement btnLogin = driver.findElement(By.className("btn-primary"));
			
			btnLogin.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
//			WebElement notify = driver.findElement(By.className("alert alert-danger"));
//			Assert.assertEquals(notify.getText(),"The password and its confirmation do not match!");
			
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("fail");
			
		}
	}
	
	@Test(priority=3)
	public void testRegister3() throws InterruptedException {
try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url = "http://localhost:9000/account/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			driver.findElement(By.name("login")).sendKeys("nguyenhang9193");
			driver.findElement(By.name("email")).sendKeys("asdnk@gmail.com");
			driver.findElement(By.name("password")).sendKeys("bueno123456789");
			driver.findElement(By.name("confirmPassword")).sendKeys("bueno12345678");
			WebElement btnLogin = driver.findElement(By.className("btn-primary"));
			
			btnLogin.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
//			WebElement notify = driver.findElement(By.className("alert alert-danger"));
//			Assert.assertEquals(notify.getText(),"The password and its confirmation do not match!");
			
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("fail");
			
		}
	}
	@Test(priority=4)
	public void testRegister4() throws InterruptedException {
try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url = "http://localhost:9000/account/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			driver.findElement(By.name("login")).sendKeys("nguyenhang9193");
			driver.findElement(By.name("email")).sendKeys("asdnk@gmail.com");
			driver.findElement(By.name("password")).sendKeys("bueno123456789");
			driver.findElement(By.name("confirmPassword")).sendKeys("bueno12345678");
			WebElement btnLogin = driver.findElement(By.className("btn-primary"));
			
			btnLogin.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
//			WebElement notify = driver.findElement(By.className("alert alert-danger"));
//			Assert.assertEquals(notify.getText(),"The password and its confirmation do not match!");
			
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("fail");
			
		}
	}
	@Test(priority=5)
	public void testRegister5() throws InterruptedException {
try {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url = "http://localhost:9000/account/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			driver.findElement(By.name("login")).sendKeys("nguyenhang9193");
			driver.findElement(By.name("email")).sendKeys("asdnk@gmail.com");
			driver.findElement(By.name("password")).sendKeys("bueno123456789");
			driver.findElement(By.name("confirmPassword")).sendKeys("bueno12345678");
			WebElement btnLogin = driver.findElement(By.className("btn-primary"));
			
			btnLogin.click();
			driver.navigate().refresh();
			Thread.sleep(1000);
//			WebElement notify = driver.findElement(By.className("alert alert-danger"));
//			Assert.assertEquals(notify.getText(),"The password and its confirmation do not match!");
			
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("fail");
			
		}
	}
	
//	
	
}
