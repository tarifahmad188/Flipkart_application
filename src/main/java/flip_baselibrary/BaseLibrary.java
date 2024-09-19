package flip_baselibrary;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary 
{
public static WebDriver driver;

public void getLaunchUrl(String url)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Flipkart\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	
}

	
	
	
}
