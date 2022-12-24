package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HotelesPage extends BaseClass {

    public HotelesPage(WebDriver driver) {
        super(driver);
    }



    By locatorTxtDondeQuieresIr = By.xpath("//input[@placeholder='¿Adónde quieres ir?']");
    By locatorTxtFechaIda = By.xpath("(//button[@type='button'])[13] or @class,'display-19sl708-DateInput-styled-DateInput-styled')])[1] ");
    By locatorTxtFechaVuelta = By.xpath("(//button[contains(@type,'button')])[14] or @class,'display-3uz90')]");
    // By locatorTxTHabitacion = By.xpath("(//button[contains(@type,'button')])[15]");
    // By locatorTxtBtnBuscar = By.xpath("(//button[@type='submit'][normalize-space()='Buscar'])[2]");
    By locatorResultadoBusqueda = By.xpath("//div/ul[@role= 'listbox']");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorRBOrigen= By.xpath("(//span[normalize-space()='lun, 26 dic'])[1]");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),1)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),15)]");
    By locatorBtnBuscar = By.xpath("(//button[@type='submit'][normalize-space()='Buscar'])[2]");


    public String getUrl1(){
        String url1 = driver.getCurrentUrl();
        return url1;
    }

    //realizar accion en el sitio
    public void completarBusqueda(String dondeQuieresIr){
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDondeQuieresIr),dondeQuieresIr);
        esperarXSegundos(1000);
        click(locatorResultadoBusqueda);
        //click(locatorRBOrigen);
        esperarXSegundos(5000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(1000);
        click(locatorFVuelta);
        esperarXSegundos(1000);
        click(locatorAumentarViajeros);
        esperarXSegundos(1000);
        // click(esperarAElementoWeb(locatorBtnBuscar));
        esperarXSegundos(3000);
        click(locatorBtnBuscar);



    }



    public String getUrl2() {
        String url2 = driver.getCurrentUrl();
        return url2;

    }





}
