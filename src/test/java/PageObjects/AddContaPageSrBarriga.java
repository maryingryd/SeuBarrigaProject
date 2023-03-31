package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddContaPageSrBarriga {

    private WebDriver driver;

    public AddContaPageSrBarriga(WebDriver driver) {

        this.driver = driver;
    }
    
  //Campo Nome Conta
    public WebElement getNomeCountInput() { 
        return driver.findElement(By.id("nome"));
    }
  //Botão Salvar Conta
    public WebElement getButtonSaveInput() { 
        return driver.findElement(By.className("btn btn-primary"));
    }
}
