package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class TrenesPage extends BaseClass {


    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores


    By localizadorIdaVuelta = By.xpath("//div[contains(text(),'Ida y vuelta')]");
    By localizadorOrigen = By.xpath("//input[@id='fromPlace']");
    By locatorRbdOrigen = By.xpath("//b[contains(text(),'Madrid')]");//div[@aria-selected='true']
    By localizadorDestino = By.xpath("//input[@id='toPlace']");
    By locatorRbdDestino = By.xpath("//b[contains(text(),'Barcelona')]");
    By localizadorFechaIda = By.xpath("//label[contains(text(),'Fecha de ida')]");
    By localizadorSeleccionIda = By.xpath("//button[contains(text(),'31')]");
    By localizadorFechaVuelta = By.xpath("//label[contains(text(),'Fecha de vuelta')]");
    By localizadorSeleccionViajero = By.xpath("//span[contains(text(),'1 viajero')]");
    By localizadorBtnBuscar = By.xpath("//button[contains(text(),'Buscar')]");

    By localizadorReslutados = By.xpath("//div[@class='listing-total-results-container panel']");

    //Caso fallido


    By localizadorSeleccionIdaMismoDiaIda = By.xpath("//button[contains(text(),'25')]");





    public void completarDatosViajeEnTren(String origen, String destino){

        click(esperarAElementoWeb(localizadorIdaVuelta));
        agregarTexto(esperarAElementoWeb(localizadorOrigen),origen);
        click(esperarAElementoWeb(locatorRbdOrigen));
        agregarTexto(esperarAElementoWeb(localizadorDestino),destino);
        click(esperarAElementoWeb(locatorRbdDestino));
        scrollElementoWeb(localizadorFechaIda);
        click(esperarAElementoWeb(localizadorFechaIda));
        click(esperarAElementoWeb(localizadorFechaIda));
        click(esperarAElementoWeb(localizadorSeleccionIda));
        click(esperarAElementoWeb(localizadorFechaVuelta));
        click(esperarAElementoWeb(localizadorBtnBuscar));
        esperarAElementoWeb(localizadorReslutados);


    }

    public void CompletarDatosDeTrenMismoDia(String origen, String destino){


        click(esperarAElementoWeb(localizadorIdaVuelta));
        agregarTexto(esperarAElementoWeb(localizadorOrigen),origen);
        click(esperarAElementoWeb(locatorRbdOrigen));
        agregarTexto(esperarAElementoWeb(localizadorDestino),destino);
        click(esperarAElementoWeb(locatorRbdDestino));
        scrollElementoWeb(localizadorFechaIda);
        click(esperarAElementoWeb(localizadorFechaIda));
        click(esperarAElementoWeb(localizadorFechaIda));
        click(esperarAElementoWeb(localizadorSeleccionIdaMismoDiaIda));
        click(esperarAElementoWeb(localizadorFechaVuelta));
        click(esperarAElementoWeb(localizadorBtnBuscar));


    }



}
