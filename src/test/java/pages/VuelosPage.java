package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class VuelosPage extends BaseClass {
    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    By locatorClearOrigen = By.xpath("(//div[@role='button'])[1]");
    By locatorTxtOrigen = By.xpath("//input[@id='mui-1']");
    By locatorTxtDestino = By.xpath("//input[@id='mui-2']");
    By locatorOptOrigen = By.xpath("//ul[@id='mui-1-listbox']");
    By locatorOptDestino = By.xpath("//li[@id='mui-2-option-0']");
    By locatorBtnFechaIda = By.xpath("//label[contains(text(),'Fecha de ida')]");
    By locatorFechaIda = By.xpath("//button[contains(text(),1)]");
    By locatorFechaVuelta = By.xpath("//button[contains(text(),28)]");
    By locatorMesSiguiente = By.xpath("//button[@aria-label='Next month']");
    By locatorViajeros = By.xpath("(//div/button[@data-autoscroll-target=\"true\"][1])[1]");
    By locatorAumentoViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorReducirViajeros = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorBtnClase = By.xpath("//*[@id='seat_svg__stroke']");
    By locatorOptClase = By.xpath("//div[@role='option'][2]");
    By locatorTxtError_BusquedaOrigen = By.xpath("(//span[@role='alert'])[1]");
    By locatorTxtError_BusquedaDestino = By.xpath("(//span[@role='alert'])[2]");
    By locatorBtnViajePreseleccionado = By.xpath("//*[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[5]");
    By locatorBtnBuscar= By.xpath("//button[contains(text(),'Buscar')]");
    By locatorBtnVueloHotel= By.xpath("//button[contains(text(),'Vuelo + Hotel')]");
    By locatorBtnMejorValorado = By.xpath("(//div[@data-type='DESC'])[2]");
    By locatorOptHotel = By.xpath("(//*[@data-testid='hdp-offer-card'])[1]");
    By locatorBtnHabitaciones = By.xpath("//a[@data-testid='rooms']");
    By locatorBtnSeleccionHabitacion = By.xpath("(//button[@data-testid='checkout-button'])[1]");
    By locatorBtnDetallesHotel = By.xpath("//button[contains(text(),'Detalles del hotel')]");
    By locatorBtnCloseDetalleHotel = By.xpath("(//button[@class='close'])[2]");
    By locatorBtnInicioPremium = By.xpath("//button[contains(text(),'¿Ya eres miembro Plus? Inicia sesión')]");
    By locatorSeleccionAlojamiento = By.xpath("(//div[contains(text(),'VUELO + HOTEL')])[1]");
    By locatorBtnSeleccionPlus = By.xpath("//button[@data-testid='select-plus-button']");
    By locatorRBSeguroProteccionTotal = By.xpath("(//div[@class='insurance__proposal'])[1]");
    By locatorBtnSiguientePago =By.xpath("//button[@data-test='lead-generation-submit-btn']");

    //Localizadores Formulario ¿Quién reserva?
    By locatorTxtNombre = By.xpath("//input[@data-test='input-name']");
    By locatorTxtApellido = By.xpath("//input[@data-test='input-surname']");
    By locatorTxtEmail = By.xpath("//input[@id='contact-email']");
    By locatorTxtTelefono = By.xpath("//input[@data-test='input-phone']");

    //Localizadores Formulario ¿Quién viaja?
    //Huesped 1
    By locatorRBH1Genero =By.xpath("(//span[contains(text(),'Sr.')])[1]");
    By locatorH1Nombre = By.xpath("(//input[@class='form-control text-input '])[3]");
    By locatorH1Apellido = By.xpath("(//input[@class='form-control text-input '])[4]");
    By locatorH1DiaNac = By.xpath("(//div[@data-test='date-day-input'])[1]");
    By locatorH1MesNac = By.xpath("(//div[@data-test='date-month-input'])[1]");
    By locatorH1SeleccionMesNac = By.xpath("(//option[@value='3'])[1]");
    By locatorH1AnioNac = By.xpath("(//div[@data-test='date-year-input'])[1]");

    //Huesped 2
    By locatorRBH2Genero =By.xpath("(//span[contains(text(),'Sra.')])[2]");
    By locatorH2Nombre = By.xpath("(//input[@class='form-control text-input '])[5]");
    By locatorH2Apellido = By.xpath("(//input[@class='form-control text-input '])[6]");
    By locatorH2DiaNac = By.xpath("(//div[@data-test='date-day-input'])[2]");
    By locatorH2MesNac = By.xpath("(//div[@data-test='date-month-input'])[2]");
    By locatorH2SeleccionMesNac = By.xpath("(//option[@value='6'])[2]");
    By locatorH2AnioNac = By.xpath("(//div[@data-test='date-year-input'])[2]");

    //Huesped 3
    By locatorRBH3Genero =By.xpath("(//span[contains(text(),'Sra.')])[3]");
    By locatorH3Nombre = By.xpath("(//input[@class='form-control text-input '])[7]");
    By locatorH3Apellido = By.xpath("(//input[@class='form-control text-input '])[8]");
    By locatorH3DiaNac = By.xpath("(//div[@data-test='date-day-input'])[3]");
    By locatorH3MesNac = By.xpath("(//div[@data-test='date-month-input'])[3]");
    By locatorH3SeleccionMesNac = By.xpath("(//option[@value='10'])[3]");
    By locatorH3AnioNac = By.xpath("(//div[@data-test='date-year-input'])[3]");

    //Formulario ¿Cómo desea pagar?
    By locatorTxtTitularTarjeta = By.xpath("(//div[@class='input-addon'])[1]");
    By locatorTxtNroTarjeta = By.xpath("(//div[@class='input-addon'])[2]");
    By locatorTxtMesCaducidad = By.xpath("(//input[@name='creditCard.expirationDate'])[1]");
    By locatorTxtAnioCaducidad = By.xpath("(//input[@name='creditCard.expirationDate'])[2]");
    By locatorTxtCVV = By.xpath("//input[@name='creditCard.cvv']");

    //Formulario Factura o Justificante de compra (Particular)
    By locatorBtnParticular = By.xpath("//label[@id='radio-invoiceChoice-CUSTOMER-label']");
    By locatorTxtNIF_CIF = By.xpath("//input[@name='customer.fiscalCode']");
    By locatorTxtNameBoleta = By.xpath("//input[@name='customer.name']");
    By locatorTxtSurNameBoleta = By.xpath("//input[@name='customer.surname']");
    By locatorTxtDireccionPostalBoleta = By.xpath("//input[@name='customer.address']");
    By locatorTxtNroCalleBoleta = By.xpath("//input[@name='customer.houseNumber']");
    By locatorTxtPostCodeBoleta = By.xpath("//input[@name='customer.postCode']");
    By locatorTxtCiudadBoleta = By.xpath("//input[@name='customer.city']");
    By locatorPaisBoleta = By.xpath("(//div[@aria-haspopup='listbox'])[2]");
    By locatorSeleccionPaisBoleta = By.xpath("//li[@data-flag-key='flag_no_42']");
    By locatorTxtCorreoBoleta = By.xpath("//input[@name='customer.email']");
    By locatorBtnCodTelefonoBoleta = By.xpath("(//div[@class='selected-dial-code'])[2]");
    By locatorSeleccionCodTelefono = By.xpath("(//li[@data-country-code='cl'])[3]");
    By locatorTxtNroTelefonoBoleta = By.xpath("//input[@name='business.phone']");
    By locatorBtnReservaAhora = By.xpath("//button[@data-test='submit-button']");

    public void completarBusqueda_OrigenDestino_Incorrectos(String origen, String destino){
        esperarXSegundos(2000);
        click(locatorClearOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen), origen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),destino);
        esperarXSegundos(1000);
        click(locatorBtnFechaIda);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFechaIda);
        esperarXSegundos(1000);
        click(locatorFechaVuelta);
        esperarXSegundos(1000);
        click(locatorAumentoViajeros);
        esperarXSegundos(2000);
    }
    public void completarBusqueda (String origen, String destino){
        esperarXSegundos(2000);
        click(locatorClearOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen),origen);
        esperarXSegundos(4000);
        click(locatorOptOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),destino);
        esperarXSegundos(4000);
        click(locatorOptDestino);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFechaIda);
        esperarXSegundos(3000);
        click(locatorFechaVuelta);
        esperarXSegundos(3000);
        click(locatorViajeros);
        esperarXSegundos(2000);
        click(locatorAumentoViajeros);
        esperarXSegundos(1000);
        click(locatorBtnClase);
        esperarXSegundos(1000);
        click(locatorOptClase);
        esperarXSegundos(1000);
        click(locatorBtnBuscar);
        esperarXSegundos(2000);
    }
    public void seleccionVueloPreseleccionado(){
        esperarXSegundos(10000);
        click(locatorBtnViajePreseleccionado);
        esperarXSegundos(2000);
    }
    public void completarBusqueda_DetallesHotel(String origen, String destino){
        esperarXSegundos(2000);
        click(locatorClearOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen),origen);
        esperarXSegundos(5000);
        click(locatorOptOrigen);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),destino);
        esperarXSegundos(4000);
        click(locatorOptDestino);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFechaIda);
        esperarXSegundos(1000);
        click(locatorFechaVuelta);
        esperarXSegundos(1000);
        click(locatorAumentoViajeros);
        esperarXSegundos(1000);
        click(locatorAumentoViajeros);
        esperarXSegundos(1000);
        click(locatorAumentoViajeros);
        esperarXSegundos(1000);
        click(locatorBtnClase);
        esperarXSegundos(1000);
        click(locatorOptClase);
        esperarXSegundos(1000);
        click(locatorBtnVueloHotel);
        esperarXSegundos(13000);
        //
        click(locatorBtnMejorValorado);
        esperarXSegundos(5000);
        click(locatorOptHotel);
        esperarXSegundos(2000);
        click(locatorBtnHabitaciones);
        esperarXSegundos(10000);
        click(locatorBtnSeleccionHabitacion);
        esperarXSegundos(10000);
        click(locatorBtnDetallesHotel);
        esperarXSegundos(1000);
        click(locatorBtnCloseDetalleHotel);
        esperarXSegundos(1000);
        click(locatorBtnInicioPremium);
        esperarXSegundos(1000);
    }
    public void seleccionAlojamiento_VueloHotel(){
        esperarXSegundos(10000);
        click(locatorSeleccionAlojamiento);
        esperarXSegundos(10000);
        //
        click(locatorBtnHabitaciones);
        esperarXSegundos(1000);
        click(locatorBtnSeleccionHabitacion);
        esperarXSegundos(10000);
        click(locatorBtnSeleccionPlus);
        esperarXSegundos(2000);
    }
    public void completarFormularioQuienReserva(String name, String lastname, String mail, String phone){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtNombre),name);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtApellido),lastname);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtEmail),mail);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtTelefono),phone);
        esperarXSegundos(2000);
    }
    public void completarFormularioQuienViaja_Huesped1(String nameH1, String surnameH1, String dianacH1, String anionacH1){
        esperarXSegundos(2000);
        click(locatorRBH1Genero);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorH1Nombre),nameH1);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH1Apellido),surnameH1);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH1DiaNac),dianacH1);
        esperarXSegundos(1000);
        click(locatorH1MesNac);
        esperarXSegundos(2000);
        click(locatorH1SeleccionMesNac);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH1AnioNac),anionacH1);
        esperarXSegundos(2000);
    }
    public void completarFormularioQuienViaja_Huesped2(String nameH2, String surnameH2, String dianacH2, String anionacH2){
        esperarXSegundos(2000);
        click(locatorRBH2Genero);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorH2Nombre),nameH2);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH2Apellido),surnameH2);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH2DiaNac),dianacH2);
        esperarXSegundos(1000);
        click(locatorH2MesNac);
        esperarXSegundos(2000);
        click(locatorH2SeleccionMesNac);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH2AnioNac),anionacH2);
        esperarXSegundos(2000);
    }
    public void completarFormularioQuienViaja_Huesped3(String nameH3, String surnameH3, String dianacH3, String anionacH3){
        esperarXSegundos(2000);
        click(locatorRBH3Genero);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorH3Nombre),nameH3);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH3Apellido),surnameH3);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH3DiaNac),dianacH3);
        esperarXSegundos(1000);
        click(locatorH3MesNac);
        esperarXSegundos(2000);
        click(locatorH3SeleccionMesNac);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorH3AnioNac),anionacH3);
        esperarXSegundos(2000);
    }
    public void completarSeguroYFormulario_ComoDeseaPagar(String titulartarjeta, String nrotarjeta, String mescaducidad, String aniocaducidad, String cvv){
        esperarXSegundos(2000);
        click(locatorRBSeguroProteccionTotal);
        esperarXSegundos(2000);
        click(locatorBtnSiguientePago);
        esperarXSegundos(4000);
        agregarTexto(esperarAElementoWeb(locatorTxtTitularTarjeta), titulartarjeta);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtNroTarjeta), nrotarjeta);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtMesCaducidad),mescaducidad);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtAnioCaducidad),aniocaducidad);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtCVV),cvv);
        esperarXSegundos(2000);
    }
    public void completarFormularioPagoParticular(String nif, String nombre, String apellido, String direccion, String nrocalle, String codpostal, String ciudad, String correo, String telefono){
        esperarXSegundos(2000);
        click(locatorBtnParticular);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtNIF_CIF),nif);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtNameBoleta),nombre);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtSurNameBoleta),apellido);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtDireccionPostalBoleta),direccion);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtNroCalleBoleta),nrocalle);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtPostCodeBoleta),codpostal);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtCiudadBoleta),ciudad);
        esperarXSegundos(1000);
        click(locatorPaisBoleta);
        esperarXSegundos(3000);
        click(locatorSeleccionPaisBoleta);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtCorreoBoleta),correo);
        esperarXSegundos(2000);
        click(locatorBtnCodTelefonoBoleta);
        esperarXSegundos(3000);
        click(locatorSeleccionCodTelefono);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtNroTelefonoBoleta),telefono);
        esperarXSegundos(2000);
        click(locatorBtnReservaAhora);
        esperarXSegundos(7000);
    }
    public String obtenerErrorOrigen(){
        return obtenerTexto(locatorTxtError_BusquedaOrigen);
    }
    /*
    public String obtenerViajePreseleccionado(){

    }
    */
}
