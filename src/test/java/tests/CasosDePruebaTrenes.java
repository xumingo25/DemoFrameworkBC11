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
import utils.DataDriven;
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
    //public void posTests(){;
    //}

    @Test
    public void CP007_BusquedaTrenes_IdaVuelta() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP007"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino(data.get(2),data.get(3));
        trenPage.completarBusquedaMes();
        trenPage.aumentarViajero();
        trenPage.clickBuscar();
        trenPage.getUrl2();
        String resultadoObtenido= trenPage.getUrl2();

        Assert.assertTrue(resultadoObtenido.startsWith(data.get(1)));


    }
    @Test
    public void CP008_BusquedaTrenes_ViajeAdultoNihno() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP008"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino(data.get(2), data.get(3));
        trenPage.completarBusquedaMes();
        trenPage.agregarNihno();
        trenPage.contadorPasajerosAdultos();
        trenPage.clickBuscar();

        Assert.assertEquals(data.get(1), trenPage.obtenerTotalPasajerosResultadoBusqueda());
        //Falta parametrizar el valor actual de pasajeros.
    }
    @Test
    public void CP009_BusquedaTrenes_SeleccionarTicketMasBarato() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP009"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino(data.get(2), data.get(3));
        trenPage.completarBusquedaMes();
        trenPage.agregarNihno();
        trenPage.contadorPasajerosAdultos();
        trenPage.clickBuscar();
        resultadoTrenesPage.seleccionarBotonMasBarato();
        resultadoTrenesPage.obtenerValorMasBarato();
        Assert.assertEquals(resultadoTrenesPage.obtenerValorMasBarato(),resultadoTrenesPage.obtenerValorMasBarato());
    }
    @Test
    public void CP010_BusquedaTrenes_ModificarParametrosOfertasTrenHotel() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP010"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.completarBusquedaOrigenDestino(data.get(1), data.get(2));
        trenPage.completarBusquedaMes();
        trenPage.contadorPasajerosAdultos();
        trenPage.clickBuscar();
        String resultado1=resultadoTrenesPage.obtenerPrecio1();
        resultadoTrenesPage.modificarParametros(data.get(3),data.get(4));
        String resultado2= resultadoTrenesPage.obtenerPrecio2();
        Assert.assertNotEquals(resultado1,resultado2);

    }
    @Test
    public void CP011_BusquedaTrenes_TarjetaVencida() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP011"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.boletoSoloIda();
        trenPage.completarBusquedaOrigenDestino(data.get(2),data.get(3));
        trenPage.completarFormularioSoloIda();
        trenPage.clickBuscar();
        trenPage.clickPrimerPasaje();
        trenPage.formularioQuienReserva(data.get(4),data.get(5),data.get(6),data.get(7),data.get(8),data.get(9));
        trenPage.formularioMetodoDePago(data.get(10),data.get(11),data.get(12), data.get(13), data.get(14));
        Assert.assertEquals(trenPage.resultadoObtenidoTarjetaVencida(),data.get(1));
    }
    @Test
    public void CP012_BusquedaTrenes_TarjetaSinFondos() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP012"));
        homePage.aceptarCookies();
        homePage.irATrenes();
        trenPage.boletoSoloIda();
        trenPage.completarBusquedaOrigenDestino(data.get(2),data.get(3));
        trenPage.completarFormularioSoloIda();
        trenPage.clickBuscar();
        trenPage.clickPrimerPasaje();
        trenPage.formularioQuienReserva(data.get(4),data.get(5),data.get(6),data.get(7),data.get(8),data.get(9));
        trenPage.formularioMetodoDePago(data.get(10),data.get(11),data.get(12), data.get(13), data.get(14));
        trenPage.clickReservar();
        trenPage.continuarSinFlex();
        Assert.assertEquals(trenPage.resultadoObtenidoTarjetaSinFondos(),data.get(1));
    }




}


