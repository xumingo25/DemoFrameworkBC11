package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By locatorBtnHoteles = By.xpath(("//a[contains(text(), 'Hoteles')]")); //locator del boton Hoteles
    By LocatorCookies = By.xpath(("//button[contains(text(),'Rechazar')]")); //locator del boton rechazar cookies


    //clickea en el boton de hoteles
    public void BtnHoteles(){
        click(esperarAElementoWeb(locatorBtnHoteles));
    }

    //rechazar las cookies porque no me deja avanzar si nó
    public void BtnRechazar(){

        click(esperarAElementoWeb(LocatorCookies));

        esperarXSegundos(1000);
    }

}
