package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class VuelosPage extends BaseClass {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }
    By locatorBtnVueloIda = By.xpath(("//div[contains(text(),'Solo ida')]"));
    By locatorSeleccionarOrigen= By.id("mui-1");
    By locatorSeleccionarDestino= By.id("mui-2");
    By locatorSeleccionarFechaDeIda= By.xpath(("//label[contains(text(),´Fecha de ida')]"));
    By locatorCambiarAlMesSiguiente= By.xpath(("//button[@aria-label=´Next month´]"));
    By locatorSeleccionarDia= By.xpath(("//button[contains(text(),6)]"));
    By locatorSeleccionarViajero=By.xpath(("//span[contains(text(),'1 viajero')]"));
    By locatorSeleccionarClase=By.xpath(("//span[contains(text(),'Turista')]"));
    By locatorSeleccionarBuscar=By.xpath(("//Button[contains(text(),'Buscar')]"));




    public void seleccionarVueloIda(){
        click(esperarAElementoWeb(locatorBtnVueloIda));
    }
    public void SeleccionarOrigen(String ciudadOrigen){
        click(esperarAElementoWeb(locatorSeleccionarOrigen));
        agregarTexto(esperarAElementoWeb(locatorSeleccionarOrigen),ciudadOrigen);
    }
    public void SeleccionarDestino(String ciudadDestino){
        click(esperarAElementoWeb(locatorSeleccionarDestino));
        agregarTexto(esperarAElementoWeb(locatorSeleccionarDestino),ciudadDestino);
    }
    public void SeleccionarFechaDeIda(){
        click(esperarAElementoWeb(locatorSeleccionarFechaDeIda));
    }
    public void CambiarAlMesSiguiente(){
        click(esperarAElementoWeb(locatorCambiarAlMesSiguiente));
    }
    public void SeleccionarDia(){
        click(esperarAElementoWeb(locatorSeleccionarDia));
    }
    public void SeleccionarViajero(){
        click(esperarAElementoWeb(locatorSeleccionarViajero));
    }
    public void SeleccionarClase(){
        click(esperarAElementoWeb(locatorSeleccionarClase));
    }
    public void SeleccionarBuscar(){
        click(esperarAElementoWeb(locatorSeleccionarBuscar));
    }

}


