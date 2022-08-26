package cucumber.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutorCucumber {
		
	public static WebDriver obj;
	
	public static CategoriaCucumber categoria;
	
	@When("Eu escolho o livro por autor")
	public void eu_escolho_o_livro_por_autor() {
		//categoria.eu_logada_no_site(); ERRO NULLPOINTEREXCEPTION
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
		obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://localhost:8080");
		obj.findElement(By.name("username")).sendKeys("admin");
		obj.findElement(By.name("password")).sendKeys("admin");
		obj.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/a")).click();
		
		obj.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		obj.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		obj.findElement(By.xpath("(//a[contains(text(),'List')])[3]")).click();
		obj.findElement(By.xpath("//input[@type='search']")).click();
		obj.findElement(By.xpath("//input[@type='search']")).sendKeys("Mauricio Aniche");
	}
	@Then("terei a visualização do livro desejado por autor")
	public void terei_a_visualização_do_livro_desejado_por_autor() {
		Assert.assertEquals("Mauricio Aniche", obj.findElement(By.xpath("//table[@id='datatable']/tbody/tr/td[4]")).getText());
	}

}
