package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// Menu Home
	public WebElement getMenuHomeInput() {
		return driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li[@class='active']/a"));
	}

	// Texto Home
	public WebElement getTextHomeInput() {
		return driver.findElement(By.xpath("//body/footer/span"));
	}

}
