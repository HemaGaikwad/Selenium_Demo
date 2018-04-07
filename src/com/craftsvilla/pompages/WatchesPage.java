package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class WatchesPage extends BasePage
{

	@FindBy(xpath= "//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-9292-MSHRE22099519020--Shreya_Collection-1476626570-Craftsvilla_1.jpg']")
	private WebElement product1 = null;
	
	public WatchesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void chooseProduct()
	{
		verifyElementPresent(product1);
		product1.click();
	}
	
	

}
