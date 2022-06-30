package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParseString {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String password=getPassword(driver);
		driver.get("");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	public static String getPassword(WebDriver driver) {
		String Temp=driver.findElement(By.xpath("//div[text()='Need an account? ']")).getText();
		String[] Pass=Temp.split(" ");
		String orgpass=Pass[2];
		return orgpass;
	}
}
