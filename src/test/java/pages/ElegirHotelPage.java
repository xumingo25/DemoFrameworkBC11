package pages; //test 1

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class ElegirHotelPage extends BaseClass {

    public ElegirHotelPage(WebDriver driver) {
        super(driver);
    }
//test 1----------------------------------------------------------------------------------------------------------
    By locatorBtnSelecHotel = By.xpath("//div[@class='sc-iTFTee libLOB']");

    public void btnselechotel() throws InterruptedException {
        Thread.sleep(3000);
        click(esperarAElementoWeb(locatorBtnSelecHotel));
    }
//test 2----------------------------------------------------------------------------------------------------------
    By locatorSlcHotel = By.xpath("(//div[@class='sc-iTFTee libLOB'])[1]");

    public void slchotel() throws InterruptedException {
        Thread.sleep(3000);
        click(esperarAElementoWeb(locatorSlcHotel));
    }
}