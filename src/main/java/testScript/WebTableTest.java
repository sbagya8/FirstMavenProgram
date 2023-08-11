package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
		String strSalary=driver.findElement(
				By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[5]")).getText();
		System.out.println(strSalary);
	//	String position=driver.findElement(((WebElement) with(By.tagName("td"))
				//.toRightOf(By.xpath( "//td[contains(text(),'B. Wagner')]" ))).getText();
	//	System.out.println("position...."+position);
		
		
				
				
	}

	
	}


