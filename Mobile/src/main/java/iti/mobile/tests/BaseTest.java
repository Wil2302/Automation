package iti.mobile.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import iti.mobile.utils.Capabilities;

public class BaseTest {

	
	
	
	
	
	@Before
	public void abrirApp() throws MalformedURLException {
		URL remoteUrl = new URL ("http://localhost:4723/wd/hub");
		Capabilities mobileCapabilitie = new Capabilities();
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(remoteUrl, mobileCapabilitie.getCapabilities());
	}
	
	public void inicializaClasses() {
		
	}
	
	
	
	@After
	public void fecharApp() {
	}

}
