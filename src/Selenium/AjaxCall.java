package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AjaxCall {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//mouse Hover
		WebElement ele =driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		// Dropdown Select
		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select =new Select(drop);
		select.selectByIndex(1);
		
		// context Click
		a.contextClick(ele).build().perform();
		//Capital letters	
		a.moveToElement(driver.findElement(By.xpath(""))).click().keyDown(Keys.SHIFT).sendKeys("").doubleClick().build().perform();
	}

}
