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
		
		
	}
	
	@Test
	public void pesquisaAutor() throws InterruptedException {
		login = new LoginPO(driver);
		driver.get(url);
		login.camposLogin();
		
		//pesquisar livro por autor
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'List')])[3]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("fulano");
		
		Assert.assertEquals("fulano", driver.findElement(By.xpath("//table[@id='datatable']/tbody/tr/td[4]")).getText());
		
	}
	
	
	@Test
	public void pesquisaCategoria() throws InterruptedException {
		login = new LoginPO(driver);
		driver.get(url);
		login.camposLogin();
		
		//pesquisar livro por categoria
		driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'List')])[3]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("O sapo do rio");
		Assert.assertEquals("O sapo do rio", driver.findElement(By.xpath("//table[@id='datatable']/tbody/tr/td[3]")).getText());
		
	}
}
