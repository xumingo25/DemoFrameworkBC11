package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class DetailsHotelPage extends BaseClass {
    public DetailsHotelPage(WebDriver driver) { super(driver);}


    By locatorElegirHabitacion = By.xpath("//button[contains(text(),'Elegir tipo de alojamiento')]");

    By locatorSoloAlojamiento = By.xpath("(//button[contains(text(),'Continuar')])[1]");

    public void ElegirHabitacionYelegirPrimerOpcion(){
        esperaXSegundos(5000);
        click(esperarAElementoWeb(locatorElegirHabitacion));
        click(esperarAElementoWeb(locatorSoloAlojamiento));
    }




}
