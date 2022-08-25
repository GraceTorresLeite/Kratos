package com.spark.lms;

import org.junit.After;
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
	
	@Before
	public void iniciar() {
		url = "http://localhost:8080/";
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + ("\\driver\\chromedriver.exe"));
		driver = new ChromeDriver();
	}
	
	
	@After
	public void finalizar() {
		driver.close();	
	}

	@Test
	public void contextLoads() {
		driver.get(url);
		//login
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".btn")).click();
		
		//cadastrar um usuário
		driver.findElement(By.xpath("//a[contains(text(),'Members')]")).click();
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
		driver.findElement(By.cssSelector(".btn-success")).click();
	}
	

}
