package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX5_V7_getTestVSgetAttribte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement str1=driver.findElement(By.xpath("//input[@id='Email']"));
		/*
		 * String s1=str1.getAttribute(value); System.out.println();
		 */
		
		/*
		 * str1.clear(); str1.sendKeys("shambhuk260@gmail.com");
		 */
		
		/*
		 * String s1=str1.getAttribute("value"); System.out.println(s1);
		 */
		
		String str2=driver.findElement(By.xpath("//button[normalize-space()='Log in']")).getText();
		System.out.println(str2);
		driver.close();
		

	}

}
