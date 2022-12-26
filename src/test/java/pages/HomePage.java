package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {
    //Localizadores (By) Rodolfo

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Localizadores

    By localizadorBtnTrenes = By.xpath("//div/a[contains(@title,'Trenes')]");
    By localizadorAceptarCoockies = By.xpath("//button[contains(text(),'Rechazar todo')]");

    public void irATrenes(){
        esperaXSegundos(2000);
        click(esperarAElementoWeb(localizadorAceptarCoockies));
        click(esperarAElementoWeb(localizadorBtnTrenes));
    }

    By locatorbtnVerMas = By.xpath("(//div[@class='display-iu1hq3-MenuLink evvzyi81'])[10]");
    By locatorEliminarcookies = By.xpath("//button[contains(text(),'Rechazar todo')]");
    By clickOutletVuelos = By.xpath("(//li[@class='display-1laifbo-DropdownList e12exe0f0'])[4]");


    public void ingresarOutletVuelos(){
        click(esperarAElementoWeb(clickOutletVuelos));
    }

    By locatorbtnEscapadas = By.xpath("//a[@title=\"Escapadas\"]");

    //test 2
    By locatorBtnEvInspirar = By.xpath("//*[contains(@data-opti,'hub-microsite-cards-grid-1650452686588')]");

    //test 4
    By locatorBtnFlsahSales = By.xpath("(//*[contains(@class,'e10w470p0')])[7]");


    public void ingresarVermas(){
        click(esperarAElementoWeb(locatorbtnVerMas));
    }
    public  void  irEliminarCookies(){
        click(esperarAElementoWeb(locatorEliminarcookies));
    }
    //test 1--------------------------------------------------------------------------------------------------
    public void ingresarEscapadas(){
        click(esperarAElementoWeb(locatorbtnEscapadas));
    }

    //test 2--------------------------------------------------------------------------------------------------
    public void ingresar_inspirar(){
        click(esperarAElementoWeb(locatorBtnEvInspirar));
    }
//test 3--------------------------------------------------------------------------------------------------



    //test 4--------------------------------------------------------------------------------------------------
    public void ingresar_flash_sales(){
        click(esperarAElementoWeb(locatorBtnFlsahSales));
    }

    By locatorBtnHotel = By.xpath("(//a[@title='Hoteles'])[1]");


    public void  irBotonHotel(){click(esperarAElementoWeb(locatorBtnHotel));}

    private By locatorBtnCookies= By.xpath("//button[contains(text(),'Rechazar todo')]");
    private By locatorBtnVuelos= By.xpath("//a[@title='Vuelos']");




    //----------------------METODOS-------------------------------------


    public void rechazarCookies(){
        click(esperarAElementoWeb(locatorBtnCookies));
    }

    public void irAVuelos(){
        click(esperarAElementoWeb(locatorBtnVuelos));
    }


}
