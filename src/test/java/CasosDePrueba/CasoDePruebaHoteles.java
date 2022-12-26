package CasosDePrueba;


import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.HomePage;
import Pages.HotelPage;
import Pages.VuelosPage;
import utils.DataDriven;

import java.util.ArrayList;

public class CasoDePruebaHoteles {


    private Pages.HomePage HomePage;
    private HotelPage HotelPage;

    private SearchPage SearchPage;

    private FormPage FormPage;
    private WebDriver driver;
    private String browser = "CHROME";
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.rumbo.es/";

    private ArrayList<String> data;

    @BeforeMethod
    public void preparacionTest() {
        data = new ArrayList<String>();
        HomePage = new HomePage(driver); //Se crea la page del home
        HomePage.conexionBrowser(browser, propertyDriver, urlDriver); //Se conecta el driver de chrome
        HomePage = new HomePage(HomePage.getDriver());
        HomePage.cargarPagina(url);
        HomePage.maximizarBrowser();
        HotelPage = new HotelPage(HomePage.getDriver());
        SearchPage = new SearchPage(HomePage.getDriver());
        FormPage = new FormPage(HomePage.getDriver());

    }

    //HOTELES TESTS

    @Test
    public void CP001_Busqueda_De_Alojamiento(){
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles("Barcelona",28,29);
        Assert.assertEquals(HotelPage.obtenerResultadoCP001(),"300+ resultados encontrados para 27 feb - 28 mar");

    }

    @Test
    public void CP002_Busqueda_De_Paquetes_Disponibles(){

        data = DataDriven.getData("CP002_Busqueda_De_Paquetes_Disponibles");

        HomePage.BtnRechazar();
        HomePage.BtnVueloMasHotel();
        HotelPage.CompletarVueloMasHoteles(data.get(1), data.get(2), data.get(3), data.get(4));
        Assert.assertEquals(HotelPage.obtenerResultadoCP002(),data.get(5));
    }

    @Test
    public void CP003_Elegir_Alojamiento(){
        HomePage.BtnRechazar();
        /*HomePage.irALogin();
        HomePage.CompletarLogin("Lautaro.coria@tsoftglobal.com","123456");*/
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles("Barcelona",28,29);
        HotelPage.BtnSeleccionAloj();
        Assert.assertEquals(HotelPage.obtenerResultadoCP003(),"Elige habitación y régimen");
    }
    @Test
    public void CP004_Busqueda_Hoteles_Cambio_Lugar(){
        data = DataDriven.getData("CP004_Busqueda_Hoteles_Cambio_Lugar");
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles(data.get(1), data.get(3), data.get(4));
        SearchPage.RealizarCambiosBusquedaLugar(data.get(1), data.get(5));
        Assert.assertEquals(HotelPage.obtenerResultadoCP004(),data.get(6));
    }

    @Test
    public void CP005_Buscar_Opciones_Disponibles_Tren_Mas_Hotel(){
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.irATrenHotel();
        HotelPage.CompletarTrenMasHotel("","",28,29);
        HotelPage.BtnSeleccionAloj();





    }

    @Test
    public void CP006_Busqueda_Hoteles_Obtener_Reserva(){
        data = DataDriven.getData("CP006_Busqueda_Hoteles_Obtener_Reserva");

        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles(data.get(1), data.get(3), data.get(4));
        SearchPage.ElegirPrimeraOpcionFoto();

//El driver tiene que cambiar de TAB
        //
        ArrayList<String> tabs2 = new ArrayList<String> (SearchPage.getDriver().getWindowHandles());
        SearchPage.getDriver().switchTo().window(tabs2.get(1));


        SearchPage.ElegirHabitacionYelegirPrimerOpcion();
        FormPage.RellenarFormulario(data.get(5),data.get(6),data.get(7),data.get(8));

        Assert.assertEquals(FormPage.obtenerResultadoCP006(),data.get(9));
    }

}