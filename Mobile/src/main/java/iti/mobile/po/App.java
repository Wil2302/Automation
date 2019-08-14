package iti.mobile.po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class App {
	
	protected AppiumDriver<MobileElement> driver;
	
	public App(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='7']/android.widget.ImageView")
	public MobileElement btnNumero;
	
	
	public void clicarNumros(String num) {
		driver.findElementByXPath("//android.widget.Button[contains(@text,'"+num+"')]").click();
	
	}
}
