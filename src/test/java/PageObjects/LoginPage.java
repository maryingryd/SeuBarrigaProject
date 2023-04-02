package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class LoginPage {
	// https://seubarriga.wcaquino.me/login
	private WebDriver driver;
	private Waits wait;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Aba Menu Login
	public WebElement getMenuLoginInput() {
		return driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[@class='active']/a[text()='Login']"));
	}

	// Campo E-mail
	public WebElement getEmailInput() {
		return driver.findElement(By.id("email"));
	}
	
	// Campo E-mail
	public WebElement getFormLoginEmailInput() {
		return driver.findElement(By.xpath("//form[@action='/logar']/div/input[@type='email']"));
	}
	
	//Espera por campo e-mail 
	public WebElement getWaitEmail() {
		return wait.visibilityOfElement(By.id("email"));
	}

	// Campo Senha
	public WebElement getPasswordInput() {
		return driver.findElement(By.id("senha"));
	}

	// Botão Entrar
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//div[@class='jumbotron col-lg-4']/form/button[text()='Entrar']"));
	}
	
}