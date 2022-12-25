package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultadoTrenesPage;
import pages.TrenPage;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class CasosDePruebaTrenes {
    private HomePage homePage;
    private TrenPage trenPage;
    private ResultadoTrenesPage resultadoTrenesPage;
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
        resultadoTrenesPage= new ResultadoTrenesPage(homePage.getDriver());
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

        Assert.assertEquals(2, trenPage.obtenerTotalPasajerosResultadoBusqueda());
        //Falta parametrizar el valor actual de pasajeros.
    }

    @Test
    public void CP009_BusquedaTrenes_SeleccionarTicketMasBarato() {
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino("Madrid", "Barcelona");
        trenPage.completarBusquedaMes();
        trenPage.agregarNihno();
        trenPage.contadorPasajerosAdultos();
        trenPage.clickBuscar();
        //homePage.handleTabs();
        resultadoTrenesPage.obtenerValorMasBaratoHead();
        resultadoTrenesPage.seleccionarBotonMasBarato();
        resultadoTrenesPage.obtenerValorMasBarato();
        resultadoTrenesPage.obtenerValorMasBaratoHead();
        Assert.assertEquals(resultadoTrenesPage.obtenerValorMasBarato(),"21,00 €");
        //actualizar el valor del Assert valor esperado. Falta llamar valor desde la pagina de resultado busqueda


    }
    @Test
    public void CP010_BusquedaTrenes_ModificarParametrosOfertasTrenHotel() {

    }
    @Test
    public void CP011_BusquedaTrenes_TarjetaVencida() {
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.boletoSoloIda();
        trenPage.completarBusquedaOrigenDestino("Madrid","Barcelona");
        trenPage.completarFormularioSoloIda();
        trenPage.aumentarViajero();
        trenPage.clickBuscar();
        trenPage.clickPrimerPasaje();
        trenPage.formularioQuienReserva("Ariana","Niesi","ariananiesi@gmail.com",1157966485);
        // completar formulario quién viaja
        // completar formulario cómo deseas pagar

        }
        @Test
        public void CP012_BusquedaTrenes_TarjetaSinFondos() {

        }


}


