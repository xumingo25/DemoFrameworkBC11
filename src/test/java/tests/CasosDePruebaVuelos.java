package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VuelosPage;
import utils.DataDriven;
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
    public void CP001_BusquedaVuelo_MismoOrigen_Y_Destino(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP001"));
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusquedaFormReserva(data.get(2), data.get(3));
        Assert.assertEquals(data.get(1),vuelosPage.obtenerErrorMismoOrigenYDestino());
    }

    @Test
    public void CP002_BusquedaVuelo_Error_Campos_Origen_Destino(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP002"));
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusqueda_OrigenDestino_Incorrectos(data.get(2), data.get(3));
        String errorBusqueda = data.get(1);
        Assert.assertEquals(vuelosPage.obtenerErrorOrigen(), errorBusqueda);
    }

    @Test
    public void CP003_BusquedaVueloHotel_Despliegue_Vuelo_Preseleccionado(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP003"));
        homePage.aceptarCookies();
        homePage.irAVuelo_Hotel();
        vuelosPage.completarBusqueda(data.get(2), data.get(3));
        vuelosPage.seleccionVueloPreseleccionado();
        Assert.assertEquals(data.get(1),vuelosPage.obtenerViajePreseleccionado());
    }

    @Test
    public void CP004_BusquedaVueloHotel_Funcion_Detalles(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP004"));
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusqueda_DetallesHotel(data.get(2),data.get(3));
        homePage.handles();
        vuelosPage.ResultadosBusquedaHotel();
        homePage.handles();
        vuelosPage.ResultadosHabitacion();
        Assert.assertEquals(data.get(1),vuelosPage.obtenerInicioSesion());
    }

    @Test
    public void CP005_BusquedaVuelo_Validar_Formulario_Reserva(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP005"));
        homePage.aceptarCookies();
        homePage.irAVuelos();
        vuelosPage.completarBusquedaFormReserva(data.get(2), data.get(3));
        homePage.handles();
        vuelosPage.seleccionReservaVuelo();
        vuelosPage.completarFormularioQuienReserva(data.get(4), data.get(5), data.get(6), data.get(7));
        vuelosPage.completarFormularioQuienViaja_Huesped1(data.get(8), data.get(9), data.get(10), data.get(11));
        vuelosPage.completarFormularioQuienViaja_Huesped2(data.get(12), data.get(13), data.get(14), data.get(15));
        vuelosPage.resultadoReservaVuelo();
        Assert.assertEquals(data.get(1),vuelosPage.obtenerDisenioDeViaje());
    }

    @Test
    public void CP006_BusquedaVueloHotel_Datos_Compra_Invalidos() {
        data = DataDriven.getData(PropertiesDriven.getProperty("CP006"));
        homePage.aceptarCookies();
        homePage.irAVuelo_Hotel();
        vuelosPage.completarBusqueda(data.get(2), data.get(3));
        vuelosPage.seleccionAlojamiento_VueloHotel();
        homePage.handles();
        vuelosPage.seleccionHabitacion_VueloHotel();
        vuelosPage.completarFormularioQuienReserva(data.get(4), data.get(5), data.get(6), data.get(7));
        vuelosPage.completarFormularioQuienViaja_Huesped1(data.get(8), data.get(9), data.get(10), data.get(11));
        vuelosPage.completarFormularioQuienViaja_Huesped2(data.get(12), data.get(13), data.get(14), data.get(15));
        vuelosPage.completarFormularioQuienViaja_Huesped3(data.get(16), data.get(17), data.get(18), data.get(19));
        vuelosPage.completarSeguroYFormulario_ComoDeseaPagar(data.get(20), data.get(21), data.get(22), data.get(23), data.get(24));
        vuelosPage.completarFormularioPagoParticular(data.get(25), data.get(26), data.get(27), data.get(28), data.get(29),
                data.get(30), data.get(31), data.get(32), data.get(33));
        Assert.assertEquals(data.get(1), vuelosPage.obtenerErrorCompra());
    }
}
