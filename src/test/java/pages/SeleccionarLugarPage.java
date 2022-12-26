package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class SeleccionarLugarPage extends BaseClass {
    public SeleccionarLugarPage(WebDriver driver) {super(driver);}



    By locatorSeleccionarHospedaje = By.xpath("(//span[@class='sc-ilhmMj DjjEr'])[1]");
    By locatorSeleccionMapaHospedaje = By.xpath("(//div[@class='sc-jhrdCu mqbYL marker'])[8]");
    By locatorSelecionHotelesMapa= By.xpath("(//span[@class='sc-ilhmMj DjjEr'])[21]");



    public void hospedajeSeleccion(){click(esperarAElementoWeb(locatorSeleccionarHospedaje));}
    public  void seleccionMapaHospedaje(){click(esperarAElementoWeb(locatorSeleccionMapaHospedaje));}
    public void selecionHotelesMapasGps(){click(esperarAElementoWeb(locatorSelecionHotelesMapa));}



}
