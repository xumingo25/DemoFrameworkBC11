package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class OutletVuelosPage extends BaseClass {

    public OutletVuelosPage(WebDriver driver) {
        super(driver);
    }
    By clickPrimeraOpcion = By.xpath("(//div[@class='display-cm4uq0-HubFlightsCard-styled-cardElevations ejyvcqv5'])");

    public void primeraOpcion (){
        click(esperarAElementoWeb(clickPrimeraOpcion));
    }


}
