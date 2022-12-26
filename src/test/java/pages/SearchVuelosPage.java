package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class SearchVuelosPage extends BaseClass {

    private By locatorPrimerResultadoVuelo= By.xpath("(//div[contains(text(),'Precio normal')])[1]");


    public SearchVuelosPage(WebDriver driver) {
        super(driver);
    }

    public void irAPrimerVuelo(){
        click(esperarAElementoWeb(locatorPrimerResultadoVuelo));
    }

}
