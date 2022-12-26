package pages;
//test 4

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class FlashSalesPage extends BaseClass {
    public FlashSalesPage(WebDriver driver) {
        super(driver);
    }
    By locatorBtnImgOfer = By.xpath("(//*[contains(@class,'e1x2arz19')])[8]");



    public void imgofer() throws InterruptedException {
        Thread.sleep(5000);
        click(esperarAElementoWeb(locatorBtnImgOfer));
    }
}
