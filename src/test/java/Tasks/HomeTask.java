package Tasks;

import org.openqa.selenium.WebDriver;

import Validations.HomeValidation;

public class HomeTask {
	private WebDriver driver;
	private HomeValidation homeValidation;

	public HomeTask(WebDriver driver) {

		this.driver = driver;
		homeValidation = new HomeValidation(this.driver);

	}

	public void verificarHomePage() {
		homeValidation.validationHomePage();

	}

}
