package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;
	    
	    public LoginTask(WebDriver driver) {
	        
	        this.driver= driver;
	        loginPage = new LoginPage(this.driver);
	        loginValidation = new LoginValidation(this.driver);
	    }
	    
	    public void efetuarLogin() {
	    	loginPage.getEmailInput().click();
	    	System.out.println("t0");
	        //loginValidation.validationLoginPage();//Porque esse comando está trazendo o URL da página de cadastro ao invés da de login?
	        System.out.println("t0.1");
	        loginPage.getEmailInput().click();
	        System.out.println("t1");
	        System.out.println(FileOperation.getProperties("form").getProperty("email"));
	        loginPage.getEmailInput().sendKeys(FileOperation.getProperties("form").getProperty("email"));
	        System.out.println("t2");
	        loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("form").getProperty("password"));
	        System.out.println("t3");
	        loginPage.getLoginButton().click();
		}

}
