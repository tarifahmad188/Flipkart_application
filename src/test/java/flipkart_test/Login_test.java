package flipkart_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flip_baselibrary.BaseLibrary;
import flipkart_page.Login_page;

public class Login_test extends BaseLibrary
{
	
	Login_page ob;
	
    @BeforeTest
	public void getLaunchUrl()
	{
		getLaunchUrl("https://www.flipkart.com/");
		ob=new Login_page();
	}
		@Test
		public void getTitle_flipkart()
		{
			ob.getTitle_flipkart();
		}
		
    
    
		
	}

