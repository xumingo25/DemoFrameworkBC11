package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
    By locatorBtnSeleccionAloj= By.xpath("//a[@class='sc-fEXmlR hMqBms']");
    By locatorBtnVueloHotel= By.xpath("//button[@aria-label='Vuelo + Hotel']");

    //Datos Vuelo+Hotel
    By locatorBtnOrigen=By.xpath("//input[@id='mui-2']");
    By locatorSelOrigen=By.xpath("//li[@id='mui-2-option-0']");
    By locatorSelDestino=By.xpath("//li[@id='mui-3-option-0']");
    By locatorSelhotel=By.xpath("//div[@class='sc-gikAfH icISup openx-ui-card-content']");
    By locatorElegirHab=By.xpath("//button[contains(text(),'Elegir tipo de habitación')]");
    By locatorSolAloj=By.xpath("//span[contains(text(),'Sólo Alojamiento')]");



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

    public void BtnSeleccionAloj(){click(esperarAElementoWeb(locatorBtnSeleccionAloj));}
    public void Selhotel(){click(esperarAElementoWeb(locatorSelhotel));}
    public void ElegirHab(){click(esperarAElementoWeb(locatorElegirHab));}
    public void SoloAloj(){click(esperarAElementoWeb(locatorSolAloj));}


//Botones-Vuelos+Hotel
    public void BtnVueloHotel(){click(esperarAElementoWeb(locatorBtnVueloHotel));}
    public void CompletarFormVueloHotel(){
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBtnOrigen));
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorSelOrigen));
        click(esperarAElementoWeb(locatorSelDestino));
        click(esperarAElementoWeb(locatorFechasFlexibles));
        click(esperarAElementoWeb(locatorCualquierFecha));
        click(esperarAElementoWeb(locatorSubmitBuscar));
    }




}