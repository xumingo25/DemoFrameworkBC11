package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VuelosPage;
import utils.PropertiesDriven;

import java.util.ArrayList;

public class CasosDePruebaVuelos {
    private HomePage homePage;
    private VuelosPage vuelosPage;
    private WebDriver driver;
    private final String browser = PropertiesDriven.getProperty("browser");
    private final String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private final String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private final String url = PropertiesDriven.getProperty("url");
    private ArrayList<String> data; // null
    private ArrayList<String> data2;

    public CasosDePruebaVuelos() {
    }

    @BeforeMethod
    public void preparacionTests(){
        data= new ArrayList<String>(); //Array de tamaño 0
        data2= new ArrayList<String>(); //Segundo Array para evitar conflictos con data
        homePage = new HomePage(driver);
        homePage.conexionBrowser(browser,propertyDriver,urlDriver);
        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
        vuelosPage = new VuelosPage(homePage.getDriver());
    }

    @AfterMethod
    public void posTests(){
        homePage.cerrarBrowser();
    }

    @Test
    public void CP001_RegistroNuevoUsuario_SinCorreoConfirmacion(){
        homePage.aceptarCookies();
    }

    @Test
    public void CP002_BusquedaVuelo_Error_Campos_Origen_Destino(){
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusqueda_OrigenDestino_Incorrectos("asdasd", "asdasd");
        String res = "La búsqueda no ha dado resultados";
        Assert.assertEquals(vuelosPage.obtenerErrorOrigen(), res);
    }

    @Test
    public void CP003_BusquedaVueloHotel_Despliegue_Vuelo_Preseleccionado(){
        homePage.aceptarCookies();
        homePage.irAVuelo_Hotel();
        vuelosPage.completarBusqueda("Madrid","Tokyo");
        vuelosPage.seleccionVueloPreseleccionado();
        //Assert.assertEquals();
    }

    @Test
    public void CP004_BusquedaVueloHotel_Funcion_Detalles(){
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusqueda_DetallesHotel("Madrid","Tokyo");

    }

    @Test
    public void CP005_BusquedaVuelo_Validar_Formulario_Reserva(){
        homePage.aceptarCookies();
    }

    @Test
    public void CP006_BusquedaVueloHotel_Datos_Compra_Invalidos() {
        homePage.aceptarCookies();
        homePage.irAVuelo_Hotel();
        vuelosPage.completarBusqueda("Madrid", "Tokyo");
        vuelosPage.seleccionAlojamiento_VueloHotel();
        vuelosPage.completarFormularioQuienReserva("Asdgasdg","Aasdfasdg","aasdfsfd@aereo.com","4565415616");
        vuelosPage.completarFormularioQuienViaja_Huesped1("Asdfasdf","Aasdfasdg","17","1994");
        vuelosPage.completarFormularioQuienViaja_Huesped2("Asdfasdf","Aasdfasdg","23","1991");
        vuelosPage.completarFormularioQuienViaja_Huesped3("Asdfasdf","Aasdfasdg","14","1990");
        vuelosPage.completarSeguroYFormulario_ComoDeseaPagar("awetgasgawrg","4120 0316 8659 8659","06","29","642");
        vuelosPage.completarFormularioPagoParticular("Asdgfasg","SDAERGAEGHHG","Asdgasdfg","Asgasdg","asdga",
                "asdgasdfg","Asdfgasdfgadf","aerwg@gasg.com","46416161");

    }
}
