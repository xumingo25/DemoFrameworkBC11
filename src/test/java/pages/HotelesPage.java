package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HotelesPage extends BaseClass {
    public HotelesPage(WebDriver driver) { super(driver); }


    By locatorLugarHoteles = By.xpath("//input[@id='mui-1']");
    By locatorDestinoCual = By.xpath("//ul[@id='mui-1-listbox']");
    By locatorFechasFlex = By.xpath("//button[@class='display-19sl708-DateInput-styled-DateInput-styled']");
    By locatorEntradaFecha = By.xpath("(//button[@type='button'])[8]");
    By locatorCalendario = By.xpath("(//button[@type='button'])[12]");
   By locatorBuscar1 = By.xpath("//button[@type='submit']");
    By locatorCantidadViajeros = By.xpath("//button[@class='display-vu9q0w-Dropdown-styled']");
    By locatorReduBtNaDultos = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    By locatorBtnCerrar = By.xpath("(//div[@class='display-hm7sdz'])[2]");
   By locatorCantidadAdultos = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
   By locatorSegundaPestaniaCantidadAdulto = By.xpath("(//button[@aria-label='Aumentar el número de adultos'])[2]");
   By locatorCntidadNinios = By.xpath("//button[@aria-label='Aumentar el número de niños']");
   By locatorBebe12a23Meses = By.xpath("(//li[@class='display-1i82ptt-ChildPicker-styled'])[2] ");
   By locatorNino2Anios = By.xpath("(//li[@class='display-1i82ptt-ChildPicker-styled'])[3] ");
   By locatorSeleccionarBtnChil = By.xpath("//ul[@id='mui-1-listbox']");

   By locatorAnadirOtraHabitacion = By.xpath("(//button[@type='button'])[17]");


    public  void ingresarLugar(){click(esperarAElementoWeb(locatorLugarHoteles));}
    public  void  cualquierDestino(){click(esperarAElementoWeb(locatorDestinoCual));}
    public void  cantidadViajerosPersona(){click(esperarAElementoWeb(locatorCantidadViajeros));}
    public void reducirAdulto(){click(esperarAElementoWeb(locatorReduBtNaDultos));}
    public void cerrarbtn(){click(esperarAElementoWeb(locatorBtnCerrar));}
    public void  fechaFlexible(){click(esperarAElementoWeb(locatorFechasFlex));}
    public  void  fechaEntrada(){click(esperarAElementoWeb(locatorEntradaFecha));}
    public  void  busqueda1(){click(esperarAElementoWeb(locatorBuscar1));}
    public void  calendarioEntrada(){click(esperarAElementoWeb(locatorCalendario));}
    public  void ingresarAlojamiento(String destino){agregarTexto(esperarAElementoWeb(locatorLugarHoteles), destino);}
    public void  aumetarCantidadAdulto(){click(esperarAElementoWeb(locatorCantidadAdultos));}
    public void segundaPestaniaAdulto(){click(esperarAElementoWeb(locatorSegundaPestaniaCantidadAdulto));}
   public void  añadirUnNiño(){click(esperarAElementoWeb(locatorCntidadNinios));}
    public void bebe12a23MesesAñadir(){click(esperarAElementoWeb(locatorBebe12a23Meses));}
   public  void  niño2Años(){click(esperarAElementoWeb(locatorNino2Anios));}
    public void selecionarPaisDefinit(){click(esperarAElementoWeb(locatorSeleccionarBtnChil));}
    public  void  añadirSegundaHabitaciones(){click(esperarAElementoWeb(locatorAnadirOtraHabitacion));}


    }


