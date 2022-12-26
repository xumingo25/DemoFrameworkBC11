package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OutletVuelosPage;
import pages.VuelosBaratosPage;

public class CPJuanFerreira {
    //Atributos
    private HomePage homePage;
    private OutletVuelosPage outletVuelosPage;
    private VuelosBaratosPage vuelosBaratosPage;
    private WebDriver driver;
    private String browser = "CHROME";
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.rumbo.es/";

    @BeforeMethod
    public void preparacionTests(){
        homePage = new HomePage(driver); //Se crea la page del home
        homePage.conexionBrowser(browser,propertyDriver,urlDriver); //Se conecta el driver de chrome
        homePage = new HomePage(homePage.getDriver());
        outletVuelosPage = new OutletVuelosPage(homePage.getDriver());


        homePage.cargarPagina(url);
        homePage.maximizarPagina();
    }


    @AfterMethod
    public void posTests(){
        //vuelosBaratosPage.cerrarBrowser();
    }

    @Test
    public void CP017_Outlet_Vuelos () throws InterruptedException {
        Thread.sleep(3000);
        homePage.irEliminarCookies();
        homePage.ingresarVermas();
        homePage.ingresarOutletVuelos();
        Thread.sleep(3000);
        outletVuelosPage.bajarScrollMouse();
        Thread.sleep(2000);
        outletVuelosPage.primeraOpcion();
        Thread.sleep(5000);
        //Assert.assertEquals(vuelosBaratosPage.mensajeFinal(),"Cualquier clase");


    }
    /*
    @Test
    public void CP018_Tarjeta_Regalo() throws InterruptedException {
        Thread.sleep(3000);

    }

     */



}