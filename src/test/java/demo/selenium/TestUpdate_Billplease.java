package demo.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUpdate_Billplease {
	WebDriver driver;
	
	String USERNAME = "admin";
	String PASSWORD = "admin";
	
	String USERNAME2 = "user";
	String PASSWORD2 = "user";
	
	@Test(priority=1)
	public void testfirst() throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			String url2 = "http://localhost:9000/hoa-don";
			String url = "http://localhost:9000/login";
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
	
			driver.navigate().refresh();
			driver.get(url2);
			Thread.sleep(2000);
			
			WebElement bill = driver.findElements(By.className(" btn-primary ")).get(1);
			bill.click();
			WebElement chiSoCu = driver.findElement(By.name("chiSoCu"));
			chiSoCu.sendKeys("20");
			WebElement chiSoMoi = driver.findElement(By.name("chiSoMoi"));
			chiSoMoi.sendKeys("40");
			WebElement edit = driver.findElement(By.className(" btn-primary "));
			edit.click();
			Thread.sleep(2000);
		
		driver.close();
		
		
	}
	@Test(priority=2)
	public void test2() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url2 = "http://localhost:9000/hoa-don";
		String url = "http://localhost:9000/login";
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		WebElement taikhoan = driver.findElement(By.name("username"));
		taikhoan.sendKeys(USERNAME);
		WebElement matkhau = driver.findElement(By.name("password"));
		matkhau.sendKeys(PASSWORD);
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();

		driver.navigate().refresh();
		driver.get(url2);
		Thread.sleep(2000);
		
		WebElement bill = driver.findElements(By.className(" btn-primary ")).get(1);
		bill.click();
		WebElement chiSoCu = driver.findElement(By.name("chiSoCu"));
		chiSoCu.sendKeys("20");
		WebElement chiSoMoi = driver.findElement(By.name("chiSoMoi"));
		chiSoMoi.sendKeys("40");
		WebElement edit = driver.findElement(By.className(" btn-primary "));
		Thread.sleep(2000);
	
	driver.close();
	
	
}
	@Test(priority=3)
	public void testNewBill() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url2 = "http://localhost:9000/hoa-don";
		String url = "http://localhost:9000/login";
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		WebElement taikhoan = driver.findElement(By.name("username"));
		taikhoan.sendKeys(USERNAME);
		WebElement matkhau = driver.findElement(By.name("password"));
		matkhau.sendKeys(PASSWORD);
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();

		driver.navigate().refresh();
		driver.get(url2);
		Thread.sleep(2000);
		
		WebElement bill = driver.findElements(By.className(" btn-primary ")).get(1);
		bill.click();
		WebElement hogiadinh = driver.findElement(By.name("hogiadinh"));
		hogiadinh.sendKeys("1");
		WebElement tenchuho = driver.findElement(By.name("tenchuho"));
		tenchuho.sendKeys("Cong");
		
		WebElement save = driver.findElement(By.className(" btn-primary "));
		save.click();
		Thread.sleep(2000);
	
	driver.close();
	
	
}
	@Test(priority=4)
	public void testdeleteBill() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url2 = "http://localhost:9000/hoa-don";
		String url = "http://localhost:9000/login";
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		WebElement taikhoan = driver.findElement(By.name("username"));
		taikhoan.sendKeys(USERNAME);
		WebElement matkhau = driver.findElement(By.name("password"));
		matkhau.sendKeys(PASSWORD);
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();

		driver.navigate().refresh();
		driver.get(url2);
		Thread.sleep(2000);
		
		WebElement delete = driver.findElements(By.className("btn-secondary")).get(1);
		delete.click();
		
	
	driver.close();
	
	
}
	
	
	
}
