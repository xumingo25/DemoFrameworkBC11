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

    @BeforeMethod
    public void preparacionTest() {
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

        HomePage.BtnRechazar();
        HomePage.BtnVueloMasHotel();
        HotelPage.CompletarVueloMasHoteles("eze", "madrid", 10, 17);
        Assert.assertEquals(HotelPage.obtenerResultadoCP002(),"Paquete Vuelo + Hotel para Madrid");
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
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles("Barcelona", 10, 17);
        SearchPage.RealizarCambiosBusquedaLugar("Barcelona", "Costa Blanca");
        Assert.assertEquals(HotelPage.obtenerResultadoCP004(),"Alojamientos en Costa Blanca");
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
        HomePage.BtnRechazar();
        HomePage.BtnHoteles();
        HotelPage.CompletarHoteles("Barcelona", 10, 17);
        SearchPage.ElegirPrimeraOpcionFoto();

//El driver tiene que cambiar de TAB
        //
        ArrayList<String> tabs2 = new ArrayList<String> (SearchPage.getDriver().getWindowHandles());
        SearchPage.getDriver().switchTo().window(tabs2.get(1));


        SearchPage.ElegirHabitacionYelegirPrimerOpcion();
        FormPage.RellenarFormulario("Franco","Zarate","ndeah@gmail.com","3804222222");

        Assert.assertEquals(FormPage.obtenerResultadoCP006(),"Realiza el acceso antes de continuar.");
    }

}