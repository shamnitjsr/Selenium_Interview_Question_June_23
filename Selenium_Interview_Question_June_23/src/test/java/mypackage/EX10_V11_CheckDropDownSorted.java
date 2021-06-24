package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX10_V11_CheckDropDownSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpElement);
		List<WebElement> options= drpselect.getOptions();
		
		ArrayList originalList=new ArrayList();
		ArrayList tempList=new ArrayList();
		for(WebElement option:options)
		{
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		System.out.println(originalList);
		System.out.println(tempList);
		Collections.sort(tempList);
		System.out.println(originalList);
		System.out.println("TempList After sorting:::"+tempList);
		if(originalList.equals(tempList))
		{
			System.out.println("SortedOrder");
		}
		else
		{
			System.out.println("Unsoreted Order");
		}
		
		
		

	}

}
