package Selenium;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] choice= {"Cucumber" ,"Brocolli","Beetroot"};
		selectItems(driver,choice);
		//Explicit wait
		WebDriverWait w =new WebDriverWait(driver,5);		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='product-name']")));
		//FluentWait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class); 
	}
	public static void selectItems(WebDriver driver,String[] choice) {
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));
		/*
		 * for(WebElement choices:options) {
		 * 
		 * String products=choices.getText().split(" ")[0];
		 * 
		 * if(choices.getText().equals(choice)) {
		 * driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		 * break; } }
		 */
		for(int i=0;i<options.size();i++) {
			String products=options.get(i).getText();
			String[] itemsname=products.split("-");
			String formatedname=itemsname[0].trim();
			List items=Arrays.asList(choice);
			int j=0;
			if(items.contains(formatedname)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				j++;
				if(j==3) {
					break;
				}
			}
		}
	}
}
