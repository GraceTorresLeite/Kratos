package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPO {
	
	private WebDriver driver;

	public LoginPO(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	
	public void camposLogin() {	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/a")).click();
	}
	
	public WebElement paginaCarregada() {
		return this.driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/a/span"));
	}
	

}
