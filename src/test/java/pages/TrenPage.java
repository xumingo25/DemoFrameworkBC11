package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.util.List;

import static java.lang.Integer.parseInt;

public class TrenPage extends BaseClass {
    public TrenPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By locatorTxtOrigen = By.xpath("//input[@placeholder='Origen']");
    By locatorTxtDestino = By.xpath("//input[@placeholder='Destino']");
    By locatorBtnViajeros = By.xpath("//span[contains(text(),'1 viajero')]");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorReducirViajeros = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorAgregarNinho = By.xpath("//span[contains(text(),'Añadir un niño')]");
    By locatorAgregarNinhoAdicional = By.xpath("//button[@aria-label='Aumentar el número de niños']");
    By locatorAgregarBebe11Meses = By.xpath("//li[contains(text(),'Bebé, 0-11 meses')]");
    By locatorAgregarNinho2Anios = By.xpath("//li[contains(text(),'2 años')]");
    By locatorBtnBuscar= By.xpath("//button[contains(text(),'Buscar')]");
    By locatorRBOrigen= By.xpath("//div[@role='listbox']/div/div[2]/button");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),14)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),28)]");

    public void scrollFin(){
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public int contadorPasajerosAdultos(){
        WebElement locatorContadorPasajerosAdultos = buscarElementoWeb(By.xpath("//div[contains(text(),'Adultos')]//parent::div//parent::div//following-sibling::span"));
        int totalPasajerosAdultos= Integer.parseInt(locatorContadorPasajerosAdultos.getText());
        System.out.println(totalPasajerosAdultos);
        return totalPasajerosAdultos;
    }

    public void completarBusquedaOrigenDestino(String origen, String destino) {
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen), origen);
        esperarXSegundos(2000);
        click(locatorRBOrigen);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino), destino);
        esperarXSegundos(4000);
        click(locatorRBOrigen);
        esperarXSegundos(5000);
    }
    public void completarBusquedaMes() {
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(2000);
        click(locatorFVuelta);
        esperarXSegundos(3000);
    }

    public void aumentarViajero(){
        esperarXSegundos(5000);
        click(locatorAumentarViajeros);
    }

    public void reducirViajero() {
        click(locatorBtnViajeros);
        esperarXSegundos(1000);
        click(locatorReducirViajeros);


    }
    //pendiente
    public void agregarNihno() {
        esperarXSegundos(2000);
        click(locatorAgregarNinho);
        esperarXSegundos(2000);
        click(locatorAgregarNinho2Anios);
    //    ScrollElementoWeb(locatorAgregarNinhoAdicional);
    //    for(int i=1;i<=cantidadNinhos;i+=1)
    //        System.out.println(i);
    //        click(locatorAgregarNinhoAdicional);
    //        esperarXSegundos(1000);
    //        click(locatorAgregarNinho2Anios);
    //        esperarXSegundos(1000);

    }

    public void clickBuscar () {
        click(esperarAElementoWeb(locatorBtnBuscar));
        esperarXSegundos(3000);
    }

    public String getUrl1(){
        String url1 = driver.getCurrentUrl();
        return url1;
    }

    public String getUrl2(){
        String url2 = driver.getCurrentUrl();
        return url2;
    }

    public int obtenerTotalPasajerosResultadoBusqueda(){
        WebElement locatorContadorPasajeros = buscarElementoWeb(By.xpath("//div[@class=\"search-summary__passsengers\"]//following-sibling::span"));
        String numeroPasajeros = locatorContadorPasajeros.getText();
        int valor= Integer.parseInt(numeroPasajeros);
        return valor;
    }




}


