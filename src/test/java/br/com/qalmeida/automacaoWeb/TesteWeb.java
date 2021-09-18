package br.com.qalmeida.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    ChromeDriver driver; // criando o objeto do tipo ChromeDriver

    @Before
    public void inicializaTeste(){

        WebDriverManager.chromedriver().setup(); //Verifica a versão do navegador e alinha tudo

        driver = new ChromeDriver(); //instanciando o objeto
        driver.manage().window().maximize(); // maximizando a tela

        driver.get("https://www.chronosacademy.com.br"); //abrindo um endereço

    }

    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[2]//h4";

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();

        Assert.assertEquals("Porque Tempo É Conhecimento", titulo);


    }


    @After
    public void finalizaTeste(){
        driver.quit();

        //driver.manage().deleteAllCookies();
    }


}
