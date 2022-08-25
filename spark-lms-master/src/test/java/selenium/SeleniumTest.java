package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SeleniumTest {
	
	String url;
	WebDriver driver; 
	LoginPO login;
	CategoriaPO categoria;
	
	@Before
	public void iniciar() {
		url = "http://localhost:8080/";
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	
	@After
	public void finalizar() {
		driver.close();	
	}

	@Test
	public void logar() throws InterruptedException {
		login = new LoginPO(driver);
		driver.get(url);

		login.camposLogin();		
		Thread.sleep(3000);
				
		Assert.assertEquals("Kratos - Gama", login.paginaCarregada().getText());
		
		//cadastrar um usuário
	/*	driver.findElement(By.xpath("//a[contains(text(),'Members')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		driver.findElement(By.id("type")).click();
		WebElement selectElement = driver.findElement(By.id("type"));
		Select selectObject = new Select(selectElement);
		selectObject.selectByValue("Student");
		driver.findElement(By.id("firstName")).click();
		driver.findElement(By.id("firstName")).sendKeys("Juliana");
		driver.findElement(By.id("middleName")).click();
		driver.findElement(By.id("middleName")).sendKeys("Pereira");
		driver.findElement(By.id("gender")).click();
		WebElement selectElement2 = driver.findElement(By.id("gender"));
		Select selectObject2 = new Select(selectElement);
		selectObject2.selectByIndex(2);
		driver.findElement(By.id("dateOfBirth")).click();
		driver.findElement(By.id("dateOfBirth")).sendKeys("15May1993");
		driver.findElement(By.id("saveBtn")).click();
		
		//adicionar categoria de livro
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Add New')])[2]")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Automação");
		driver.findElement(By.id("shortName")).click();
		driver.findElement(By.id("shortName")).sendKeys("Automação");
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		//cadastrar livro
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Add New')])[3]")).click();
		driver.findElement(By.id("category-selectbox")).click();
		WebElement selectElement3 = driver.findElement(By.id("category-selectbox"));
		Select selectObject3 = new Select(selectElement);
		selectObject2.selectByIndex(1);
		driver.findElement(By.id("tag")).click();
		driver.findElement(By.id("tag")).sendKeys("Testes");
		driver.findElement(By.id("title")).click();
		driver.findElement(By.id("title")).sendKeys("Automação de Testes com Selenium");
		driver.findElement(By.id("authors")).click();
		driver.findElement(By.id("authors")).sendKeys("Gama Academy");
		driver.findElement(By.cssSelector(".btn-success")).click();*/
	}
	@Test
	public void cadastraCategoriaLivro() throws InterruptedException {
		//NAO LOCALIZA BOTAO SALVAR
		login = new LoginPO(driver);
		driver.get(url);
		login.camposLogin();
		
		/*categoria = new CategoriaPO(driver);
		categoria.camposCategoria();
		Thread.sleep(3000);
		
		Assert.assertEquals("automaçao' is added as a new category.", categoria.alertaCategoriaSalvo().getText());*/
		
	}
}
