package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class CP_juancarlos {
    private HomePage homePage;
    private VuelosPage vuelosPage;
    private SearchVuelosPage searchVuelosPage;
    private CheckoutVuelosPage checkoutVuelosPage;
    private SearchMultidestinoPage searchMultidestinoPage;

    //--------------------------
    private WebDriver driver;
    private String browser = "CHROME"; //Este valor eventualmente se vera modificado
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.rumbo.es/";

    @BeforeMethod
    public void preparacionTests(){
        homePage = new HomePage(driver); //Se crea la page del home
        homePage.conexionBrowser(browser,propertyDriver,urlDriver); //Se conecta el driver de chrome
        homePage.cargarPagina(url);
        homePage.maximizarPagina();

        vuelosPage= new VuelosPage(homePage.getDriver());
        searchVuelosPage = new SearchVuelosPage(homePage.getDriver());
        checkoutVuelosPage = new CheckoutVuelosPage(searchVuelosPage.getDriver());
        searchMultidestinoPage= new SearchMultidestinoPage(vuelosPage.getDriver());

    }

    @AfterMethod
    public void posTests(){
       //homePage.cerrarBrowser();
    }

    @Test
    public void CP001_reserva_vuelo_solo_ida(){
        homePage.rechazarCookies();
        homePage.irAVuelos();
        vuelosPage.irASoloIda();
        vuelosPage.ingresarDestino("Buenos Aires Todos los aeropuertos, Argentina");
        vuelosPage.clickBuscar();
        searchVuelosPage.irAPrimerVuelo();
        checkoutVuelosPage.seleccionar_Cassic_or_flexible("Classic");
        checkoutVuelosPage.ingresarDatosPasajero1(
                "Juan",
                "Mercado",
                "juanmercado@gmail.com",
                "3804112233",
                "22",
                "1994",
                "mayo");
        checkoutVuelosPage.seleccionarTarifaSinDescuentoPlus();
        Assert.assertEquals(checkoutVuelosPage.obtenerTextoBotonReservar(),"Reservar ahora");
    }

    @Test
    public void CP002_reserva_paquete_vuelo() throws InterruptedException {
        homePage.rechazarCookies();
        homePage.irAVuelos();
        vuelosPage.irAMultidestino();
        searchMultidestinoPage.ingresarDestino();
    }

    @Test
    public void CP003_reservar_paquete_vuelo_noches_mayor_31(){
        homePage.rechazarCookies();
        homePage.irAVuelos();
        vuelosPage.irAVueloMasHotel();
        vuelosPage.fecha_ida_y_vuelta(10,15);
        Assert.assertEquals("Lo sentimos, no se pueden reservar más de 31 noches",vuelosPage.obtenerTextoErrorMas31dias());
    }
}
