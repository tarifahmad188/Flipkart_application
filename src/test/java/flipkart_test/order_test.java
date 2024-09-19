package flipkart_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flip_baselibrary.BaseLibrary;

import flipkart_page.order_page;

public class order_test extends BaseLibrary
{
order_page ob;
@BeforeTest
public void getLaunchUrl() throws InterruptedException
{
	getLaunchUrl("https://www.flipkart.com/");
	ob=new order_page();
}
@Test(priority=0)
public void clickOnSearch()
{
	ob.clickonSearch();
}
	@Test(priority=1)
	public void selectMobile()
	{
		ob.selectMobile();
	}
	
	
}
