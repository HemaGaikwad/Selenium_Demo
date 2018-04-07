package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class AccessoriesProductPage extends BasePage
{
	public AccessoriesProductPage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessories = null;
	

	@FindBy(linkText="Watches")
	private WebElement watches = null;
	
	@FindBy(linkText = "Wallets")
	private WebElement wallets = null;
	
	public void gotoAccessories()
	{
		mouseHover(driver, accessories);
	}
	
	public void goToWatches()
	{
		verifyElementPresent(watches);
		watches.click();
	}
}
