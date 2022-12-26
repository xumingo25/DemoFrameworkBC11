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




    @AfterMethod

    public void postTests(){

        //hotelesPage.cerrarBrowser();

    }


}
