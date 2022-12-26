package pages; //test 1

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class EscapadasPage extends BaseClass {
    public EscapadasPage(WebDriver driver) {
        super(driver);
    }
    By locatorllenarlugar = By.xpath("//input[@placeholder='¿Adónde quieres ir?']");
    By locatorbtnBuscar = By.xpath("//button[@type='submit']");

    public void llenarlugar() throws InterruptedException {
        click(esperarAElementoWeb(locatorllenarlugar));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='¿Adónde quieres ir?']")).sendKeys("Maldivas, Oceano Indico");
    }
    public void btnbuscar(){
        click(esperarAElementoWeb(locatorbtnBuscar));
    }

}
