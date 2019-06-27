package TestAvianca;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Iteracao.SelecaoPaisIdioma;

public class AviancaTest  
{
	private static WebDriver driver;
	private static SelecaoPaisIdioma selecao;
	
	
	@BeforeSuite
	public static void configure(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\634111\\git\\Avianca\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		//ops.setHeadless(true);
		ops.setAcceptInsecureCerts(true);
		ops.addArguments("--no-sandbox");
		ops.addArguments("--disable-gpu");
		
		driver = new ChromeDriver(ops);
		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		selecao = new SelecaoPaisIdioma(driver);
		
	}
	
	@BeforeMethod
	public static void startTest(){	
		driver.get("https://www.avianca.com.br/");
	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();
		driver.quit();
		
	}	


	@Test(priority=1)
	public void selecionaBrasilEspanhol() throws Exception {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Brasil - R$ com idioma Espanhol
		 */		
		selecao.brasilEspanhol();
		//Assert.assertTrue(true, "Teste passou");
		
	
	}
	
	@Test(priority=2)
	public void selecionaBrasilEnglish() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Brasil - R$ com idioma English
		 */
		selecao.brasilEnglish();

			
	}
	
	@Test(priority=3)
	public void selecionaBrasilPortugues() throws Exception {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Brasil - R$ com idioma Portugues
		 */
		selecao.brasilPortugues();
		
		
	}
	
	@Test(priority=4)
	public void selecionaColombiaEspanhol() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Colômbia - COP com idioma Espanhol
		 */
		selecao.colombiaEspanhol();
		
		
	}
	
	@Test(priority=5)
	public void selecionaColombiaEnglish() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Colômbia - COP com idioma English
		 */
		selecao.colombiaEnglish();
	
		
	}
	
	@Test(priority=6)
	public void selecionaColombiaPortugues() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Colômbia - COP com idioma Portugues
		 */
		selecao.colombiaPortugues();
			
		
	}
	
	@Test(priority=7)
	public void selecionaUSAEspanhol() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Estados Unidos - USD com idioma Espanhol
		 */
		selecao.usaEspanhol();
		
		
	}
	
	@Test(priority=8)
	public void selecionaUSAEnglish() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Estados Unidos - USD com idioma English
		 */
		selecao.usaEnglish();
		
		
	}
	
	@Test(priority=9)
	public void selecionaUSAPortugues() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de Estados Unidos - USD com idioma Portugues
		 */
		selecao.usaPortugues();
		
		
	}
	
	@Test(priority=10)
	public void selecionaOUTROSEspanhol() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de OUTROS - USD com idioma Espanhol
		 */
		selecao.outrosEspanhol();
		
		
	}
	
	@Test(priority=11)
	public void selecionaOUTROSEnglish() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de OUTROS - USD com idioma English
		 */

		selecao.outrosEnglish();

		
	}
	
	@Test(priority=12)
	public void selecionaOUTROSPortugues() throws Exception  {
		/**
		 * @author Bruno de Melo Silva Teste: Validar o click no campo de selecao de OUTROS - USD com idioma Portugues
		 */

		selecao.outrosPortugues();
	
		
	}
	
	
}
