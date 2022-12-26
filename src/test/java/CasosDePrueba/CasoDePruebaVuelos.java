package CasosDePrueba;

import Pages.HomePage;
import Pages.VuelosPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.VuelosPage;
import utils.BaseClass;

public class CasoDePruebaVuelos {


    private Pages.HomePage HomePage;

    private Pages.VuelosPage VuelosPage;
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
        VuelosPage = new VuelosPage(HomePage.getDriver());
        HomePage.BtnRechazar();
    }
    @Test
    public void CP002_Ver_Precios_Ida_Y_Vuelta(){
        HomePage.irAVuelos();
        VuelosPage.SeleccionarIdaYVuelta();
        VuelosPage.SeleccionarOrigen("Buenos Aires Todos los aeropuertos, Argentina");
        VuelosPage.SeleccionarDestino("Medellín Todos los aeropuertos, Colombia");
        VuelosPage.SeleccionarFechaDeIda();
        VuelosPage.CambiarAlMesSiguiente();
        VuelosPage.SeleccionarDia();
        VuelosPage.SeleccionarFechaVuelta();
        VuelosPage.CambiarAlMesSiguiente();
        VuelosPage.SeleccionarDiaVuelta();
        VuelosPage.SeleccionarViajero();
        VuelosPage.SeleccionarClase();
        VuelosPage.SeleccionarBuscar();
    }
}
