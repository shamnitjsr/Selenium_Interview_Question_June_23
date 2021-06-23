package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX6_V8_HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drp=driver.findElement(By.xpath("//select[@id='input-country']"));
		Select s3=new Select(drp);
		s3.selectByIndex(5);
		s3.selectByVisibleText("India");
		s3.selectByValue("Denmark");
		
		int no_of_option=s3.getOptions().size();
		List<WebElement> ee=s3.getOptions();
		//System.out.println(no_of_option);
		
		for(WebElement options: ee)
		{
			if(options.getText().equals("India"))
			{
				options.click();
				break;
			}
		}
		driver.close();

	}

}
