package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement> num = driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']//tr//td[4]"));
		int sum=0;
		for(int i=0;i<num.size();i++) {
			sum=sum+Integer.parseInt(driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']//tr//td[4]")).get(i).getText());
			
		}
		System.out.println(sum);
	}

}
