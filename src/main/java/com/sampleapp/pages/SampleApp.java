package com.sampleapp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleApp {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(name="1")
	private WebElement one;
	@FindBy(name="2")
	private WebElement two;
	@FindBy(name="3")
	private WebElement three;
	@FindBy(name="4")
	private WebElement four;
	@FindBy(name="5")
	private WebElement five;
	@FindBy(name="6")
	private WebElement six;
	@FindBy(name="7")
	private WebElement seven;
	@FindBy(name="8")
	private WebElement eight;
	@FindBy(name="9")
	private WebElement nine;
	@FindBy(name="0")
	private WebElement zero;
	@FindBy(name="+")
	private WebElement plus;
	@FindBy(name="-")
	private WebElement minus;
	@FindBy(name="=")
	private WebElement equalto;
	@FindBy(className="android.widget.EditText")
	private WebElement result;

	public SampleApp(WebDriver driver){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void doAddition(){
		this.one.click();
		this.plus.click();
		this.two.click();
		this.equalto.click();

	}
	public int getResult(){
		int result = Integer.parseInt(this.result.getText());
		return result;
	}
}
