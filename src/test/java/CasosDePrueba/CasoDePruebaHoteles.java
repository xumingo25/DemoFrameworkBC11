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
    public void CP001_Busqueda_Hoteles_Semana_Cualquier_Fecha(){
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.Completar("barcelona");
        Assert.assertEquals(HotelPage.obtenerResultados(),"300+ resultados encontrados para Fin de semana cualquier fecha");
    }

}