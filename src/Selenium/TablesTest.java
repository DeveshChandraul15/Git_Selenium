package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String before_xpath = "//table[@class='table-display']/tbody/tr[";
		String after_xpath = "]/td[3]";
		for (int i = 0; i <= 10; i++) {
			String name="driver.findElement(By.xpath(before_xpath + i + after_xpath))";
			driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[" + i + "]/td[3]")).click();
			if(name.contains("")) {
				
			}
		}
	}

}
