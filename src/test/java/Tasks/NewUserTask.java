package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.GenericPage;
import PageObjects.LoginPage;
import PageObjects.NewUserPage;
import Validations.GenericValidation;
import Validations.NewUserValidation;

public class NewUserTask {
	private WebDriver driver;
	private NewUserPage newUserPage;
	private NewUserValidation newUserValidation;
	private GenericPage genericPage;
	private GenericValidation genericValidation;
	private FakersGeneration fakersGeneration;
	private LoginPage loginPage;
	private Waits wait;
	
	public NewUserTask(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
		loginPage = new LoginPage(this.driver);
		newUserPage = new NewUserPage(this.driver);
		newUserValidation = new NewUserValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
		fakersGeneration = new FakersGeneration();
	}
	//Metodo preencher cadastro
	public void occupyRegistrer() {
		newUserPage.getMenuNewUserInput();
		newUserPage.getMenuNewUserInput().click();
		System.out.println("x3");
		newUserValidation.validationNewUserPage(); 
		System.out.println("x4");
		newUserPage.getEmailInput().click();
		System.out.println("x5");
		String name = fakersGeneration.getFullName();
		String email= fakersGeneration.getEmailAddress();
		String password= fakersGeneration.getPassword();
		FileOperation.setProperties("form", "name", name);
		FileOperation.setProperties("form", "email", email);
		FileOperation.setProperties("form", "password", password);
		newUserPage.getNameInput().sendKeys(name);
		newUserPage.getEmailInput().sendKeys(email);
		newUserPage.getPasswordInput().sendKeys(password);
		System.out.println("x6");
		newUserPage.getRegistrerButton().click();
		System.out.println("x7");
		newUserValidation.successfullyRegisteredUser();
		System.out.println("x8");
		wait.loadElement(loginPage.getEmailInput());
		//wait.loadElement(loginPage.getFormLoginEmailInput());
		System.out.println("x9");
		//loginPage.getEmailInput().click();
		System.out.println("x10");
	}

}
