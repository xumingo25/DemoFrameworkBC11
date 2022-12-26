package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By locatorBtnAceptarCookies = By.xpath("//button[contains(text(),'Aceptar todo')]");
    By locatorBtnTrenes = By.xpath("//a[@title=\"Trenes\"]");
    By locatorBtnVuelos = By.xpath("//a[@title=\"Vuelos\"]");
    By locatorBtnVuelo_Hotel= By.xpath("//a[@title=\"Vuelo + Hotel\"]");
    By locatorBtnViajes= By.xpath("//a[@title=\"Viajes\"]");
    By locatorBtnTren_Hotel= By.xpath("//a[@title=\"Tren + Hotel\"]");
    By locatorBtnHoteles= By.xpath("//a[@title=\"Hoteles\"]");

    //Metodos

    public void aceptarCookies(){
        esperarXSegundos(4000);
        click(esperarAElementoWeb(locatorBtnAceptarCookies));
        esperarXSegundos(4000);
    }

    public void irATrenes(){
        click(esperarAElementoWeb(locatorBtnTrenes));
    }

    public void irAVuelos(){
        click(esperarAElementoWeb(locatorBtnVuelos));
    }

    public void irAVuelo_Hotel(){
        click(esperarAElementoWeb(locatorBtnVuelo_Hotel));
    }

    public void irAHoteles(){
        click(esperarAElementoWeb(locatorBtnHoteles));
    }

    public void handles(){
        handleTabs();
    }




}
