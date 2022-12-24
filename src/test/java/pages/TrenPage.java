package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.util.List;

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
    By locatorAgregarBebe11Meses = By.xpath("//li[contains(text(),'Bebé, 0-11 meses')]");
    By locatorBtnBuscar= By.xpath("//button[contains(text(),'Buscar')]");
    By locatorRBOrigen= By.xpath("//div[@role='listbox']/div/div[2]/button");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),1)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),15)]");



    public void completarBusquedaOrigenDestino(String origen, String destino) {
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen), origen);
        esperarXSegundos(2000);
        click(locatorRBOrigen);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino), destino);
        esperarXSegundos(2000);
        click(locatorRBOrigen);
        esperarXSegundos(5000);
    }
    public void completarBusquedaMes() {
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
    public void agregarNihno () {
        esperarXSegundos(4000);
        click(locatorAgregarNinho);
        esperarXSegundos(4000);
        click(locatorAgregarBebe11Meses);
    }

    public void clickBuscar () {
        esperarAElementoWeb(locatorBtnBuscar);
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


}


