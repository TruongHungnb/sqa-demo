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
	String USERNAME2 = "admin";
	String PASSWORD2 = "1";
	String USERNAME3 = "1";
	String PASSWORD3 = "admin";
	String USERNAME4 = "admin";
	String PASSWORD4 = "";
	String USERNAME5 = "";
	String PASSWORD5 = "admin";
	String USERNAME6 = "";
	String PASSWORD6 = "";
	String USERNAME7 = " admin";
	String PASSWORD7 = "admin";
	String USERNAME8 = "admin";
	String PASSWORD8 = " admin";
	String USERNAME9 = "  ";
	String PASSWORD9 = "  ";
	
	Map<String, Object[]> testNGResults;
	HSSFWorkbook workbook;
	HSSFSheet sheet;

	@Test(priority = 1)
	public void LoginDungThongTin() {

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
			WebElement noti = driver.findElement(By.id("home-logged-message"));
			Assert.assertEquals(noti.getText(), "Bạn đang đăng nhập với tài khoản \"admin\".");
			if ((noti.getText()).equals("Bạn đang đăng nhập với tài khoản \"admin\".")) {
				testNGResults.put("2", new Object[] { "1", "Nhập đúng thông tin đăng nhập",
						"Bạn đang đăng nhập với tài khoản admin", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}

	@Test(priority = 2)
	public void LoginSaiPassword() {
		try {
//			WebDriverManager.chromedriver().setup();
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
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("3", new Object[] { "2", "Nhập sai Password",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}

	@Test(priority = 3)
	public void LoginSaiUsername() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME3);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD3);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("4", new Object[] { "3", "Nhập sai Username",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 4)
	public void KhongNhapUsername() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME4);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD4);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("5", new Object[] { "4", "Không nhập Username",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 5)
	public void KhongNhapPassword() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME5);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD5);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("6", new Object[] { "5", "Không nhập Password",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 6)
	public void KhongNhapUsernamePassword() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME6);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD6);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("7", new Object[] { "6", "Không nhập cả Username và Password",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 7)
	public void KhoangTrangTruocUsername() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME7);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD7);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("8", new Object[] { "7", "Trước Username có khoảng trắng",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 8)
	public void KhoangTrangTruocPassword() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME8);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD8);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("9", new Object[] { "8", " Trước Password có khoảng trắng",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	
	@Test(priority = 9)
	public void UsernamePasswordLaKhoangTrang() {

		try {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement taikhoan = driver.findElement(By.name("username"));
			taikhoan.sendKeys(USERNAME9);
			WebElement matkhau = driver.findElement(By.name("password"));
			matkhau.sendKeys(PASSWORD9);
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.className("alert-danger"));
			Assert.assertEquals(noti.getText(),
					"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.");
			if ((noti.getText())
					.equals("Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.")) {
				testNGResults.put("10", new Object[] { "9", "Username và Password là khoảng trắng",
						"Đăng nhập thất bại Vui lòng kiểm tra thông tin đăng nhập của bạn và đăng nhập lại.", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
	

	@Test(priority = 10)
	public void LoginWithRemember() {

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
			WebElement remember = driver.findElement(By.name("rememberMe"));
			remember.click();
			WebElement login = driver.findElement(By.className("btn-primary"));
			login.click();
			WebElement noti = driver.findElement(By.id("home-logged-message"));
			Assert.assertEquals(noti.getText(), "Bạn đang đăng nhập với tài khoản \"admin\".");
			if ((noti.getText()).equals("Bạn đang đăng nhập với tài khoản \"admin\".")) {
				testNGResults.put("11", new Object[] { "10", "Nhập đúng thông tin đăng nhập và Click nhớ mật khẩu",
						"Bạn đang đăng nhập với tài khoản admin", "Pass" });
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}

	
	
	@BeforeClass
	public void suiteSetup() {
		WebDriverManager.chromedriver().setup();
		workbook = new HSSFWorkbook();
		sheet = workbook.createSheet("TestNg Result");
		testNGResults = new LinkedHashMap<String, Object[]>();
		testNGResults.put("1", new Object[] { "STT", "Tên Testcase", "Kết quả mong muốn", "Kết quả" });

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
//	driver.close();
//	driver.quit();
	}

}