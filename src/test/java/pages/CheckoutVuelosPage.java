package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class CheckoutVuelosPage extends BaseClass {

    private By locatorBtnClassic = By.xpath("(//button[@data-test='travel-pack-fare-button'])[1]");
    private By getLocatorBtnFlexible= By.xpath("(//button[@data-test='travel-pack-fare-button'])[2]");
    private By locatorTxtNombreReserva= By.xpath("//input[@name='name']");
    private By locatorTxtApellidoReserva= By.xpath("//input[@name='surname']");
    private By locatorTxtMail= By.xpath("//input[@id='contact-email']");
    private By locatorTxtTelefono= By.xpath("//input[@name='phone']");
    private By locatorRdBtnAdultoSr= By.xpath("//label[@id='radio-groups.1.travellers.1.title-MALE-label']");
    private By LocatorTxtDiaNac= By.xpath("//input[@placeholder='DD']");
    private By LocatorTxtAnioNac= By.xpath("//input[@placeholder='AAAA']");
    private By locatorDDLMesNac= By.xpath("//select[@aria-label='Selecciona el mes']");
    private By locatorRdBtnTarifaSinDescuento= By.xpath("//span[contains(text(),'Tarifa sin descuento Plus')]");
    private By locatorBtnSiguiente= By.xpath("//button[@data-test='lead-generation-submit-btn']");
    private By locatorBtnReservar= By.xpath("//button[@data-test='submit-button']");
    private By LocatorLblTarjetaNoIngresada= By.xpath("//label[contains(text(),'Introduce el nombre del titular de la tarjeta')]");
    private By locatorRdBtnSinEquipaje= By.xpath("//label[@for='luggage-selection']");



    public CheckoutVuelosPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionar_Cassic_or_flexible(String servicio) {
        if (servicio.equalsIgnoreCase("Classic")){
            click(esperarAElementoWeb(locatorBtnClassic));
        } else if (servicio.equalsIgnoreCase("Flexible")) {
            click(esperarAElementoWeb(getLocatorBtnFlexible));
        }
    }

    public void ingresarDatosPasajero1(String nombre, String apellido, String mail, String telefono, String diaNac, String anioNac, String mes){
        agregarTexto(esperarAElementoWeb(locatorTxtNombreReserva),nombre);
        agregarTexto(esperarAElementoWeb(locatorTxtApellidoReserva),apellido);
        agregarTexto(esperarAElementoWeb(locatorTxtMail),mail);
        agregarTexto(esperarAElementoWeb(locatorTxtTelefono),telefono);
        click(esperarAElementoWeb(locatorRdBtnAdultoSr));
        agregarTexto(esperarAElementoWeb(LocatorTxtDiaNac), diaNac);
        seleccionarDDlPorTexto(esperarAElementoWeb(locatorDDLMesNac),mes);
        agregarTexto(esperarAElementoWeb(LocatorTxtAnioNac), anioNac);
        click(esperarAElementoWeb(locatorRdBtnSinEquipaje));
        click(esperarAElementoWeb(locatorBtnSiguiente));
    }

    public void seleccionarTarifaSinDescuentoPlus(){
        click(esperarAElementoWeb(locatorRdBtnTarifaSinDescuento));
        click(esperarAElementoWeb(locatorBtnSiguiente));
    }

    public String obtenerTextoBotonReservar(){
        scrollElementoWeb(esperarAElementoWeb(locatorBtnReservar));
        return obtenerTexto(esperarAElementoWeb(locatorBtnReservar));
    }

    public String alertaTarjetaNoIngresada(){
        return obtenerTexto(esperarAElementoWeb(LocatorLblTarjetaNoIngresada));
    }
}
