package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://seubarriga.wcaquino.me/movimentacao

public class MonthlySummaryPageSrBarriga {

    private WebDriver driver;

    public MonthlySummaryPageSrBarriga(WebDriver driver) {

        this.driver = driver;
    }

    // Menu navegador
    public WebElement getNavMonthlySummaryInput() {
        return driver.findElement(By.xpath("li[@class='active']/a"));
    }
    //Lista Meses
    public WebElement getListMonthInput() {
        return driver.findElement(By.id("mes"));
    }
    //Mes Janeiro
    public WebElement getListMonthJanuaryInput() {
        return driver.findElement(By.xpath("select[@id='mes']/option[@value='01']"));
    }
    //Anos
    public WebElement getListYearInput() {
        return driver.findElement(By.id("ano"));
    }
    //Ano 2023
    public WebElement getListYear2023Input() {
        return driver.findElement(By.xpath("select[@id='ano']/option[@value='2023']"));
    }
    //Botão Buscar
    public WebElement getButtonBuscarInput() {
        return driver.findElement(By.xpath("input[@value='Buscar']"));
    }
    //Campo Tipo de Conta Despesa
    public WebElement getDescriptionDespesaInput() {
        return driver.findElement(By.xpath("tbody/tr[1]/td[3]"));
    }
    
}
