package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;

public class CPJesicaRodriguez {
    //Atributos
    private HomePage homePage;

    private HotelesPage hotelesPage;
    private ResultadoEsperadoHotelesPage resultadoEsperadoHotelesPage;
    private SeleccionarLugarPage seleccionarLugarPage;
    private DetailsHotelPage detailsHotelPage;
    private DatosPersonPage datosPersonPage;


    private WebDriver driver;
    private String browser = "CHROME";
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.rumbo.es/";

    @BeforeMethod
    public void preparacionTests(){
        homePage = new HomePage(driver); //Se crea la page del home
        homePage.conexionBrowser(browser,propertyDriver,urlDriver); //Se conecta el driver de chrome

        homePage = new HomePage(homePage.getDriver());
        hotelesPage = new HotelesPage(homePage.getDriver());
        resultadoEsperadoHotelesPage = new ResultadoEsperadoHotelesPage(homePage.getDriver());
        seleccionarLugarPage = new SeleccionarLugarPage(hotelesPage.getDriver());
        detailsHotelPage = new DetailsHotelPage(seleccionarLugarPage.getDriver());
        detailsHotelPage = new DetailsHotelPage(detailsHotelPage.getDriver());


        homePage.cargarPagina(url);
        homePage.maximizarPagina();
    }


    @AfterMethod
    public void posTests(){
        //registerPage.cerrarBrowser();
    }
//Caso 1 anda de 10
@Test
public void CP005_Iniciar_HotelesIndividual() throws InterruptedException {
    homePage.irEliminarCookies();
    homePage.irBotonHotel();
    hotelesPage.ingresarLugar();
    hotelesPage.cualquierDestino();
    hotelesPage.cantidadViajerosPersona();
    hotelesPage.reducirAdulto();
    hotelesPage.cerrarbtn();
    hotelesPage.fechaEntrada();
    hotelesPage.calendarioEntrada();
    hotelesPage.fechaFlexible();
    hotelesPage.busqueda1();
   Assert.assertEquals(resultadoEsperadoHotelesPage.resultadoHoteles(),"Alojamientos para cualquier destino");
    Thread.sleep(2000);
    seleccionarLugarPage.bajarScrollMouse();

}
//Caso 2 solo la mitad
@Test
    public  void CP006_Iniciar_HotelesFamilia() throws InterruptedException {
        homePage.irEliminarCookies();
        Thread.sleep(2000);
        homePage.irBotonHotel();
        Thread.sleep(2000);
        hotelesPage.ingresarAlojamiento("Santiago, Chile");
        Thread.sleep(2000);
        hotelesPage.selecionarPaisDefinit();
        Thread.sleep(2000);
        hotelesPage.cantidadViajerosPersona();
        Thread.sleep(2000);
        hotelesPage.aumetarCantidadAdulto();
        Thread.sleep(2000);
        hotelesPage.añadirUnNiño();
        Thread.sleep(2000);
        hotelesPage.bebe12a23MesesAñadir();
        Thread.sleep(2000);
        hotelesPage.añadirUnNiño();
        Thread.sleep(2000);
        hotelesPage.niño2Años();
        Thread.sleep(2000);
        hotelesPage.cerrarbtn();
        Thread.sleep(2000);
        hotelesPage.fechaEntrada();
        Thread.sleep(2000);
        hotelesPage.calendarioEntrada();
        Thread.sleep(2000);
        hotelesPage.fechaFlexible();
        Thread.sleep(2000);
        hotelesPage.busqueda1();
        Thread.sleep(2000);
      Thread.sleep(4000);
        seleccionarLugarPage.hospedajeSeleccion();
        Thread.sleep(2000);
    ArrayList<String> tabs2 = new ArrayList<String> (detailsHotelPage.getDriver().getWindowHandles());
    detailsHotelPage.getDriver().switchTo().window(tabs2.get(1));
    Thread.sleep(2000);
    detailsHotelPage.ElegirHabitacionYelegirPrimerOpcion();
    Thread.sleep(2000);






}

//Caso 3 solo la mitad

@Test
public  void CP007_Iniciar_HotelesDisplay() throws InterruptedException {
    homePage.irEliminarCookies();
    Thread.sleep(2000);
    homePage.irBotonHotel();
    Thread.sleep(2000);
    hotelesPage.ingresarAlojamiento("Buenos Aires, Argentina");
    Thread.sleep(2000);
    hotelesPage.selecionarPaisDefinit();
    Thread.sleep(2000);
    hotelesPage.cantidadViajerosPersona();
    Thread.sleep(2000);
    hotelesPage.añadirUnNiño() ;
    Thread.sleep(2000);
    hotelesPage.bebe12a23MesesAñadir();
    Thread.sleep(2000);
    hotelesPage.cerrarbtn();
    Thread.sleep(2000);
    hotelesPage.cerrarbtn();
    Thread.sleep(2000);
    hotelesPage.fechaEntrada();
    Thread.sleep(2000);
    hotelesPage.calendarioEntrada();
    Thread.sleep(2000);
    hotelesPage.fechaFlexible();
    Thread.sleep(2000);
    hotelesPage.busqueda1();
    Thread.sleep(2000);
    seleccionarLugarPage.seleccionMapaHospedaje();
    Thread.sleep(2000);
    seleccionarLugarPage.selecionHotelesMapasGps();



}



//Caso 4 anda de 10
@Test
    public void CP008_Buscar_HotelesAñadirHabitación(){
    homePage.irEliminarCookies();
    homePage.irBotonHotel();
    hotelesPage.ingresarAlojamiento("Buenos Aires, Argentina");
    hotelesPage.selecionarPaisDefinit();
    hotelesPage.cantidadViajerosPersona();
    hotelesPage.aumetarCantidadAdulto();
    hotelesPage.reducirAdulto();
    hotelesPage.añadirUnNiño();
    hotelesPage.bebe12a23MesesAñadir();
    hotelesPage.añadirSegundaHabitaciones();
    hotelesPage.segundaPestaniaAdulto();
    hotelesPage.cerrarbtn();
    hotelesPage.cerrarbtn();
    hotelesPage.fechaEntrada();
    hotelesPage.calendarioEntrada();
    hotelesPage.fechaFlexible();
    hotelesPage.busqueda1();
    Assert.assertEquals(resultadoEsperadoHotelesPage.resultadoHoteles2(),"Alojamientos en Buenos Aires");
}


}
