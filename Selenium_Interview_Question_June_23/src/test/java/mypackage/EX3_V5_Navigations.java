package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX3_V5_Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		//driver.close();
		

	}

}
