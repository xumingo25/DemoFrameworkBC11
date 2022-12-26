package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class QuienReservaPage extends BaseClass {

    public QuienReservaPage(WebDriver driver) {
        super(driver);
    }

    By localizadorRespuestaDatosClientes = By.xpath("//div[contains(text(),'Tu viaje')]");

    public String respuestaDeBusquedaCliente(){

        esperaXSegundos(2000);
        return obtenerTexto(esperarAElementoWeb(localizadorRespuestaDatosClientes));
    }
}
