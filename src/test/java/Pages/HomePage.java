package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnLogin = By.xpath("//button/p" );
    By locatorInputEmailLogin = By.name("email");
    By locatorInputPasswordLogin = By.name("password");
    By locatorSubmitLogin = By.xpath("//button[contains(text(),'Iniciar sesión')]");
    By locatorBtnVuelos = By.xpath("//a[@title='Vuelos']" );
    /*
    LOCALIZADORES
    ----------------------------------------------
    By locatorBtnHoteles = By.xpath("//a[@title='Hoteles']" );
    By locatorBtnTrenes = By.xpath("//a[@title='Trenes']" );
    By locatorBtnTrenMasHotel = By.xpath("//a[@title='Tren + Hotel']" );
    */

public void irALogin () {
    click(esperarAElementoWeb(locatorBtnLogin));
}
public void irAVuelos () {
    click(esperarAElementoWeb(locatorBtnVuelos));
    }
public void CompletarLogin (String correo, String password){
    agregarTexto(esperarAElementoWeb(locatorInputEmailLogin),correo);
    agregarTexto(esperarAElementoWeb(locatorInputPasswordLogin),password);
    click(esperarAElementoWeb(locatorSubmitLogin));
}

}
