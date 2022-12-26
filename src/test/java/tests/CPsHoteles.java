package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelesPage;
import utils.PropertiesDriven;
import utils.BaseClass;

import java.util.ArrayList;
import java.util.Set;

public class CPsHoteles {
    private HomePage homepage;
    private HotelesPage hotelesPage;
    private WebDriver driver;
    private final String browser = PropertiesDriven.getProperty("browser");
    private final String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private final String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private final String url = PropertiesDriven.getProperty("url");

    private ArrayList<String> data;


    @BeforeTest
    public void preparacionTest(){
        homepage = new HomePage(driver);
        homepage.conexionBrowser(browser,propertyDriver,urlDriver);
        homepage.cargarPagina(url);
        homepage.maximizarBrowser();
        hotelesPage = new HotelesPage(homepage.getDriver());
    }



    @Test
    public void CP0001_Registro_Fallido_Email_Invalido() {
        homepage.aceptarCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("santiago de chile");
        homepage.handleTabs();
        String resultadoObtenido = hotelesPage.getUrl3();
        Assert.assertTrue(resultadoObtenido.contains("https://inspirame.rumbo.es"));

    }
    @Test
    public void CP0002_Validar_Resultado(){

    }
    @Test
    public void CP0003_Registro_Fallido_Data_Erronea(){

    }

    @Test
    public void CP013_Reserva_de_hotel_Con_Tarjeta_Num_Invalido(){
        homepage.aceptarCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Cancun");
        homepage.handleTabs();
        hotelesPage.eleccionHotel();
        homepage.handleTabs();
        hotelesPage.eleccionHabitacion();
        hotelesPage.completarFormularioReserva("David","Barcia","david.barcia@hotmail.com","23495123","David Barcia","485829","12","30");
        Assert.assertEquals("Introduce un número válido",hotelesPage.obtenerErrorTarjeta());
    }

    @Test
    public void CP014_Buscar_2_Habitacion_Con_Desayuno(){
        homepage.aceptarCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda2Habitaciones("santiago de chile");
        homepage.handleTabs();
        hotelesPage.eleccionHotelConDesayuno();
        homepage.handleTabs();
        hotelesPage.eleccionHabitacionConDesayuno();
        Assert.assertEquals("Añadir huéspedes y forma de pago",hotelesPage.obtenerExitoHDesayuno());
    }

    @Test
    public void CP015_Buscar_Reserva_de_3_Habitaciones(){
        homepage.aceptarCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda3Habitaciones("Toronto");
        homepage.handleTabs();
        Assert.assertEquals("Alojamientos en Toronto",hotelesPage.obtenerResultado3Hab());
    }

    @Test
    public void CP017_Validar_Datos_Data_Erronea(){
        homepage.aceptarCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Cancun");
        homepage.handleTabs();
        hotelesPage.eleccionHotel();
        homepage.handleTabs();
        hotelesPage.eleccionHabitacion();
        hotelesPage.completarFormularioReserva("David","Barcia","davidhotmail.com","23495123","","","","");
        Assert.assertEquals("Introduce un email válido",hotelesPage.obtenerEmailError());
    }




    @AfterMethod

    public void postTests(){

        hotelesPage.cerrarBrowser();

    }


}
