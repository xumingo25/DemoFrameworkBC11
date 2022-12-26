package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import java.util.List;

public class VuelosPage extends BaseClass {

    private By locatorBtnSoloIda= By.xpath("//div[contains(text(),'ida')]");
    private By locatorTxtOrigen= By.xpath("//input[@id='mui-1']");
    private By locatorTxtDestino= By.xpath("//input[@id='mui-2']");
    private By locatorBtnFechaIda = By.xpath("(//label[contains(text(),'Fecha de ida')])[2]");
    private By locatorBtnVueloMasHotel = By.xpath("//button[@aria-label='Vuelo + Hotel']");
    private By locatorBtnMultidestino= By.xpath("//a[contains(text(),'Multidestino')]");
    private By locatorBtnBuscar= By.xpath("//button[@type='submit']");
    private By locatorPrimerResultadoDestino= By.xpath("//li[@id='mui-2-option-0']");
    private By locatorBtnSiguienteMes= By.xpath("//button[@aria-label='Next month']");

    private By locatorMes1 = By.xpath("//div[@aria-labelledby='0']");
    private By locatorMes2 = By.xpath("//div[@aria-labelledby='1']");
    private By locatorAlertaMas31dias= By.xpath("//span[@role=\"alert\"]");

    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    public void fecha_ida_y_vuelta(int diaIda, int diaVuelta) {
        click(esperarAElementoWeb(locatorBtnFechaIda));
        click(esperarAElementoWeb(locatorBtnSiguienteMes));

        elegirDia(diaIda-1, locatorMes1);
        elegirDia(diaVuelta-1,locatorMes2);
    }
    private void elegirDia(int dia, By locatorMes){
        esperarAElementoWeb(locatorMes);
        WebElement mes = buscarElementoWeb(locatorMes);
        List<WebElement> diasMes = mes.findElements(By.tagName("button"));
        diasMes.get(dia).click();
    }


    public void irAMultidestino(){
        click(esperarAElementoWeb(locatorBtnMultidestino));
    }

    public void irASoloIda(){
        click(esperarAElementoWeb(locatorBtnSoloIda));
    }

    public void irAVueloMasHotel(){
        click(esperarAElementoWeb(locatorBtnVueloMasHotel));
    }
    public void ingresarOrigen(String origen){
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen),origen);
    }

    public void ingresarDestino(String destino){
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),destino);
        click(esperarAElementoWeb(locatorPrimerResultadoDestino));

    }

    public void clickBuscar(){
        click(esperarAElementoWeb(locatorBtnBuscar));
    }

    public String obtenerTextoErrorMas31dias(){
        return obtenerTexto(esperarAElementoWeb(locatorAlertaMas31dias));
    }

}
