package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class DatosPersonPage extends BaseClass {
    public DatosPersonPage(WebDriver driver) { super(driver);}

    By locatorTxtNombre = By.name("name");
    By locatorTxtApellido = By.name("surname");
    By locatorTxtCorreo = By.id("email");
    By locatorTxtTelefono = By.id("Teléfono");



    public void completarFormularioRegistro(String name ,String surname, String email,String teléfono){

        //Completar Formulario
        esperaXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtNombre),name);
        agregarTexto(esperarAElementoWeb(locatorTxtApellido ),surname);
        agregarTexto(esperarAElementoWeb(locatorTxtCorreo),email);
        agregarTexto(esperarAElementoWeb(locatorTxtTelefono),teléfono);
    }
// falta completar

}
