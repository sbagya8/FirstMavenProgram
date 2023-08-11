package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest 
{
	public static void main (String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement srcBox= driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		Thread.sleep(2000);
		List<WebElement> items= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println(" no of items ="+items);
		for(int i=0;i<items.size();i++)
		{
		System.out.println(items.get(i).getText());
		if(items.get(i).getText().equalsIgnoreCase("java tutorial pdf"))
		{
			items.get(i).click();
			break;
		}
		}
		//srcBox.sendKeys(Keys.ENTER);
		//String strTitle=driver.getTitle();
		//System.out.println("page title"+ strTitle);
		//driver.close();
		
		
		
		
		
		
		
	}

}
