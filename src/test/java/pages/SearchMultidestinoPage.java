package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class SearchMultidestinoPage extends BaseClass {

    private By locatorTxtDestino= By.xpath("(//input[@data-test=\"SearchField-input\"])[2]");
    private By locatorBtnCerrarViaje = By.xpath("((//button[@aria-label=\"Cerrar\"])[2]");
    private By locatorBtnCerrarCookies = By.xpath("(//button[@aria-label=\"Cerrar\"])[1]");

    private By locatorBtnCancelar= By.xpath("//div[contains(text(),'Cancelar')]");

    //button[@data-test="BackToResultsButton"]

    public SearchMultidestinoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarDestino(){
        agregarTexto(esperarAElementoWeb(locatorTxtDestino),"Madrid");


    }
}
