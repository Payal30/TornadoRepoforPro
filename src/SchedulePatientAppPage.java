import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SchedulePatientAppPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		driver.manage().window().maximize();
		String date="17-February-2017";
		String[] splitter=date.split("-");
		String month=splitter[1];
		String year=splitter[2];
		String days=splitter[0];
		WebElement e =driver.findElement(By.tagName("a"));
		Thread.sleep(3000);
		System.out.println(days);
		System.out.println(month);
		System.out.println(year);
		
				
		
		 driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		
		//driver.findElement(By.xpath("//td[1]/ul/li")).click();
		driver.findElement(By.xpath("//h4[text()='Dr.Saritha']/ancestor::ul/following-sibling::button")).click();
		driver.findElement(By.xpath("//button[@id='opener']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("myframe");
		e = driver.findElement(By.id("datepicker"));
		
		e.click();
		Thread.sleep(3000);
             List <WebElement> elements=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div/div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']"));
             List <WebElement> elems=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div/div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"));
          
//.sendKeys("02/08/2017");
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			System.out.println(elems.get(i).getText());
			//selecting month and year and comparing with given month and year
			if(elements.get(i).getText().equals(month)){
					
				System.out.println("----");
				List <WebElement> days1=driver.findElements(By.xpath("//div/table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
				for(WebElement e2:days1)
				{
				System.out.println(e2.getText());
				 if(e2.getText().equals(days)){
					 e2.click();
				 }
			
				
				}
		}
		//e.sendKeys("02/08/2017");
		Select dropdown = new Select(driver.findElement(By.cssSelector("#time")));
		dropdown.selectByVisibleText("11Am");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
		driver.findElement(By.cssSelector("#ChangeHeatName")).click();
		Thread.sleep(2000);
		WebElement element= driver.findElement(By.cssSelector("#sym"));
		
		element.clear();
		String desc = "Dizziness and headache. wanted to take appointment. Thank you";
		element.sendKeys(desc);
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
	List <WebElement> appTable= driver.findElements(By.xpath("//div[@class='panel panel-cascade']/div/table/tbody/tr"));
	 int appTableSize= appTable.size();
	 String newDt = month + "/" + days + "/" + year;
	 System.out.println("My new date is : " + newDt);
	 
	 i=0;
	 boolean found = false;
	 for(WebElement we:appTable){
		System.out.println("Position " + i + " : " + we.getText());
		String str = we.getText();
		
		//if(str.contains(newDt) && str.contains(desc) && str.contains("Saritha")){
		if(str.contains(desc) && str.contains("Saritha")){
			System.out.println("Scheduled appt verified");
			found = true;
			break;
		}
		i++;
	 }
	 
	 if( found == false){
		 System.out.println("Scheduled appt not verified");
	 }
				}}}

	
		
	

	