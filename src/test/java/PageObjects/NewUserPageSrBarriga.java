package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserPageSrBarriga {

    private WebDriver driver;

    public NewUserPageSrBarriga(WebDriver driver) {

        this.driver = driver;
    }

    // Campo Nome
    public WebElement getNameInput() {
        return driver.findElement(By.id("nome"));
    }

    // Campo E-mail
    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }

    // Campo E-mail
    public WebElement getPasswordInput() {
        return driver.findElement(By.id("senha"));
    }

    // Botão Entrar
    public WebElement getToenterButton() {
        return driver.findElement(By.className("btn btn-primary"));
    }

}
