package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageSrBarriga {
    
    private WebDriver driver;
    
    public LoginPageSrBarriga(WebDriver driver) {
        
        this.driver = driver;        
    }
    //Campo E-mail
    public WebElement getEmailInput() {     
        return driver.findElement(By.id("email"));
    }
    //Campo Senha
    public WebElement getPasswordInput() { 
        return driver.findElement(By.id("senha"));
    }
  //Botão Entrar
    public WebElement getLoginButton() { 
        return driver.findElement(By.className("btn btn-primary"));
    }
    
}
