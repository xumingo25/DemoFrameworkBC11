package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;

public class CPsJoaquin {
        //Atributos
        private HomePage homePage;
        private CargaDatosPage cargaDatosPage;
        //test 1 -----------------------------------------------------------------------------------
        private EscapadasPage escapadasPage;
        private ElegirHotelPage elegirHotelPage;
        private DetallesHotelPage1 detallesHotelPage1;
        //test 2------------------------------------------------------------------------------------
        private CheckServicioPage checkServicioPage;
        private IdeaDeViajePage ideaDeViajePage;
       // private ElegirHotelPage2 elegirHotelPage2;
       // private DetallesHotelPage2 detallesHotelPage2;
        //test 3------------------------------------------------------------------------------------


        //test 4------------------------------------------------------------------------------------
        private FlashSalesPage flashSalesPage;

//--------------------------------------------------------------------------------------------------
        private WebDriver driver;
        private String browser = "CHROME";
        private String propertyDriver = "webdriver.chrome.driver";
        private String urlDriver = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe";
        private String url = "https://www.rumbo.es/";

        public CPsJoaquin() {
        }

        @BeforeMethod
        public void preparacionTests() {
            homePage = new HomePage(driver); //Se crea la page del home
            homePage.conexionBrowser(browser, propertyDriver, urlDriver); //Se conecta el driver de chrome


            homePage = new HomePage(homePage.getDriver());

            // test 1 pages-----------------------------------------------------------------------
            escapadasPage = new EscapadasPage(homePage.getDriver());
            elegirHotelPage = new ElegirHotelPage(escapadasPage.getDriver());
            detallesHotelPage1 = new DetallesHotelPage1(elegirHotelPage.getDriver());
            cargaDatosPage = new CargaDatosPage(detallesHotelPage1.getDriver());

            //test 2 pages-------------------------------------------------------------------------
            ideaDeViajePage = new IdeaDeViajePage(homePage.getDriver());
           // elegirHotelPage2= new ElegirHotelPage2(ideaDeViajePage.getDriver());
           // detallesHotelPage2 = new DetallesHotelPage2(elegirHotelPage2.getDriver());
            // test 3------------------------------------------------------------------------------


            //test 4 pages-------------------------------------------------------------------------
            flashSalesPage = new FlashSalesPage(homePage.getDriver());
            checkServicioPage = new CheckServicioPage(detallesHotelPage1.getDriver());
//----------------------------------------------------------------------------------------------------------

            homePage.cargarPagina(url);
            homePage.maximizarPagina();
        }
        @AfterMethod
        public void posTests() {
            //registerPage.cerrarBrowser();
        }

        @Test
//test 1-----------------------------------------------------------------------------------------------------
        public void CP09_viaje_a_Maldivas() throws InterruptedException {
            Thread.sleep(4000);
            homePage.irEliminarCookies();
            Thread.sleep(4000);
            homePage.ingresarVermas();
            Thread.sleep(4000);
            homePage.ingresarEscapadas();
            Thread.sleep(4000);
            escapadasPage.llenarlugar();
            Thread.sleep(4000);
            escapadasPage.btnbuscar();
            Thread.sleep(4000);
            elegirHotelPage.btnselechotel();

            //El driver tiene que cambiar de TAB
            //
            ArrayList<String> tabs2 = new ArrayList<String> (detallesHotelPage1.getDriver().getWindowHandles());
            detallesHotelPage1.getDriver().switchTo().window(tabs2.get(1));

            Thread.sleep(10000);
            detallesHotelPage1.bajarScrollMouse();
            Thread.sleep(4000);
            detallesHotelPage1.tocarboton();
            Thread.sleep(4000);

            //aca muere el código por la página
        }
        @Test
//test 2-----------------------------------------------------------------------------------------------------
        public void CP10_viaje_a_Maldivas2() throws InterruptedException {
            Thread.sleep(3000);
            homePage.irEliminarCookies();
            Thread.sleep(10000);
            homePage.bajarScrollMouse();
            Thread.sleep(3000);
            homePage.ingresar_inspirar();
            Thread.sleep(10000);
            ideaDeViajePage.bajarScrollMouse();
            Thread.sleep(5000);
            ideaDeViajePage.llenartexto2();
            Thread.sleep(5000);
            ideaDeViajePage.btnbuscar2();
            Thread.sleep(3000);
            elegirHotelPage.slchotel();

            //El driver tiene que cambiar de TAB
            //
            ArrayList<String> tabs2 = new ArrayList<String> (detallesHotelPage1.getDriver().getWindowHandles());
            detallesHotelPage1.getDriver().switchTo().window(tabs2.get(1));

            Thread.sleep(10000);
            detallesHotelPage1.bajarScrollMouse();
            Thread.sleep(3000);
            detallesHotelPage1.tocarboton();
            Thread.sleep(3000);
            cargaDatosPage.carganombre();
            Thread.sleep(2000);
            cargaDatosPage.cargaapellido();
            Thread.sleep(2000);
            cargaDatosPage.cargamail();
            Thread.sleep(2000);
            cargaDatosPage.carganumero();
            Thread.sleep(2000);
            cargaDatosPage.btnfinal();

            Assert.assertEquals(cargaDatosPage.texterror(),"Introduce el nombre del titular de la tarjeta");

            //aca muere el código por la página
        }
//test 3-----------------------------------------------------------------------------------------------------
        @Test
        public void CP11_viaje_Islas_Tropical(){

        }
        @Test
//test 4-----------------------------------------------------------------------------------------------------
        public void CP12_viaje_a_Lisboa() throws InterruptedException {
            Thread.sleep(3000);
            homePage.irEliminarCookies();
            Thread.sleep(3000);
            homePage.ingresar_flash_sales();
            Thread.sleep(20000);
            elegirHotelPage.bajarScrollMouse();
            //Thread.sleep(20000);
            elegirHotelPage.bajarScrollMouse();
            //Thread.sleep(20000);
            elegirHotelPage.bajarScrollMouse();
            Thread.sleep(5000);
            flashSalesPage.imgofer();

            //El driver tiene que cambiar de TAB
            //
            ArrayList<String> tabs2 = new ArrayList<String> (detallesHotelPage1.getDriver().getWindowHandles());
            detallesHotelPage1.getDriver().switchTo().window(tabs2.get(1));

            Thread.sleep(10000);
            detallesHotelPage1.bajarScrollMouse();
            Thread.sleep(3000);
            detallesHotelPage1.tocarboton();

            Thread.sleep(10000);
            checkServicioPage.bajarScrollMouse();
            Thread.sleep(3000);
            checkServicioPage.btnbasico();


            Thread.sleep(3000);
            cargaDatosPage.carganombre();
            Thread.sleep(2000);
            cargaDatosPage.cargaapellido();
            Thread.sleep(2000);
            cargaDatosPage.cargamail();
            Thread.sleep(2000);
            cargaDatosPage.carganumero();
            Thread.sleep(2000);
            cargaDatosPage.cargadirpostal();
            Thread.sleep(2000);
            cargaDatosPage.carganumcalle();
            Thread.sleep(2000);
            cargaDatosPage.cargacodpostal();
            Thread.sleep(2000);
            cargaDatosPage.cargaciudad();
            Thread.sleep(2000);
           // cargaDatosPage.cargapais();
            Thread.sleep(2000);
            cargaDatosPage.clicksr();
            Thread.sleep(2000);
            cargaDatosPage.cargadianacimiento();
            Thread.sleep(2000);
           // cargaDatosPage.cargamesnacimiento();
            Thread.sleep(2000);
            cargaDatosPage.cargaanionacimiento();
            Thread.sleep(10000);
            cargaDatosPage.bajarScrollMouse();
            Thread.sleep(2000);
            cargaDatosPage.btnfinal();
            //aca muere el código por la página
        }
    }