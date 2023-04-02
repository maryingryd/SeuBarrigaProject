package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import PageObjects.NewUserPage;
import Validations.GenericValidation;
import Validations.NewUserValidation;

public class NewUserTask {
	private WebDriver driver;
	private NewUserPage newUserPage;
	private NewUserValidation newUserValidation;
	private FakersGeneration fakersGeneration;
	private LoginPage loginPage;
	private Waits wait;
	
	public NewUserTask(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
		loginPage = new LoginPage(this.driver);
		newUserPage = new NewUserPage(this.driver);
		newUserValidation = new NewUserValidation(this.driver);
		new GenericValidation(this.driver);
		fakersGeneration = new FakersGeneration();
	}
	//Metodo preencher cadastro
	public void occupyRegistrer() {
		newUserPage.getMenuNewUserInput();
		newUserPage.getMenuNewUserInput().click();
		newUserValidation.validationNewUserPage(); 
		newUserPage.getEmailInput().click();
		String name = fakersGeneration.getFullName();
		String email= fakersGeneration.getEmailAddress();
		String password= fakersGeneration.getPassword();
		FileOperation.setProperties("form", "name", name);
		FileOperation.setProperties("form", "email", email);
		FileOperation.setProperties("form", "password", password);
		newUserPage.getNameInput().sendKeys(name);
		newUserPage.getEmailInput().sendKeys(email);
		newUserPage.getPasswordInput().sendKeys(password);
		newUserPage.getRegistrerButton().click();
		newUserValidation.successfullyRegisteredUser();
		wait.loadElement(loginPage.getEmailInput());
		
	}

}
