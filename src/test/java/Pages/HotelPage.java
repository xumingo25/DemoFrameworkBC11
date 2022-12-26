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

    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorSubmitBuscar = By.xpath("//button[contains(text(),'Buscar')]");

    By locatorBtnVueloMasHotel = By.xpath("//span[contains(text(),'Vuelo + Hotel')]");


        //Clickea Vuelos+Hoteles dentro de la pagina de Hoteles
    public void BtnVueloMasHotel(){
        click(esperarAElementoWeb(locatorBtnVueloMasHotel));
    }



    public void CompletarHoteles (String Lugar, String Fecha1, String Fecha2){

//Elegir el lugar de alojamiento
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBuscarAlojamientoEn));
        agregarTexto(esperarAElementoWeb(locatorBuscarAlojamientoEn), Lugar);
        esperarXSegundos(1000);



//Elegir Numero de habitaciones

//Elegir el mes y las fechas de entrada y salida
        click(esperarAElementoWeb(locatorFechaDeEntrada));
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);

        By locatorSeleccionarDia1= By.xpath("//button[contains(text(),"+ Fecha1 +")]");
        click(esperarAElementoWeb(locatorSeleccionarDia1));
        esperarXSegundos(1000);
        By locatorSeleccionarDia2= By.xpath("//button[contains(text(),"+ Fecha2 +")]");
        click(esperarAElementoWeb(locatorSeleccionarDia2));

//submit
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorSubmitBuscar));
    }




    By locatorSeleccionarOrigen= By.id("mui-1");
    By locatorPincharOrigen= By.xpath("//li[@id='mui-1-option-0']");
    By locatorSeleccionarDestino= By.id("mui-2");
    By locatorPincharDestino= By.xpath("//li[@id='mui-2-option-0']");
    By locatorSeleccionarFechaDeIda= By.xpath("//label[contains(text(),'Fecha de ida')]");

    By locatorClearButton = By.xpath("//div[@role='button']");

    By locatorClase = By.xpath("//span[contains(text(),'Cualquier clase')]");
    By locatorOpClase = By.xpath("//span[contains(text(),'Turista')]");


    public void CompletarVueloMasHoteles (String LugarOrigen, String LugarDestino, String FechaIda, String FechaVuelta){

//Elegimos la clase
        click(esperarAElementoWeb(locatorClase));
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorOpClase));
        esperarXSegundos(1000);

//Limpiar el form de origen
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorSeleccionarOrigen));
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorClearButton));
        esperarXSegundos(1000);


//Rellenarlo y elegir la opcion del dropdown menu
        agregarTexto(esperarAElementoWeb(locatorSeleccionarOrigen), LugarOrigen);
        esperarXSegundos(2000);
        click(esperarAElementoWeb(locatorPincharOrigen));


//Elegir el destino
        click(esperarAElementoWeb(locatorSeleccionarDestino));
        agregarTexto(esperarAElementoWeb(locatorSeleccionarDestino), LugarDestino);
        esperarXSegundos(2000);
        click(esperarAElementoWeb(locatorPincharDestino));
        esperarXSegundos(1000);



//Clickear 2 veces seleccionar FechaDeIda por un bug
        click(esperarAElementoWeb(locatorSeleccionarFechaDeIda));
        esperarXSegundos(5000);
        click(esperarAElementoWeb(locatorSeleccionarFechaDeIda));
        esperarXSegundos(1000);


//Elegir Fechas
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        By locatorSeleccionarDia1= By.xpath("//button[contains(text(),"+ FechaIda +")]");
        click(esperarAElementoWeb(locatorSeleccionarDia1));

        esperarXSegundos(1000);

        By locatorSeleccionarDia2= By.xpath("//button[contains(text(),"+ FechaVuelta +")]");
        click(esperarAElementoWeb(locatorSeleccionarDia2));


//submit form
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorSubmitBuscar));

    }





    By locatorResultadoCP001 = By.xpath("//div[contains(text(),'Alojamientos en Costa Blanca')]"); //mover a una page de resultados
    By locatorResultadoCP002 = By.xpath("//div[contains(text(),'Paquete Vuelo + Hotel')]");


    public String obtenerResultadoCP002(){
        esperarXSegundos(1000);
        return obtenerTexto(esperarAElementoWeb(locatorResultadoCP002));
    }

    public String obtenerResultadoCP004(){
        esperarXSegundos(1000);
        return obtenerTexto(esperarAElementoWeb(locatorResultadoCP001));
    }

}