package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class ResultadoEsperadoHotelesPage extends BaseClass {
    public ResultadoEsperadoHotelesPage(WebDriver driver) {
        super(driver);
    }
    By locatorResultadoHoteles = By.xpath("//div[contains(text(),'Alojamientos para cualquier destino')]");
    By locatorResultadoHoteles2 = By.xpath("//div[contains(text(),'Alojamientos en Buenos Aires')]");



    public String resultadoHoteles(){
        return obtenerTexto(esperarAElementoWeb(locatorResultadoHoteles));
    }

    public String resultadoHoteles2(){
        return obtenerTexto(esperarAElementoWeb(locatorResultadoHoteles2));
    }
}
