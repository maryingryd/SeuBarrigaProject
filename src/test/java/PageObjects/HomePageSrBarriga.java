package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSrBarriga {

    private WebDriver driver;

    public HomePageSrBarriga(WebDriver driver) {

        this.driver = driver;
    }

  //Dropdown Contas
    public WebElement getCountDropDownInput() { 
        return driver.findElement(By.className("dropdown-toggle"));
    }
  //Dropdown Contas Adicionar
    public WebElement getCountDropDownAddInput() { 
        return driver.findElement(By.xpath("ul[@class='dropdown-menu']/li[1]/a"));
    }
    
  //Dropdown Contas Listar
    public WebElement getCountDropDownListInput() { 
        return driver.findElement(By.xpath("ul[@class='dropdown-menu']/li[2]/a"));
    }
    
}
