package utils;

//La clase base define las acciones de selenium (Wrapper)

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    //Atributos
    private WebDriver driver;
    private JavascriptExecutor js;

    private WebDriverWait wait;

    //Métodos
    public BaseClass(WebDriver driver) {
        this.driver = driver;
    }

    //Enmascarar las acciones(Métodos) de selenium

    public WebElement buscarElementoWeb(By localizador){
        return this.driver.findElement(localizador);
    }

    public void cargarPagina(String url){
        this.driver.get(url);
    }

    //Scroll
    public void ScrollElementoWeb(By localizador){
        js = (JavascriptExecutor) this.driver;

        js.executeScript("arguments[0].scrollIntoView();", this.driver.findElement(localizador));
    }

    public void ScrollElementoWeb(WebElement elemento){
        js = (JavascriptExecutor) this.driver;

        js.executeScript("arguments[0].scrollIntoView();", elemento);
    }


    //Tiempos de espera

    //Espera por X segundos
    public void esperarXSegundos(int milisegundos){
        try{
            Thread.sleep(milisegundos);
        }catch (Exception ex){
            System.out.println("Fallo la espera en milisegundos definida.");
        }
    }

    //Espera en base a evento
    public WebElement esperarAElementoWeb(By localizador){
        wait = new WebDriverWait(this.driver,20);

        return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    //click
    public void click(WebElement elemento){
        elemento.click();
    }

    public void click(By localizador){
        this.driver.findElement(localizador).click();
    }

    //obtenerTexto
    public void obtenerTexto(WebElement elemento){
        elemento.getText();
    }

    public void obtenerTexto(By localizador){
        this.driver.findElement(localizador).getText();
    }

    //Submit
    public void submitFormulario(By localizador){
        this.driver.findElement(localizador).submit();
    }

    //agregarTexto
    public void agregarTexto(WebElement elemento, String texto){
        elemento.sendKeys(texto);
    }

    public void agregarTexto(By localizador,String texto){
        this.driver.findElement(localizador).sendKeys(texto);
    }

    //Maximizar la pagina
    public void maximizarBrowser(){
        driver.manage().window().maximize();
    }

}


