package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//https://seubarriga.wcaquino.me/movimentacao

public class MovementPageSrBarriga {

    private WebDriver driver;

    public MovementPageSrBarriga(WebDriver driver) {

        this.driver = driver;
    }

    // Menu navegador
    public WebElement getNavMovementInput() {
        return driver.findElement(By.xpath("li[@class='active']/a"));
    }
 // Campo Selecionar Tipo da Movimentação
    public WebElement getTypeMovementInput() {
        return driver.findElement(By.id("tipo"));
    }
    // Campo Selecionar Receita
    public WebElement getTypeMovementRevenueInput() {
        return driver.findElement(By.xpath("select[@id='tipo']/option[@value='REC']"));
    }
    
    // Campo Selecionar Despesa
    public WebElement getTypeMovementExpenseInput() {
        return driver.findElement(By.xpath("select[@id='tipo']/option[@value='DESP']"));
    }

    // Campo Data de Movimentação
    public WebElement getDateMovementInput() {
        return driver.findElement(By.id("data_transacao"));
    }

    // Campo Data de Pagamento
    public WebElement getDatePaymentInput() {
        return driver.findElement(By.id("data_pagamento"));
    }

    // Campo Descrição
    public WebElement getDescriptionInput() {
        return driver.findElement(By.id("descricao"));
    }

    // Campo Interessado
    public WebElement getInterestedInput() {
        return driver.findElement(By.id("interessado"));
    }

    // Campo Valor
    public WebElement getValueInput() {
        return driver.findElement(By.id("valor"));
    }
    
 // Campo Conta
    public WebElement getCountInput() {
        return driver.findElement(By.id("conta"));
    }
    //Campo Conta Receita
    public WebElement getCountRevenueInput() {
        return driver.findElement(By.xpath("select[@id='conta']/option[1]"));
    }
  //Campo Conta Despesa
    public WebElement getCountExpenseInput() {
        return driver.findElement(By.xpath("select[@id='conta']/option[2]"));
    }
  //CheckBox Pagamento
    public WebElement getCheckBoxPaymentInput() {
        return driver.findElement(By.id("status_pago"));
    }
    
  //CheckBox Pendente
    public WebElement getCheckBoxPendingInput() {
        return driver.findElement(By.id("status_pendente"));
    }
    
  //Botão Salvar 
    public WebElement getButtonSalveInput() {
        return driver.findElement(By.className("status_pendente"));
    }
}
