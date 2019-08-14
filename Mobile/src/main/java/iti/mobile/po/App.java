package iti.mobile.po;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class App {
	public AppiumDriver<MobileElement> driver;
	
	public App(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	/*Metodos que recebem como parametro o valor do botão desejado 
	 * Ex: clicarNumero recebe String "Numero desejado" ou "6"
	 * Ex: clicarOperador recebe o nome dos operadores como descrito abaixo:
	 * + = plus
	 * - = minus
	 * * = multiply
	 * / = divide 
	 * DEL = delete
	 * = == equals
	 */
	public void clicarNumeros(String num) {
		driver.findElementByXPath("//android.widget.Button[contains(@text,'"+num+"')]").click();
	}
	
	public void clicarOperador(String operador) {
		driver.findElementByXPath("//android.widget.Button[@content-desc='"+operador+"']").click();
	}
	
	public String pegarResultado() {
		String text = driver.findElementById("com.android.calculator2:id/result").getText();
		return text;
	}
}
