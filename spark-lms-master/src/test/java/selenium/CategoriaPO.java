package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriaPO {
	
	private WebDriver driver;

	public CategoriaPO(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	
	public void camposCategoria() {	
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Add New')])[2]")).click();
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Automação");
		driver.findElement(By.id("shortName")).click();
		driver.findElement(By.id("shortName")).sendKeys("TI");
		driver.findElement(By.id("notes")).sendKeys("DISPONIVEL");
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.xpath("//button[@class=\'btn btn-success\']")).click();
		//driver.findElement(By.className("btn btn-success")).click();//button[@class="btn btn-success"]
		//driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div/div[2]/form/div[5]/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	}
	
	public WebElement alertaCategoriaSalvo() {
		return this.driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div/div[2]/div"));
	}
	
}
