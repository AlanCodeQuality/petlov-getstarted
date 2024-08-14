package br.com.rocketskills.petlov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class Cadastro {

	@Test
	@DisplayName("Deve poder cadastrar um ponto de doaçao")
	void creatPoint() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://petlov.vercel.app/signup");

		WebElement title = driver.findElement(By.cssSelector("h1"));

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(d -> title.isDisplayed());


		assertEquals("Cadastro de ponto de doação", title.getText(), "Verificando o Slogan");
		
		WebElement name = driver.findElement(By.cssSelector("input[placeholder='Nome do ponto de doação']"));
		name.sendKeys("Point doação");

		WebElement email = driver.findElement(By.cssSelector("input[name=email]"));
		email.sendKeys("pointdoação@gmail.com");

		WebElement cep = driver.findElement(By.cssSelector("input[name=cep]"));
		cep.sendKeys("63800000");

		WebElement cepButton = driver.findElement(By.cssSelector("input[value='Buscar CEP']"));
		cepButton.click();

		WebElement number = driver.findElement(By.cssSelector("input[name='addressNumber']"));
		number.sendKeys("3520");

		WebElement details = driver.findElement(By.cssSelector("input[name='addressDetails']"));
		details.sendKeys("casa");



		
		

		
	}
}
