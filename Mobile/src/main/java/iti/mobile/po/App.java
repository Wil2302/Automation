package iti.mobile.po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class App {
	
	protected AppiumDriver<MobileElement> driver;
	
	// Id ou Xpath para interagir com botôes
	
	@AndroidBy( id = "	//android.widget.Button[@content-desc=\"divide\"]")
	public MobileElement btnDividir;
	
	@AndroidBy( id = "//android.widget.Button[@content-desc=\"multiply\"]")
	public MobileElement btnMultiplicar;
	
	@AndroidBy( id = "//android.widget.Button[@content-desc='minus']")
	public MobileElement btnSubtrair;
	
	@AndroidBy( xpath = "//android.widget.Button[@content-desc='plus']")
	public MobileElement btnSomar;
	
	@AndroidBy( xpath = "//android.widget.Button[@content-desc='equals']")
	public MobileElement btnIgual;
	
	@AndroidBy( id = "com.android.calculator2:id/result")
	public MobileElement lblResult;
	
	public App(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void clicarNumeros(String num) {
		driver.findElementByXPath("//android.widget.Button[contains(@text,'"+num+"')]").click();
	}
}
