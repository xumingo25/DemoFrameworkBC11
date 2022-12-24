package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TrenPage;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class CasosDePruebaTrenes {
    private HomePage homePage;
    private TrenPage trenPage;
    private WebDriver driver;
    private final String browser = PropertiesDriven.getProperty("browser");
    private final String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private final String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private final String url = PropertiesDriven.getProperty("url");

    private ArrayList<String> data; // null
    private ArrayList<String> data2;

    @BeforeMethod
    public void preparacionTests(){
        data= new ArrayList<String>(); //Array de tamaño 0
        data2= new ArrayList<String>(); //Segundo Array para evitar conflictos con data
        homePage = new HomePage(driver);
        homePage.conexionBrowser(browser,propertyDriver,urlDriver);
        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
        trenPage = new TrenPage(homePage.getDriver());
    }

    @AfterMethod
    public void posTests(){;
    }

    @Test
    public void CP007_BusquedaTrenes_IdaVuelta() {
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino("Madrid","Barcelona");
        trenPage.completarBusquedaMes();
        trenPage.aumentarViajero();
        trenPage.clickBuscar();
        trenPage.getUrl2();
        String resultadoObtenido= trenPage.getUrl2();

        Assert.assertTrue(resultadoObtenido.startsWith("https://trenes.rumbo.es"));


    }
    @Test
    public void CP008_BusquedaTrenes_ViajeAdultoNihno() {
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino("Madrid", "Barcelona");
        trenPage.completarBusquedaMes();
        trenPage.agregarNihno();
        trenPage.contadorPasajerosAdultos();
        trenPage.clickBuscar();

        Assert.assertEquals(2,trenPage.obtenerTotalPasajerosResultadoBusqueda());
    }

    @Test
    public void CP009_BusquedaTrenes_SeleccionarTicketMasBarato() {

    }
    @Test
    public void CP010_BusquedaTrenes_ModificarParámetrosOfertasTrenHotel() {

    }
    @Test
    public void CP011_BusquedaTrenes_TarjetaVencida() {

    }
    @Test
    public void CP012_BusquedaTrenes_TarjetaSinFondos() {

    }


}
