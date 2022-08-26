package cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.LoginPO;
import selenium.SeleniumTest;

public class LoginCucumber {
	
	@Autowired
	protected SeleniumTest teste;
	@Autowired
	protected LoginPO login;
	
	WebDriver driver; 
	
	@Given("Eu quero acessar a livraria")
	public void eu_quero_acessar_a_livraria() {
		
	}
		
	@When("Eu digito meus dados")
	public void eu_digito_meus_dados() {
		teste.iniciar(driver);
		login = new LoginPO(driver);
	}
	@Then("terei habilidade de manipular minhas escolhas")
	public void terei_habilidade_de_manipular_minhas_escolhas() {
		Assert.assertEquals("Kratos - Gama", login.paginaCarregada().getText());
	}

}
