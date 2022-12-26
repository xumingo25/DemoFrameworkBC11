package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnHoteles = By.xpath(("//a[contains(text(), 'Hoteles')]")); //locator del boton Hoteles
    By locatorBtnVueloMasHotel = By.xpath("//a[contains(text(), 'Vuelo + Hotel')]");
    By LocatorCookies = By.xpath(("//button[contains(text(),'Rechazar')]")); //locator del boton rechazar cookies
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
    //Metodo para abrir PopUp Login
public void irALogin () {
    click(esperarAElementoWeb(locatorBtnLogin));
}
public void irAVuelos () {
    click(esperarAElementoWeb(locatorBtnVuelos));
    }
    //Metodo para completar formulario
public void CompletarLogin (String correo, String password){
    agregarTexto(esperarAElementoWeb(locatorInputEmailLogin),correo);
    agregarTexto(esperarAElementoWeb(locatorInputPasswordLogin),password);
    click(esperarAElementoWeb(locatorSubmitLogin));
}
    //clickea en el boton de hoteles
    public void BtnHoteles(){
        click(esperarAElementoWeb(locatorBtnHoteles));
    }
    public void BtnVueloMasHotel(){
        click(esperarAElementoWeb(locatorBtnVueloMasHotel));
    }

    //rechazar las cookies porque no me deja avanzar si nó
    public void BtnRechazar(){

        click(esperarAElementoWeb(LocatorCookies));

        esperarXSegundos(1000);
    }

}
