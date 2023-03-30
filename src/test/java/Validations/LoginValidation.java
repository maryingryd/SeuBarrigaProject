package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.LoginPageSrBarriga;
import Report.Report;
import Report.Screenshot;

public class LoginValidation {
    
    private  WebDriver driver;
    private LoginPageSrBarriga loginPageSrBarriga;

    public LoginValidation(WebDriver driver) {
        
        this.driver = driver;
        loginPageSrBarriga = new LoginPageSrBarriga(this.driver);
    }
    
    public void validationLoginPage() {
        
        try {
            Assertions.assertTrue(loginPageSrBarriga.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a p�gina de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
