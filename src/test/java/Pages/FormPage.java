package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

/**
 * @author Franco
 */
public class FormPage extends BaseClass {
    public FormPage(WebDriver driver) {
        super(driver);
    }



    By locatorNombre = By.xpath("//input[@name='name']");
    By locatorApellido = By.xpath("//input[@name='surname']");
    By locatorMail = By.xpath("//input[@id='contact-email']");
    By locatorPhone = By.xpath("//input[@name='phone']");
    By locatorNoQuieroSeguro = By.xpath("//label[@class='insurance__noThanks-radio-label']");
    By locatorMetodoDePagoPaypal = By.xpath("//span[text()='PayPal']");

    By locatorSubmitForm = By.xpath(" //span[contains(@data-test, 'submit-button')]");

    By locatorResultadoCP006 = By.xpath("//label[contains(text(),'Realiza el acceso antes de continuar.')]");


    public void RellenarFormulario(String Nombre, String Apellido, String Mail, String Telefono){

        agregarTexto(esperarAElementoWeb(locatorNombre),Nombre);
        agregarTexto(esperarAElementoWeb(locatorApellido),Apellido);
        agregarTexto(esperarAElementoWeb(locatorMail),Mail);
        agregarTexto(esperarAElementoWeb(locatorPhone),Telefono);
        ScrollElementoWeb(locatorNoQuieroSeguro);
        click(esperarAElementoWeb(locatorNoQuieroSeguro));
        ScrollElementoWeb(locatorMetodoDePagoPaypal);
        click(esperarAElementoWeb(locatorMetodoDePagoPaypal));
        ScrollElementoWeb(locatorSubmitForm);
        click(esperarAElementoWeb(locatorSubmitForm));


    }
//
    public String obtenerResultadoCP006(){
        esperarXSegundos(1000);
        return obtenerTexto(esperarAElementoWeb(locatorResultadoCP006));
    }

}
