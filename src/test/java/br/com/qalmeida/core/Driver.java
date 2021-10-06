package br.com.qalmeida.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private WebDriver driver; //declarando o objeto driver

    public Driver(String navegador){
        switch (navegador){
            case "chrome":
                WebDriverManager.chromedriver().setup(); //Verifica a versão do navegador e alinha tudo
                driver = new ChromeDriver(); //instanciando o objeto
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize(); // maximizando a tela
    }


    public WebDriver getDriver(){ //metodo para retornar o driver
        return driver;
    }
}
