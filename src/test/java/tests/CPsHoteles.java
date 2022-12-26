package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelesPage;
import utils.DataDriven;
import utils.PropertiesDriven;
import utils.BaseClass;

import java.util.ArrayList;
import java.util.Set;

public class CPsHoteles {
    private HomePage homePage;
    private HotelesPage hotelesPage;
    private WebDriver driver;
    private final String browser = PropertiesDriven.getProperty("browser");
    private final String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private final String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private final String url = PropertiesDriven.getProperty("url");
    private ArrayList<String> data;

    @BeforeTest
    public void preparacionTest(){
        homePage = new HomePage(driver);
        homePage.conexionBrowser(browser,propertyDriver,urlDriver);
        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
        hotelesPage = new HotelesPage(homePage.getDriver());
    }
    //Casos de prueba por David
    @Test
    public void CP013_Reserva_de_hotel_Con_Tarjeta_Num_Invalido(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP013"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.completarBusqueda(data.get(2));
        homePage.handleTabs();
        hotelesPage.eleccionHotel();
        homePage.handleTabs();
        hotelesPage.eleccionHabitacion();
        hotelesPage.completarFormularioReserva(data.get(3), data.get(4), data.get(5), data.get(6), data.get(7), data.get(8), data.get(9), data.get(10));
        Assert.assertEquals(data.get(1),hotelesPage.obtenerErrorTarjeta());
    }
    @Test
    public void CP014_Buscar_2_Habitacion_Con_Desayuno(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP014"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.completarBusqueda2Habitaciones(data.get(2));
        homePage.handleTabs();
        hotelesPage.eleccionHotelConDesayuno();
        homePage.handleTabs();
        hotelesPage.eleccionHabitacionConDesayuno();
        Assert.assertEquals(data.get(1),hotelesPage.obtenerExitoHDesayuno());
    }
    @Test
    public void CP015_Buscar_Reserva_de_3_Habitaciones(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP015"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.completarBusqueda3Habitaciones(data.get(2));
        homePage.handleTabs();
        Assert.assertEquals(data.get(1),hotelesPage.obtenerResultado3Hab());
    }
    @Test
    public void CP017_Validar_Datos_Data_Erronea(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP017"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.completarBusqueda(data.get(2));
        homePage.handleTabs();
        hotelesPage.eleccionHotel();
        homePage.handleTabs();
        hotelesPage.eleccionHabitacion();
        hotelesPage.completarFormularioReserva(data.get(3), data.get(4), data.get(5), data.get(6), data.get(7), data.get(8), data.get(9), data.get(10));
        Assert.assertEquals(data.get(1),hotelesPage.obtenerEmailError());
    }
    //Casos de Prueba por Fabian
    @Test
    public void CP016_Validar_Busqueda_De_Hotel_Con_6_Viajeros(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP016"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.buscarAlojamiento(data.get(2));
        homePage.handleTabs();
        String linkRespuestaBusqueda = hotelesPage.getUrl1();
        Assert.assertTrue(linkRespuestaBusqueda.contains(data.get(1)));
    }
    @Test
    public void CP018_Validar_Reserva_Mayor_A_31_Noches(){
        data = DataDriven.getData(PropertiesDriven.getProperty("CP018"));
        homePage.aceptarCookies();
        homePage.irAHoteles();
        hotelesPage.completarReservaMayorA1Mes(data.get(2));
        Assert.assertEquals(data.get(1),hotelesPage.obtenerErrorMayor1Mes());
    }

    @AfterMethod
    public void postTests(){
        hotelesPage.cerrarBrowser();
    }
}
