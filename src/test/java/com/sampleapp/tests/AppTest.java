package com.sampleapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sampleapp.pages.SampleApp;
import com.tests.BaseTest;

public class AppTest extends BaseTest{
	
	@Test
    public void search(String keyword){
		SampleApp sampleApp = new SampleApp(driver);
		sampleApp.doAddition();
		int sum = sampleApp.getResult();
		Assert.assertTrue(sum == 3);
		
    }


}
