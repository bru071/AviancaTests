package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectAvianca 
{
	WebDriver driver;
	By SELECTOR_FIELD=By.xpath("//div[@class='language pull-left']");
	By BRASIL = By.xpath("//div[@class='bloco-country hidden-xs']//div[1]");
	By COLOMBIA_COP = By.xpath("//div[@class='bloco-country hidden-xs']//div[2]");
	By USA_USD = By.xpath("//div[@class='country-modal col-sm-6 col-xs-12']//div[3]");
	By OUTROS_USD = By.xpath("//div[@id='configs-redirects']//div[4]");	
	By ESPANHOL = By.xpath("//label[@for= 'es_ES']");
	By ENGLISH = By.xpath("//label[@for= 'en_US']");
	By PORTUGUES_BR = By.xpath("//label[@for= 'pt_BR']");
	By BTN_ENVIAR = By.xpath("//button[contains(@class,'modal-red-btn hidden-xs')]");
	By BTN_FECHAR = By.xpath("//div[@id = 'boton-cerrar']");
	
	
	public PageObjectAvianca(WebDriver driver){
		
		this.driver=driver;
	}
	
	public  WebElement selecao(){
		
		return driver.findElement(SELECTOR_FIELD);
	}	
	
	
	public  WebElement brasil(){
	
		return driver.findElement(BRASIL);
	}
	
	public  WebElement colombia(){
		
		return driver.findElement(COLOMBIA_COP);
	}
	
	
	public WebElement usa(){
		
		return driver.findElement(USA_USD);	
	}
	
	
	public WebElement espanhol(){
		
		return driver.findElement(ESPANHOL);	
	}
	
	public WebElement english(){
		
		return driver.findElement(ENGLISH);	
	}
	
	
	public WebElement portuguesPt(){
		
		return driver.findElement(PORTUGUES_BR);	
	}
	
	public WebElement outros(){
		
		return driver.findElement(OUTROS_USD);	
	}
	
	public WebElement btnEnviar(){
		
		return driver.findElement(BTN_ENVIAR);	
	}
	
	public WebElement btnFechar(){
		
		return driver.findElement(BTN_FECHAR);	
	}
	
	
}
