package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageSrBarriga {
    
    private WebDriver driver;
    
    public LoginPageSrBarriga(WebDriver driver) {
        
        this.driver = driver;        
    }
    
    public WebElement getLogoText() {
        
        return driver.findElement(By.className("login_logo"));
    }
    
    
}
