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
		
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.espanhol().click();
		avianca.btnEnviar().click();
	}
	
	public void brasilEnglish() throws Exception{
		
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.english().click();
		avianca.btnEnviar().click();
	}
	
	public void brasilPortugues() throws Exception{
		
		avianca.selecao().click();
		avianca.brasil().click();
		avianca.portuguesPt().click();
		avianca.btnEnviar().click();
	}
	
	public void colombiaEspanhol() throws Exception{
		
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.espanhol().click();
		avianca.btnEnviar().click();
	}
	
	public void colombiaEnglish() throws Exception{
		
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.english().click();
		avianca.btnEnviar().click();
	}
	
	public void colombiaPortugues() throws Exception{
		
		avianca.selecao().click();
		avianca.colombia().click();
		avianca.portuguesPt().click();
		avianca.btnEnviar().click();
	}
	
	public void usaEspanhol() throws Exception{
		
		avianca.selecao().click();
		avianca.usa().click();
		avianca.espanhol().click();
		avianca.btnEnviar().click();
	}
	
	public void usaEnglish() throws Exception{
		
		avianca.selecao().click();
		avianca.usa().click();
		avianca.english().click();
		avianca.btnEnviar().click();
	}
	
	public void usaPortugues() throws Exception{
		
		avianca.selecao().click();
		avianca.usa().click();
		avianca.portuguesPt().click();
		avianca.btnEnviar().click();
	}
	
	public void outrosEspanhol() throws Exception{
		
		avianca.selecao().click();
		avianca.outros().click();
		avianca.espanhol().click();
		avianca.btnEnviar().click();
	}
	
	public void outrosEnglish() throws Exception{
		
		avianca.selecao().click();
		avianca.outros().click();
		avianca.english().click();
		avianca.btnEnviar().click();
	}
	
	public void outrosPortugues() throws Exception{
		
		avianca.selecao().click();
		avianca.outros().click();
		avianca.portuguesPt().click();
		avianca.btnEnviar().click();
	}
	
	public void takeScreenShot() throws Exception {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshots/Avianca.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage()) ;
		}		
	}

}
