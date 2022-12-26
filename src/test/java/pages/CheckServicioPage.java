package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class CheckServicioPage extends BaseClass {
    public CheckServicioPage(WebDriver driver) {
        super(driver);
    }
    By locatorBtnBasico = By.xpath("//button[@class='Button-sc-1bbve8d-0 gzlNtv']");

    public void btnbasico(){
        click(esperarAElementoWeb(locatorBtnBasico));
    }
}
