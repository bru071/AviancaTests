package Iteracao;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObject.PageObjectAvianca;

public class SelecaoPaisIdioma {
	
	private static PageObjectAvianca avianca;
	private static WebDriver driver;
	
	
	
	public SelecaoPaisIdioma(WebDriver driver) {
		avianca = new PageObjectAvianca(driver);
		this.driver =  driver;
	}

	public void brasilEspanhol() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.espanhol().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void brasilEnglish() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.english().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void brasilPortugues() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.portuguesPt().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void colombiaEspanhol() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.espanhol().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void colombiaEnglish() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.english().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void colombiaPortugues() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.portuguesPt().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void usaEspanhol() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.usa().click();
		avianca.espanhol().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void usaEnglish() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.usa().click();
		avianca.english().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void usaPortugues() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.usa().click();
		avianca.portuguesPt().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void outrosEspanhol() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.outros().click();
		avianca.espanhol().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void outrosEnglish() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.outros().click();
		avianca.english().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void outrosPortugues() throws Exception{
		
		avianca.takeScreenShot("C://Screenshots/screenshot_before_select.png");
		avianca.selecao().click();
		avianca.outros().click();
		avianca.portuguesPt().click();
		avianca.takeScreenShot("C://Screenshots/screenshot_before.png");
		avianca.btnEnviar().click();
		Thread.sleep(5000);
		avianca.takeScreenShot("C://Screenshots/screenshot_after.png");
	}
	
	public void validaBrasilEspanhol() throws Exception{
		
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.espanhol().click();
	}
	
	
	
		
	}


