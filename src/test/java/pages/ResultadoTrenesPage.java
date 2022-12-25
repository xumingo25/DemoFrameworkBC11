package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class ResultadoTrenesPage extends BaseClass {

    public ResultadoTrenesPage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnMasBarato = By.xpath("//ul[@role='tablist']/li[2]");
    By locatorPrecioMasBarato = By.xpath("//section[@data-role='results']//following::span[1][@size=24]");
    By locatorPrecioMasBaratoHead = By.xpath("//ul[@role='tablist']/li[2]/div[@class='sorting-tabs-view__amount']");


    public void seleccionarBotonMasBarato() {
        esperarXSegundos(15000);
        WebElement element = driver.findElement(By.xpath("//ul[@role='tablist']/li[2]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public String obtenerValorMasBarato() {
        WebElement valorMasBarato = driver.findElement(locatorPrecioMasBarato);
        String valor = valorMasBarato.getText();
        return valor;
    }

    public String obtenerValorMasBaratoHead() {
        //    JavascriptExecutor executor = (JavascriptExecutor)driver;
        esperarXSegundos(4000);
        WebElement valorMasBaratoHead = driver.findElement(locatorPrecioMasBaratoHead);
        String prueba = valorMasBaratoHead.getText();
        String prueba2 = valorMasBaratoHead.getAttribute("value");
        return prueba;
        //     return (String) executor.executeScript("arguments[0].textContent()",valorMasBaratoHead);
    }
}

