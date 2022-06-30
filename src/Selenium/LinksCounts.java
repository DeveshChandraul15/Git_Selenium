package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCounts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int lst = driver.findElements(By.tagName("a")).size();
		System.out.println(lst);
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footercolumn = footer.findElement(By.xpath("//div[@id='gf-BIG']//tbody//tr//td[1]"));
		System.out.println(footercolumn.findElements(By.tagName("a")).size());
		int columnlinkcount = footercolumn.findElements(By.tagName("a")).size();

		// driver.quit();
		for (int i = 0; i < columnlinkcount; i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			while(itr.hasNext()){
			driver.switchTo().window(itr.next());
			String Title=driver.getTitle();
			System.out.println(Title);
			}
		}
	}

}
