package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX7_V8_HandleMultipleDropDowns {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		/*
		 * Select noOfEmpsdrp=new Select(driver.findElement(By.name("NoOfEmployees")));
		 * Select industrydrp=new Select(driver.findElement(By.name("Industry")));
		 * Select countrydrp=new Select(driver.findElement(By.name("Country")));
		 */
		
		WebElement noOfEmpsdrp=driver.findElement(By.name("NoOfEmployees"));
		WebElement industrydrp=driver.findElement(By.name("Industry"));
		WebElement countrydrp =driver.findElement(By.name("Country"));
		
		selectOptionFromDropDown(noOfEmpsdrp,"16 - 20");
		selectOptionFromDropDown(industrydrp,"Healthcare");
		selectOptionFromDropDown(countrydrp,"Ghana");
		
		driver.close();
	}
		
		
		
		public static void selectOptionFromDropDown(WebElement ele,String value)
		{
			Select drp=new Select(ele);
			List<WebElement> options=drp.getOptions();
			for(WebElement options1 : options)
			{
				if(options1.getText().equals(value))
				{
					options1.click();
					break;
				}
			}
			
			
		}
		
		
		

	}


