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
    By locatorBtnViajeros = By.xpath("");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorReducirViajeros = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorBtnBuscar= By.xpath("//button[contains(text(),'Buscar')]");
    By locatorRBOrigen= By.xpath("//div[@role='listbox']/div/div[2]/button");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),1)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),15)]");



    public void completarBusqueda(String origen, String destino){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen),origen);
        esperarXSegundos(1000);
        click(locatorRBOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),destino);
        esperarXSegundos(1000);
        click(locatorRBOrigen);
        esperarXSegundos(5000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(1000);
        click(locatorFVuelta);
        esperarXSegundos(1000);
        click(locatorAumentarViajeros);
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBtnBuscar));
        esperarXSegundos(3000);

    }


}


