package iti.mobile.tests;

import org.junit.Assert;
import org.junit.Test;

public class TestSoma extends BaseTest{

	@Test
	public void testeSoma() {
		inicializaClasses();
		baseApp.clicarNumeros("2");
		baseApp.btnSomar.click();
		baseApp.clicarNumeros("3");
		baseApp.btnIgual.click();
		Assert.assertEquals("5", baseApp.lblResult.getText());
	}
	
	@Test
	public void testeSubtraçao() {
		inicializaClasses();
		baseApp.clicarNumeros("5");
		baseApp.btnSubtrair.click();
		baseApp.clicarNumeros("3");
		baseApp.btnIgual.click();
		Assert.assertEquals("2", baseApp.lblResult.getText());
	}
}
