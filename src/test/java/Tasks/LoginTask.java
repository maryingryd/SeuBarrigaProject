package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.LoginPageSrBarriga;
import Validations.LoginValidation;

public class LoginTask {
    
private WebDriver driver;
private LoginPageSrBarriga loginPageSrBarriga;
private LoginValidation loginValidation;
    
    public LoginTask(WebDriver driver) {
        
        this.driver= driver;
        loginPageSrBarriga = new LoginPageSrBarriga(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    
    public void efetuarLogin() {
        
        loginValidation.validationLoginPage();
        loginPageSrBarriga.getUserNameInput().sendKeys("standard_user");
        loginPageSrBarriga.getPasswordInput().sendKeys("secret_sauce");
        loginPageSrBarriga.getLoginButton().click();
    }
    
   public void efetuarLoginParametrizado(String user, String password) {
        
        loginValidation.validationLoginPage();
        loginPageSrBarriga.getUserNameInput().sendKeys(user);
        loginPageSrBarriga.getPasswordInput().sendKeys(password);
        loginPageSrBarriga.getLoginButton().click();
    }
   
   public void efetuarLoginProperties() {
       
       loginValidation.validationLoginPage();
       loginPageSrBarriga.getUserNameInput().sendKeys(FileOperation.getProperties("user").getProperty("user"));
       loginPageSrBarriga.getPasswordInput().sendKeys(FileOperation.getProperties("user").getProperty("password"));
       loginPageSrBarriga.getLoginButton().click();
   }


}
