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

    By locatorPrecioMasBarato = By.xpath("//section[@data-role='results']//following::span[1][@size=24]");
    By locatorBtnModificar = By.xpath("//span[contains(text(),'Modificar')]");
    By locatorSeleccionarNuevoOrigen = By.xpath("//input[@id='fromPlace']");
    By locatorIngresarNuevoDestino = By.xpath("//input[@id=\"toPlace\"]");
    By locatorRBNuevoOrigen = By.xpath("//section//child::button");
    By locatorClickNuevoDestino = By.xpath("//div[@role=\"option\"]");
    By locatorFIda = By.xpath("//button[contains(text(),15)]");
    By locatorFVuelta = By.xpath("//button[contains(text(),30)]");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorBtnBuscar = By.xpath("//button[@type= 'submit']");
    By locatorPrecioBusqueda1 = By.xpath("//section[@data-role='results']//following::span[1][@size=24]");
    By locatorPrecioBusqueda2 = By.xpath("//section[@data-role='results']//following::span[1][@size=24]");


    public void seleccionarBotonMasBarato() {
        esperarXSegundos(15000);
        WebElement element = driver.findElement(By.xpath("//ul[@role='tablist']/li[2]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }


    public String obtenerValorMasBarato() {
        esperarXSegundos(10000);
        WebElement valorMasBarato = driver.findElement(locatorPrecioMasBarato);
        String valor = valorMasBarato.getText();
        return valor;
    }

    public String obtenerValorMasBaratoHead() {
        esperarXSegundos(10000);
        WebElement valorMasBarato = driver.findElement(locatorPrecioMasBarato);
        String valor = valorMasBarato.getText();
        return valor;
    }

    public void modificarParametros(String origen, String destino) {
        esperarXSegundos(5000);
        click(locatorBtnModificar);
        esperarXSegundos(2000);
        click(buscarElementoWeb(locatorSeleccionarNuevoOrigen));
        esperarXSegundos(2000);
        agregarTexto(locatorSeleccionarNuevoOrigen, origen);
        esperarXSegundos(2000);
        click(locatorRBNuevoOrigen);
        esperarXSegundos(2000);
        agregarTexto(locatorIngresarNuevoDestino, destino);
        esperarXSegundos(2000);
        click(locatorClickNuevoDestino);
        esperarXSegundos(2000);
        click(locatorFIda);
        esperarXSegundos(2000);
        click(locatorFVuelta);
        esperarXSegundos(2000);
        click(locatorAumentarViajeros);
        esperarXSegundos(2000);
        click(locatorBtnBuscar);
    }

    public String obtenerPrecio1() {
        esperarXSegundos(6000);
        WebElement precioBusqueda1 = driver.findElement(locatorPrecioBusqueda1);
        String precioFinal = precioBusqueda1.getText();
        System.out.println(precioFinal);
        return precioFinal;

    }

    public String obtenerPrecio2() {
        esperarXSegundos(10000);
        WebElement precioBusqueda2 = driver.findElement(locatorPrecioBusqueda2);
        String precioFinal = precioBusqueda2.getText();
        System.out.println(precioFinal);
        return precioFinal;
    }
}
