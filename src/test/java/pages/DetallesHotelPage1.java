package pages; //test 1

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class DetallesHotelPage1 extends BaseClass {
    public DetallesHotelPage1(WebDriver driver) {
        super(driver);
    }
//test 1-----------------------------------------------------------------------------------------------------------
    By locatorBtn = By.xpath("//body/div[@id='__next']/div[2]/section[1]/div[3]");
    By locatorBtnContinua1 = By.xpath("//*[contains(@class,'cCKWYE')]");

    public void buscarbtn() throws InterruptedException {
        Thread.sleep(4000);
        click(esperarAElementoWeb(locatorBtn));
        scrollElementoWeb(locatorBtn);
    }
    public void btncontinua1() throws InterruptedException {
        Thread.sleep(4000);
        click(esperarAElementoWeb(locatorBtnContinua1));
    }
//test 2----------------------------------------------------------------------------------------------------------
    By locatorTocarBoton = By.xpath("(//*[contains(@class,'eWQlOC')])[1]");
    By locatorTocarBoton2 = By.xpath("(//button[@data-testid='checkout-button'])[1]");

    public void tocarboton(){
        click(esperarAElementoWeb(locatorTocarBoton));
    }
    public void tocarboton2(){
        click(esperarAElementoWeb(locatorTocarBoton2));
    }


}
