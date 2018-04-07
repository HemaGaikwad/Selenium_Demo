package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.AccessoriesProductPage;
import com.craftsvilla.pompages.ProductDetailsPage;
import com.craftsvilla.pompages.WatchesPage;

//Scenario to buy watch
public class WatchesScripts extends BaseTest
{
	public AccessoriesProductPage ap  = null;
	public WatchesPage wp = null;
	public ProductDetailsPage pd = null;
	
	@Test
	public void buyWatch()
	{
		ap = new AccessoriesProductPage(driver);
		wp = new WatchesPage(driver);
		pd = new ProductDetailsPage(driver);
		
		ap.gotoAccessories();
		ap.goToWatches();
		wp.chooseProduct();
		pd.buyNow();
		Assert.fail();
	}
	

}
