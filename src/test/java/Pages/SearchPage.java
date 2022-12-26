package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

/**
 * @author Franco
 */
public class SearchPage extends BaseClass {
    public SearchPage(WebDriver driver) {
        super(driver);
    }


    By locatorBtbSearch = By.xpath("//div[@id='openx-ui-search']");
    By locatorPrimeraImagenOpcion = By.xpath("//div[contains(@class, 'sc-iTFTee libLOB')]");
    By locatorElegirHabitacion = By.xpath("//button[contains(text(),'Elegir tipo de habitación')]");

    By locatorSoloAlojamiento = By.xpath("//span[contains(text(),'Sólo Alojamiento')]");


    public void RealizarCambiosBusquedaLugar(String LugarARealizarCambio, String locatorLugarCambio ){

        By locatorLugarARealizarCambio1 = By.xpath("//span[contains(text(),'"+LugarARealizarCambio+"')]");
        By locatorLugarCambio1 = By.xpath("//span[contains(text(),'"+locatorLugarCambio+"')]");

        click(esperarAElementoWeb(locatorLugarARealizarCambio1));
        click(esperarAElementoWeb(locatorLugarCambio1));
        click(esperarAElementoWeb(locatorBtbSearch));

    }

    public void ElegirPrimeraOpcionFoto(){
        click(esperarAElementoWeb(locatorPrimeraImagenOpcion));
    }

    public void ElegirHabitacionYelegirPrimerOpcion(){
        esperarXSegundos(5000);
        click(esperarAElementoWeb(locatorElegirHabitacion));
        click(esperarAElementoWeb(locatorSoloAlojamiento));
    }

//

}
