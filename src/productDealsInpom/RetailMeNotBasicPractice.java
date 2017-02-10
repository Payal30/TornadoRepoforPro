package productDealsInpom;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RetailMeNotBasicPractice {

	//private static int i;

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.retailmenot.com/");
		
		driver.manage().window().maximize();
		
	//	String e =driver.findElement(By.xpath("//h1[text()='Save on Gifts While You Still Can']")).getText();
		
		//System.out.print(e);
		
		//  driver.findElement(By.xpath("//input[@name='query']")).click();
		// Select options = new Select(driver.findElement(arg0));
		
		
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys("jeans");
		
		driver.findElement(By.xpath(".//*[@id='search-form']/form/button")).click();
		
		
		 System.out.println(driver.findElements(By.xpath(".//a[@class='offer-title js-triggers-outclick']")).size());
		

		 WebElement js= driver.findElement(By.xpath(".//*[@id='offer-list']/li[1]"));
		System.out.println(js.getText());
		List<WebElement> e = driver.findElements(By.xpath(".//*[@id='offer-list']/li[1]"));
		//List<WebElement> e = driver.findElements(By.cssSelector(".//div[@id='offer-list']/li[1]"));
		//System.out.println((((List<WebElement>) e).contains("jeans")));
		System.out.println((e).size());
	
		for(int i=1;i<driver.findElements(By.xpath(".//a[@class='offer-title js-triggers-outclick']")).size();i++);
		{
			
			//System.out.println(driver.findElement(By.xpath(".//*[@id='offer-list']/li[1]")).getText());;
			int i;
			//System.out.println(driver.findElements(By.xpath(".//a[@class='offer-title js-triggers-outclick']")).get(i).getText());
			if(driver.findElements(By.xpath(".//a[@class='offer-title js-triggers-outclick']")).get(1) != null)contains("jeans");
			System.out.println(driver.findElements(By.xpath(".//a[@class='offer-title js-triggers-outclick']")).get(1).getText());
			//System.out.println(js1.getText());
			
			int actual=pp.getProductDealsCount();
			System.out.println(actual);
			int expected = 25;
			Assert.assertEquals(actual, expected);
			int actualCt=pp.getProductDealDetailCount();
			System.out.println(actualCt);
			int expectedCt = 1;
			Assert.assertEquals(actual, expected);
			System.out.println(pp.getProductDealDetailText());
			
		
		
	}

}

	private static void contains(String string) {
		// TODO Auto-generated method stub
		
	}}
