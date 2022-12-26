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

    By locatorFiltrarBarato=By.xpath(("//div[contains(text(),'Más barato')]"));

    By locatorElegirVuelo=By.xpath(("//span[contains(text(),'387,99')]"));

    By locatorElegirOpcionFlexible=By.xpath(("//button[contains(text(),'Elegir Flexible')]"));

    By locatorVerDetalle=By.xpath(("//button[contains(text(),'ver detalles')]"));
    //Lineas para Nacho (Desde 28 hasta 58)






























    //(Aca se termina las lineas de Nacho)


    public void SeleccionarVueloIda(){
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
    public void FiltrarBarato(){
        click(esperarAElementoWeb(locatorFiltrarBarato));
    }
    public void ElegirVuelo(){click(esperarAElementoWeb(locatorElegirVuelo));
    }
    public void ElegirOpcionFlexible(){click(esperarAElementoWeb(locatorElegirOpcionFlexible));
    }
    public void VerDetalle(){click(esperarAElementoWeb(locatorVerDetalle));
    }
    //Lineas para nacho (desde 100 hasta 130)






























    //Aca se acaban las lineas de Nacho
}