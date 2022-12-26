package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.util.List;

import static java.lang.Integer.parseInt;

public class TrenPage extends BaseClass {
    public TrenPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By locatorTxtOrigen = By.xpath("//input[@placeholder='Origen']");
    By locatorTxtDestino = By.xpath("//input[@placeholder='Destino']");
    By locatorBtnViajeros = By.xpath("//span[contains(text(),'1 viajero')]");
    By locatorAumentarViajeros = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By locatorReducirViajeros = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorAgregarNinho = By.xpath("//span[contains(text(),'Añadir un niño')]");
    By locatorAgregarNinho2Anios = By.xpath("//li[contains(text(),'2 años')]");
    By locatorBtnBuscar= By.xpath("//button[contains(text(),'Buscar')]");
    By locatorRBOrigen= By.xpath("//div[@role='listbox']/div/div[2]/button");
    By locatorMesSiguiente = By.xpath("//button[@aria-label=\"Next month\"]");
    By locatorFIda=By.xpath("//button[contains(text(),15)]");
    By locatorFVuelta= By.xpath("//button[contains(text(),30)]");
    By locatorSoloIda = By.xpath("//div[contains(text(),'Solo ida')]");
    By locatorPrimerPasaje = By.xpath("//section[@data-role='results']//following::span[1][@size=24]");

    //locators quién reserva

    By locatorNombre = By.xpath("//input[@name='name']");
    By locatorApellido = By.xpath("//input[@name='surname']");
    By locatorEmail = By.xpath("//input[@name='email' and @id = 'contact-email']");
    By locatorCodigoArea= By.xpath("//div[@class='arrow down']");
    By locatorCodigoAreaArg = By.xpath("//li[@data-country-code='ar']");
    By locatorNumero = By.xpath("//input[@name='phone']");
    By locatorSra = By.xpath("//input[@value='FEMALE']");
    By locatorDia = By.xpath("//input[@placeholder='DD']");
    By locatorMes = By.xpath("//select[@aria-label='Selecciona el mes']");
    By locatorAnho = By.xpath("//input[@placeholder='AAAA']");
    By locatorTipoDocPa= By.xpath("//div[@class='traveller-info__documents-wrapper']//descendant-or-self::input");
    By locatorNumeroDoc = By.xpath("//input[@name='groups.1.travellers.1.documentNumber']");
    By locatorCheckNoGracias = By.xpath("//label[@class='insurance__noThanks-radio-label']//child:: span[@class='check']");
    By locatorPaquetePremium = By.xpath("//b[contains(text(),'Paquete de Servicio Premium')]");
    By locatorBtnSiguiente = By.xpath("//button[contains(text(),'Siguiente')]");

    //locators pago
    By locatorTxtTitularTarjeta = By.xpath("//input[@name= 'creditCard.cardHolder']");
    By locatorTxtNroTarjeta = By.xpath("//input[@name='creditCard.cardNumber']");
    By locatorTxtMesCaducidad = By.xpath("//input[@placeholder='MM']");
    By locatorTxtAnioCaducidad = By.xpath("//input[@placeholder='AA']");
    By locatorTxtCVV = By.xpath("//input[@name='creditCard.cvv']");
    By locatorErrorTarjetaVencida = By.xpath("//div[contains(text(),'Tu tarjeta ha caducado')]");
    By locatorContinuarSinFlex = By.xpath("//span[@class='btn insurance-modal__deny-button  btn-link underlined']");
    By locatorErrorTarjetaSinFondos = By.xpath("//div[contains(text(),'Lo sentimos')]");
    By locatorScrollBtnAplicar = By.xpath("//div[contains(text(),'Aplicar')]");
    By locatorBtnReservar = By.xpath("//button[@data-test='submit-button']");

    //Metodos
    public int contadorPasajerosAdultos(){

        WebElement locatorContadorPasajerosAdultos = buscarElementoWeb(By.xpath("//div[contains(text(),'Adultos')]//parent::div//parent::div//following-sibling::span"));
        int totalPasajerosAdultos= Integer.parseInt(locatorContadorPasajerosAdultos.getText());
        System.out.println(totalPasajerosAdultos);
        return totalPasajerosAdultos;
    }

    public void completarBusquedaOrigenDestino(String origen, String destino) {
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtOrigen), origen);
        esperarXSegundos(2000);
        click(locatorRBOrigen);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtDestino), destino);
        esperarXSegundos(4000);
        click(locatorRBOrigen);
        esperarXSegundos(5000);
    }
    public void completarBusquedaMes() {
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(2000);
        click(locatorFVuelta);
        esperarXSegundos(3000);
    }

    public void aumentarViajero(){
        esperarXSegundos(5000);
        click(locatorAumentarViajeros);
    }

    public void reducirViajero() {
        click(locatorBtnViajeros);
        esperarXSegundos(1000);
        click(locatorReducirViajeros);


    }
    //pendiente
    public void agregarNihno() {
        esperarXSegundos(2000);
        click(locatorAgregarNinho);
        esperarXSegundos(2000);
        click(locatorAgregarNinho2Anios);
    }

    public void clickBuscar () {
        click(esperarAElementoWeb(locatorBtnBuscar));
        esperarXSegundos(3000);
    }

    public String getUrl1(){
        String url1 = driver.getCurrentUrl();
        return url1;
    }

    public String getUrl2(){
        String url2 = driver.getCurrentUrl();
        return url2;
    }

    public String obtenerTotalPasajerosResultadoBusqueda(){
        WebElement locatorContadorPasajeros = buscarElementoWeb(By.xpath("//div[@class=\"search-summary__passsengers\"]//following-sibling::span"));
        String numeroPasajeros = locatorContadorPasajeros.getText();
        String valor= numeroPasajeros;
        return valor;
    }

    public void boletoSoloIda(){
        click(locatorSoloIda);
    }

    public void completarFormularioSoloIda(){
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorMesSiguiente);
        esperarXSegundos(1000);
        click(locatorFIda);
        esperarXSegundos(2000);
    }

    public void presionarTab(){
        WebElement element = driver.findElement(By.xpath("//div[@class='traveller-info__documents-wrapper']//descendant-or-self::input"));
        element.sendKeys(Keys.TAB);

    }

    public void clickPrimerPasaje(){
        click(locatorPrimerPasaje);
    }

    public void seleccionarCodigoArea() {
        esperarXSegundos(2000);
        WebElement element = driver.findElement(By.xpath("//div[@class='arrow down']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void seleccionarMes(){
        driver.findElement(By.xpath("//select/option[@value='10']")).click();

    }
    public void seleccionarSra(){
        WebElement element = driver.findElement(By.xpath("//input[@value='FEMALE']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

    }

    public void formularioQuienReserva(String nombre, String apellido, String email, String numero, String DD, String anho) {
        agregarTexto(esperarAElementoWeb(locatorNombre),nombre);
        esperarXSegundos(1000);
        ScrollElementoWeb(locatorApellido);
        agregarTexto(esperarAElementoWeb(locatorApellido),apellido);
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorEmail),email);
        esperarXSegundos(2000);
        seleccionarCodigoArea();
        esperarXSegundos(2000);
        ScrollElementoWeb(locatorCodigoAreaArg);
        click(locatorCodigoAreaArg);
        agregarTexto(esperarAElementoWeb(locatorNumero),numero);
        esperarXSegundos(1000);
        ScrollElementoWeb(locatorSra);
        seleccionarSra();
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorDia),DD);
        esperarXSegundos(1000);
        click(locatorMes);
        seleccionarMes();
        esperarXSegundos(1000);
        agregarTexto(esperarAElementoWeb(locatorAnho),anho);
        esperarXSegundos(1000);
        agregarTexto(locatorTipoDocPa,"Pasaporte");
        presionarTab();
        agregarTexto(locatorNumeroDoc,"1234567");
        esperarXSegundos(2000);
        ScrollElementoWeb(locatorNumeroDoc);
        ScrollElementoWeb(locatorPaquetePremium);
        click(locatorCheckNoGracias);
        esperarXSegundos(1000);
        click(locatorBtnSiguiente);

    }

    public void formularioMetodoDePago(String titulartarjeta, String nrotarjeta, String mescaducidad, String aniocaducidad, String cvv) {
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtTitularTarjeta), titulartarjeta);
        esperarXSegundos(2000);
        click(locatorTxtNroTarjeta);
        esperarXSegundos(2000);
        click(locatorTxtNroTarjeta);
        agregarTexto(esperarAElementoWeb(locatorTxtNroTarjeta), nrotarjeta);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtMesCaducidad), mescaducidad);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtAnioCaducidad), aniocaducidad);
        esperarXSegundos(2000);
        agregarTexto(esperarAElementoWeb(locatorTxtCVV), cvv);
        esperarXSegundos(2000);
    }
    public void clickReservar(){
        ScrollElementoWeb(locatorTxtCVV);
        esperarXSegundos(3000);
        ScrollElementoWeb(locatorScrollBtnAplicar);
        esperarXSegundos(3000);
        click(locatorBtnReservar);
        esperarXSegundos(5000);
    }

    public void continuarSinFlex(){
        click(locatorContinuarSinFlex);
        esperarXSegundos(6000);
    }

    public String resultadoObtenidoTarjetaVencida() {
        WebElement valor = driver.findElement(locatorErrorTarjetaVencida);
        String texto = valor.getText();
        return texto;
    }

    public String resultadoObtenidoTarjetaSinFondos() {
        esperarXSegundos(15000);
        WebElement valor = driver.findElement(locatorErrorTarjetaSinFondos);
        String texto = valor.getText();
        return texto;
    }

}







