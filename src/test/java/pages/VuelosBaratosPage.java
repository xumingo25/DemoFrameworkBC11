package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class VuelosBaratosPage extends BaseClass {
    public VuelosBaratosPage(WebDriver driver) {
        super(driver);
    }
    By clickFiltroPrecio = By.xpath("//div[@class='price-filter-container']");
    By clickFiltroPrecioMin = By.xpath("(//span[@class='selected-value-end real-value'])[1]");
    By msjeFinal = By.xpath("//span[contains(text(),'Cualquier clase')]");


    public void filtroPrecio(){
        click(esperarAElementoWeb(clickFiltroPrecio));
    }
    public void precioMin(){
        click(esperarAElementoWeb(clickFiltroPrecioMin));
    }
    public String mensajeFinal(){
        return obtenerTexto(esperarAElementoWeb(msjeFinal));
    }
}
