package demo.selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestLogin {
	WebDriver driver;
	String url = "http://localhost:9000/login";
	String USERNAME = "admin";
	String PASSWORD = "admin";
	
	String USERNAME2 = "user";
	String PASSWORD2 = "user";
	Map<String, Object[]> testNGResults;
	HSSFWorkbook workbook;
	HSSFSheet sheet;




	@Test(priority=1)
	public void testfirst() {

		try {
			
			
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.navigate().refresh();
			
			
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			
			Thread.sleep(1000);
			testNGResults.put("2", new Object[] { "1", "nhap dung thong tin ", "login thanh cong-1", "Pass" });
		
		} catch (Exception e) {
			// TODO: handle exception
			testNGResults.put("2", new Object[] {"1", "nhap sai thong tin", "login that bai-1", "Fail"});
			Assert.assertTrue(false);
		}
		driver.close();
		
		
	}
	
	
	
	@Test(priority=2)
	public void test2() {

		try {
			
			WebDriverManager.chromedriver().setup();
			
			
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.navigate().refresh();
			
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME2);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD2);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			
			Thread.sleep(1000);
			testNGResults.put("3", new Object[] { "2", "nhap dung thong tin", "login thanh cong-2", "Pass" });
		
		} catch (Exception e) {
			// TODO: handle exception
			testNGResults.put("3", new Object[] {"2", "nhap sai thong tin", "login that bai-2", "Fail"});
			Assert.assertTrue(false);
		}
		
		driver.close();
	}

	@Test(priority=3)
	public void test3() {

		try {
			
			WebDriverManager.chromedriver().setup();
			
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.navigate().refresh();
			
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME2);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD2);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			
			Thread.sleep(1000);
			testNGResults.put("4", new Object[] { "3", "nhap dung thong tin", "login thanh cong-3", "Pass" });
		
		} catch (Exception e) {
			// TODO: handle exception
			testNGResults.put("4", new Object[] {"3", "nhap sai thong tin", "login that bai-3", "Fail"});
			Assert.assertTrue(false);
		}
		
		driver.close();
	}
	
	
	@BeforeClass
	public void suiteSetup() {
		WebDriverManager.chromedriver().setup();
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("TestNg Result");
		testNGResults = new LinkedHashMap<String, Object[]>();
		testNGResults.put("1", new Object[] { "test step no.", "action", "expect output", "actual output" });

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			throw new IllegalStateException("can't start web driver");
		}
		driver.close();
	}


	@AfterTest
	public void Writeclose() {
		Set<String> keyset = testNGResults.keySet();
		int rowNum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rowNum++);
			Object[] objArr = testNGResults.get(key);
			int cellNum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellNum++);
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof Boolean)
					cell.setCellValue((Boolean) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);

			}

		}

		try {
			FileOutputStream out = new FileOutputStream(new File("SaveResultToExcel.xls"));
			workbook.write(out);
			out.close();
			System.out.println("ghi thanh cong");

		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}