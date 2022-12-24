package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HotelPage extends BaseClass {

    public HotelPage(WebDriver driver) {
        super(driver);
    }


    By locatorBuscarAlojamientoEn = By.xpath(("//input[@id='mui-1']"));
    By locatorFechaDeEntrada = By.xpath("//label[contains(text(),'Fecha de entrada')]");
    By locatorFechasFlexibles = By.xpath("//button[contains(text(),'Fechas flexibles')]");
    By locatorCualquierFecha = By.xpath("//div[contains(text(),'Cualquier fecha')]");
    By locatorSubmitBuscar = By.xpath("//button[contains(text(),'Buscar')]");
    By locatorResultados = By.xpath("//div[contains(text(),'resultados encontrados')]");


    public void Completar (String Lugar){
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBuscarAlojamientoEn));
        agregarTexto(esperarAElementoWeb(locatorBuscarAlojamientoEn), Lugar);
        esperarXSegundos(2000);
        click(esperarAElementoWeb(locatorFechaDeEntrada));
        click(esperarAElementoWeb(locatorFechasFlexibles));
        click(esperarAElementoWeb(locatorCualquierFecha));
        click(esperarAElementoWeb(locatorSubmitBuscar));
    }

    public String obtenerResultados(){
        esperarXSegundos(1000);
        return obtenerTexto(esperarAElementoWeb(locatorResultados));
    }


}