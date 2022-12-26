package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

import javax.swing.plaf.PanelUI;

public class HotelesPage extends BaseClass {

    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    By locatorTxtDondeQuieresIr = By.xpath("//input[@placeholder='¿Adónde quieres ir?']");
    By locatorTxtFechaIda = By.xpath("(//button[@type='button'])[13] or @class,'display-19sl708-DateInput-styled-DateInput-styled')])[1] ");
    By locatorTxtFechaVuelta = By.xpath("(//button[contains(@type,'button')])[14] or @class,'display-3uz90')]");
    // By locatorTxTHabitacion = By.xpath("(//button[contains(@type,'button')])[15]");
    // By locatorTxtBtnBuscar = By.xpath("(//button[@type='submit'][normalize-space()='Buscar'])[2]");
    By locatorOtraHabitacion = By.xpath("//button[normalize-space()='Añadir habitación']");
    By locatorResultadoBusqueda = By.xpath("//div/ul[@role= 'listbox']");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorRBOrigen= By.xpath("(//span[normalize-space()='lun, 26 dic'])[1]");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),1)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),15)]");
    By locatorBtnBuscarHoteles = By.xpath("//button[@type= 'submit']");
    By locatorBtnElegirHotel = By.xpath("(//div[@class='sc-iTFTee libLOB']//a[@target='_blank'])[1]");
    By locatorBtnTipoHabitacion = By.xpath("//button[@data-test-id='book-cta']");
    By locatorContinuarHabitacion =By.xpath("(//div[@class='RoomPanelMealPlan___StyledDiv2-sc-u6tmcf-21 jqOeSE']//button)[1]");////button[contains(text(),'Continuar')]
    //(//div[@class="RoomPanelMealPlan___StyledDiv2-sc-u6tmcf-21 jqOeSE"]//button)[1] //(//div[@data-testid='checkout-radio-button'])[1]
    By locatorTxtNombreReserva = By.xpath("//input[@data-test='input-name']");
    By locatorTxtApellidoReserva = By.xpath("//input[@data-test='input-surname']");
    By locatorTxtEmail = By.xpath("//input[@id='contact-email']");
    By locatorTxtNumLocal = By.xpath("//div[@class='selected-dial-code']");
    By locatorTxtTelefono = By.xpath("//input[@name='phone']");
    By locatorBtnCovertura = By.xpath("(//div[@class='radio'])[1]");
    By locatorTxtTitularTarjeta = By.xpath("//input[@data-test='input-creditCard.cardHolder']");
    By locatorTxtNumTarjeta = By.xpath("//input[@data-test='input-creditCard.cardNumber']");
    By locatorTxtFCaducidadDia = By.xpath("(//input[@data-test='input-creditCard.expirationDate'])[1]");
    By locatorTxtFCaducidadMes = By.xpath("(//input[@data-test='input-creditCard.expirationDate'])[2]");
    By locatorBtnHotelDesayuno= By.xpath("(//img[@alt='Desayuno'])[1]");
    By locatorBtnHabitacionDesayuno = By.xpath("//span[@data-testid='meal-plan-name'][contains(text(),'yuno')]");

    By locatorExitoHabitacion= By.xpath("//span[contains(text(),'Añadir huéspedes')]");
    By locatorErrorTarjeta= By.xpath("//label[contains(text(),'Introduce un número válido')]");
    By locatorBusqueda3Habitacion= By.xpath("//div[contains(text(),'Alojamientos en')]");
    By locatorErrorMail = By.xpath("//label[contains(text(),'Introduce un email válido')]");
    public String getUrl3(){
        String url3 = driver.getCurrentUrl();
        return url3;
    }

    //realizar accion en el sitio
    public void completarBusqueda(String dondeQuieresIr){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDondeQuieresIr),dondeQuieresIr);
        esperarXSegundos(3000);
        click(locatorResultadoBusqueda);
        //click(locatorRBOrigen);
        esperarXSegundos(5000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(1000);
        click(locatorFVuelta);
        esperarXSegundos(1000);
        click(locatorAumentarViajeros);
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBtnBuscarHoteles));
        esperarXSegundos(10000);
    }
    public void completarBusqueda2Habitaciones(String dondeQuieresIr){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDondeQuieresIr),dondeQuieresIr);
        esperarXSegundos(3000);
        click(locatorResultadoBusqueda);
        //click(locatorRBOrigen);
        esperarXSegundos(5000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(1000);
        click(locatorFVuelta);
        esperarXSegundos(1000);
        click(locatorAumentarViajeros);
        click(esperarAElementoWeb(locatorOtraHabitacion));
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBtnBuscarHoteles));
        esperarXSegundos(10000);
    }
    public void completarBusqueda3Habitaciones(String dondeQuieresIr){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDondeQuieresIr),dondeQuieresIr);
        esperarXSegundos(3000);
        click(locatorResultadoBusqueda);
        //click(locatorRBOrigen);
        esperarXSegundos(5000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(1000);
        click(locatorFVuelta);
        esperarXSegundos(1000);
        click(locatorAumentarViajeros);
        click(esperarAElementoWeb(locatorOtraHabitacion));
        click(esperarAElementoWeb(locatorOtraHabitacion));
        esperarXSegundos(1000);
        click(esperarAElementoWeb(locatorBtnBuscarHoteles));
        esperarXSegundos(10000);
    }


    //Hotel normal
    public void eleccionHotel(){
        esperarXSegundos(3000);
        click(esperarAElementoWeb(locatorBtnElegirHotel));
        esperarXSegundos(3000);
    }
    public void eleccionHabitacion(){
        esperarXSegundos(2000);
        click(esperarAElementoWeb(locatorBtnTipoHabitacion));
        esperarXSegundos(5000);
        click(esperarAElementoWeb(locatorContinuarHabitacion));
        esperarXSegundos(10000);
    }
    // Hotel Con desayuno
    public void eleccionHotelConDesayuno(){
        esperarXSegundos(3000);
        click(esperarAElementoWeb(locatorBtnHotelDesayuno));
        esperarXSegundos(3000);
    }
    public void eleccionHabitacionConDesayuno(){
        esperarXSegundos(2000);
        click(esperarAElementoWeb(locatorBtnTipoHabitacion));
        esperarXSegundos(5000);
        click(esperarAElementoWeb(locatorBtnHabitacionDesayuno));
        esperarXSegundos(10000);
    }
    //Formulario de reserva
    public void completarFormularioReserva(String nombre, String apellido, String emial,String telefono, String titular, String numtarjeta, String fCaducidadMes, String fCaducidadAnnio){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtNombreReserva),nombre);
        agregarTexto(esperarAElementoWeb(locatorTxtApellidoReserva), apellido);
        agregarTexto(esperarAElementoWeb(locatorTxtEmail),emial);
        esperarXSegundos(1000);
        //agregarTexto(esperarAElementoWeb(locatorTxtNumLocal),sector);
        agregarTexto(esperarAElementoWeb(locatorTxtTelefono), telefono);
        esperarXSegundos(1000);
        ScrollElementoWeb(locatorBtnCovertura);
        click(locatorBtnCovertura);
        esperarXSegundos(1000);
        ScrollElementoWeb(locatorTxtTitularTarjeta);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtTitularTarjeta),titular);
        agregarTexto(esperarAElementoWeb(locatorTxtNumTarjeta),numtarjeta);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorTxtFCaducidadDia),fCaducidadMes);
        agregarTexto(esperarAElementoWeb(locatorTxtFCaducidadMes),fCaducidadAnnio);
        esperarXSegundos(1000);
    }

    //Assert
    public String obtenerErrorTarjeta(){ return obtenerTexto(esperarAElementoWeb(locatorErrorTarjeta));}
    public String obtenerExitoHDesayuno(){return obtenerTexto(esperarAElementoWeb(locatorExitoHabitacion));}
    public String obtenerResultado3Hab(){return obtenerTexto(esperarAElementoWeb(locatorBusqueda3Habitacion));}
    public String obtenerEmailError(){return obtenerTexto(esperarAElementoWeb(locatorErrorMail));}
    public String getUrl2() {
        String url2 = driver.getCurrentUrl();
        return url2;

    }







}
