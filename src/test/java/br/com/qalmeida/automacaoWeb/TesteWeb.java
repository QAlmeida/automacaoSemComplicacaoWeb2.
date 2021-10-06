package br.com.qalmeida.automacaoWeb;

import br.com.qalmeida.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {

    WebDriver driver; // criando o objeto do tipo Webdriver
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome"); //instanciando o objeto

        driver = driverWeb.getDriver();

        driver.get("https://www.chronosacademy.com.br"); //abrindo um endereço

    }

    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[2]//h4";

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();

        //WebElement txtTitulo = driver.findElementByXPath(xpathTitulo);

        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);


    }

    public void segundoTeste(){
        String xpathBotao = "//div3";
    }


    @After
    public void finalizaTeste(){
        driver.quit();

        //driver.manage().deleteAllCookies();
    }


}
