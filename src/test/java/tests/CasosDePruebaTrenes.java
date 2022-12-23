package tests;

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
        String url1= trenPage.getUrl1();
        trenPage.completarBusqueda("Madrid", "Barcelona");
        String url2= trenPage.getUrl2();
        Assert.assertEquals(url1, url2);


    }
}
