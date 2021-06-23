package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX2_V4_StatusofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//isDisplayed----isEnabled----isSelected
		
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		
		System.out.println("Display Status:::"+searchStore.isDisplayed());
		System.out.println("Enable Status::::"+searchStore.isEnabled());
		
		WebElement statusCheckBox=driver.findElement(By.xpath("//input[@id='Newsletter']"));
		
		System.out.println("CheckBox Status:::"+statusCheckBox.isSelected());
		
		
		driver.close();

	}

}
