package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX4_V6_FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");

		/*
		 * //1 WebElement
		 * searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 * searchbox.sendKeys("xyz");
		 */

		/*
		 * //2 WebElement footerElementSize=
		 * driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 * 
		 * System.out.println(footerElementSize.getText());
		 * 
		 * //3
		 * 
		 * WebElement searchButton=driver.findElement(By.xpath(
		 * "//button[normalize-space()='login']"));
		 */

		// findElements()---------Returns multiple web Element

		/*
		 * int
		 * links=driver.findElements(By.xpath("//div[@class='footer-upper']//a")).size()
		 * ; System.out.println(links);
		 */

		/*
		 * List<WebElement>
		 * links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		 * for(WebElement str1 : links) { System.out.println(str1.getText()); }
		 */
		// System.out.println(links.size());

		/*
		 * List<WebElement> logo=
		 * driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		 * System.out.println(logo.size());
		 */

		List<WebElement> electronicImges = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));

		System.out.println(electronicImges.size());
		driver.close();

	}

}
