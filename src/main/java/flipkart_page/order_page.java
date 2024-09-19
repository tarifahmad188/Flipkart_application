package flipkart_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flip_baselibrary.BaseLibrary;

public class order_page extends BaseLibrary
{

	public order_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@autocomplete=\"off\"]")
	private WebElement search;
	
	@FindBy(xpath="//*[@viewBox=\"0 0 24 24\"]")
	private WebElement searchproduct;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement selectmobile;
	
	
	//for git
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement selectmobile1;
	
	
	public void clickonSearch()
	{
		search.click();
		search.sendKeys("iphone 15 pro max");
		searchproduct.click();
	}
	
    public void selectMobile()
    {
    	selectmobile.click();
    }
	
}
