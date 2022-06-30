package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1])")).click();
		driver.findElement(By.xpath("(//div[text()='Chennai'])[1]")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("")).getAttribute("style").contains("1")) {
			System.out.println("is enabled");
			Assert.assertTrue(false);
		}else {
			System.out.println("is disabled");
			Assert.assertFalse(false);
		}
		
		driver.findElement(By.xpath("")).click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='ccss-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'//div]"));
		for(WebElement ops:options) {
			if(ops.getText().equals("Chennai")) {
				ops.click();
				break;
			}
		}
	}

}
