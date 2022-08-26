package cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCucumber {
	public static WebDriver obj;
	
	@Given("Eu quero acessar a livraria")
	public void eu_quero_acessar_a_livraria() {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
		obj=new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("http://localhost:8080");	    
	    
	}
		
	@When("Eu digito meus dados")
	public void eu_digito_meus_dados() {
		obj.findElement(By.name("username")).sendKeys("admin");
		obj.findElement(By.name("password")).sendKeys("admin");
		obj.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/a")).click();
	   
	}
	@Then("terei habilidade de manipular minhas escolhas")
	public void terei_habilidade_de_manipular_minhas_escolhas() {
		Assert.assertEquals("Kratos - Gama", obj.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/a/span")).getText());
	  
	}

}
