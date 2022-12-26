package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EspecifiTrenesPage;
import pages.HomePage;
import pages.QuienReservaPage;
import pages.TrenesPage;

import utils.PropertiesDriven;

import java.util.ArrayList;

public class CPsRodolfo {

    //Atributos
    private WebDriverWait wait;
    private WebDriver driver;
    private HomePage homePage;
    private TrenesPage trenesPage;
    private EspecifiTrenesPage especifiTrenesPage;
    private QuienReservaPage quienReservaPage;

    //propertis
    private String browser = PropertiesDriven.getProperty("browser");
    private String propertyDriver = PropertiesDriven.getProperty("propertyDriver");
    private String urlDriver = PropertiesDriven.getProperty("urlDriver");
    private String url = PropertiesDriven.getProperty("url");


    private ArrayList<String> data;

    @BeforeMethod
    public void preparacionParaTests(){

        data = new ArrayList<String>();//para usar con el excel

        homePage = new HomePage(driver);
        homePage.conexionBrowser(browser,propertyDriver,urlDriver);
        trenesPage = new TrenesPage(homePage.getDriver());
        especifiTrenesPage = new EspecifiTrenesPage(homePage.getDriver());
        quienReservaPage = new QuienReservaPage(homePage.getDriver());


        homePage.cargarPagina(url);
        homePage.maximizarPagina();
    }


    @Test
    public void CP015_Registro_Viaje_En_Tren(){
        homePage.irATrenes();
        trenesPage.completarDatosViajeEnTren("Madrid","Barcelona");

        Assert.assertEquals(especifiTrenesPage.respuestaDeBusqueda(),"30 de 30 resultados");


    }

    @Test
    public void CP016_Ingreso_Dia_Fallido(){
        homePage.irATrenes();
        trenesPage.CompletarDatosDeTrenMismoDia("Madrid","Barcelona");

        Assert.assertEquals(especifiTrenesPage.respuestaDeBusuedaFallida(),"No hemos encontrado ningún resultado con tus criterios de búsqueda.");


    }
    @Test
    public void CP017_Ingreso_Datos_Especificos_Reserva(){
        homePage.irATrenes();
        trenesPage.completarDatosViajeEnTren("Madrid","Barcelona");
        especifiTrenesPage.bajarScrollMouse();
        especifiTrenesPage.ingresoDeDatosEspecificosTren();

        Assert.assertEquals(quienReservaPage.respuestaDeBusquedaCliente(),"Tu viaje");



    }


    @AfterMethod
    public void posTests(){
        //trenesPage.cerrarBrowser();


    }
}
