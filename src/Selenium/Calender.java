package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		/*
		 * List<WebElement>
		 * Dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']"
		 * )); for(int i=0;i<Dates.size();i++) { String Date=Dates.get(i).getText();
		 * if(Date.equals("24")){
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click(
		 * ); break; } }
		 */
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td[contains(@data-handler,'selectDay')]"));
		for(int i=0;i<dates.size();i++) {
			String date=dates.get(i).getText();
			if(date.equalsIgnoreCase("24")) {
				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td[contains(@data-handler,'selectDay')]")).get(i).click();
			}
		}
	}

}
