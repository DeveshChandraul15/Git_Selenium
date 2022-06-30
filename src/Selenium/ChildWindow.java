package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String Parentid =it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		
		//frames
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.xpath(""));
		WebElement target=driver.findElement(By.xpath(""));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
	}

}
