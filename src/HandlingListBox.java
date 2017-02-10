import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dayW= driver.findElement(By.id("day"));
		
		WebElement monthW= driver.findElement(By.id("month"));
		 
		WebElement yearW= driver.findElement(By.id("year"));
		 
		 
		 Select daySelect = new Select(dayW);
		 
		 Select monthSelect = new Select(monthW);
		 
		 Select yearSelect = new Select(yearW);
		 
		 daySelect.selectByValue("5");
		 
		 monthSelect.selectByValue("1");
		 
		 yearSelect.selectByValue("2001");
		 
		 
		List<WebElement> optionList = daySelect.getOptions();
		
		List<WebElement> optionList1 = monthSelect.getOptions();
		List<WebElement> optionList2 = yearSelect.getOptions();
		
		int d =optionList.size();
		int m =optionList1.size();
		int y =optionList2.size();
		System.out.println(d);
		System.out.println(m);
		System.out.println(y);
		
		
	}

}
