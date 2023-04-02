package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class GenericPage {

	private WebDriver driver;
	private Waits wait;
	public GenericPage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getHomeLogin() {

		return driver.findElement(
				By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[@class='active']/a[text()='Login']"));
	}

	public WebElement getHomeNewUser() {

		return driver.findElement(
				By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[@class='active']/a[text()='Novo usuário?']"));
	}

	// Espera carregar pagina
	public WebElement getSeuBarrigaLogo() {
		return wait.visibilityOfElement(By.xpath("//div[@class='navbar-header']/a"));
	}
}
