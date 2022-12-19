package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.DataDriven;

import java.util.ArrayList;

public class CPs {
    //Atributos
    private HomePage homePage;
    private RegisterPage registerPage;
    private WebDriver driver;
    private String browser = "CHROME"; //Este valor eventualmente se vera modificado
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.spotify.com/";

    private ArrayList<String> data; //null

    @BeforeMethod
    public void preparacionTests(){
        data = new ArrayList<String>();  //Array de tamaño 0
        homePage = new HomePage(driver); //Se crea la page del home
        homePage.conexionBrowser(browser,propertyDriver,urlDriver); //Se conecta el driver de chrome
        registerPage = new RegisterPage(homePage.getDriver()); //se crea la page de registro

        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
    }

    @Test
    public void CP001_Registro_Fallido_Captcha_en_blanco(){
        data = DataDriven.getData("CP001_Registro_Fallido_Captcha_en_blanco");
        homePage.irARegistrarte();
        registerPage.completarFormularioRegistro(
                data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7));
        Assert.assertEquals(data.get(8),registerPage.obtenerErrorCaptchaVacio());
    }

    @Test
    public void CP002_Registro_Fallido_Password_Corta(){
        data = DataDriven.getData("CP002_Registro_Fallido_Password_Corta");
        homePage.irARegistrarte();
        registerPage.completarFormularioRegistro
                (data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6), data.get(7));
        Assert.assertEquals(data.get(8),registerPage.obtenerErrorPasswordCorta());
    }

    @AfterMethod
    public void posTests(){
        registerPage.cerrarBrowser();
    }


}
