package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

//test 2
public class IdeaDeViajePage extends BaseClass {
    public IdeaDeViajePage(WebDriver driver) {
        super(driver);
    }

    By locatorLlenaTexto2 = By.xpath("//input[@placeholder='¿Adónde quieres ir?']");

    By locatorBtnBuscar2 = By.xpath("//button[@type='submit']");



    public void llenartexto2() throws InterruptedException {
        Thread.sleep(5000);
        click(esperarAElementoWeb(locatorLlenaTexto2));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='¿Adónde quieres ir?']")).sendKeys("Maldivas, Oceano Indico");
    }
    public void btnbuscar2() throws InterruptedException {
        Thread.sleep(3000);
        click(esperarAElementoWeb(locatorBtnBuscar2));
    }




}
