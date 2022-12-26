package CasosDePrueba;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.HomePage;
import Pages.HotelPage;
import Pages.TrenesPage;
import Pages.VuelosPage;

public class CasoDePruebaHoteles {


    private Pages.HomePage HomePage;
    private HotelPage HotelPage;
    private WebDriver driver;
    private String browser = "CHROME";
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.rumbo.es/";

    @BeforeMethod
    public void preparacionTest() {
        HomePage = new HomePage(driver); //Se crea la page del home
        HomePage.conexionBrowser(browser, propertyDriver, urlDriver); //Se conecta el driver de chrome
        HomePage = new HomePage(HomePage.getDriver());
        HomePage.cargarPagina(url);
        HomePage.maximizarBrowser();
        HotelPage = new HotelPage(HomePage.getDriver());

    }

    //HOTELES TESTS
    @Test
    public void CP001_Busqueda_Hoteles_Semana_Cualquier_Fecha() {
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.Completar("barcelona");
        Assert.assertEquals(HotelPage.obtenerResultados(), "300+ resultados encontrados para Fin de semana cualquier fecha");
    }

    @Test
    public void CP003_Elegir_Alojamiento() throws InterruptedException {
        HomePage.BtnRechazar();
        HomePage.irALogin();
        Thread.sleep(2000);
        HomePage.CompletarLogin("lautaro.coria@tsoftglobal.com", "123456");
        HomePage.BtnHoteles();
        HotelPage.Completar("Barcelona");
        HotelPage.BtnSeleccionAloj();
    }

    @Test
    public void CP005_Buscar_Opciones_Disponibles_Tren_Mas_Hotel(){
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.BtnVueloHotel();
        HotelPage.CompletarFormVueloHotel();

        /*HotelPage.Selhotel();
        HotelPage.ElegirHab();
        HotelPage.SoloAloj();*/

    }
}