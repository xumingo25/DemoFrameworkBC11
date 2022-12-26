package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class EspecifiTrenesPage extends BaseClass {


    public EspecifiTrenesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores de Paginas de resultados
    By localizadorReslutados = By.xpath("//span[@class='total-results-text']");
    By localizadorResultadoFallido = By.xpath("//div[contains(text(),'No hemos encontrado ningún resultado con tus criterios de búsqueda')]");
    //Fin de localizadores de resultados

    //Localizadores completar datos especificos para la reserva del tren


    By localizadorEstacionIdaSalida = By.xpath("(//span[@class='checkboxlist-filter-view__desc desc'])[1]");//("//label[@data-e2e='brgui-list-option']");
    By localizadorEstacionIdaLlegada = By.xpath("(//span[@class='checkboxlist-filter-view__desc desc'])[2]");
    By localizadorVueltaSalidaRegreso = By.xpath("(//span[@class='checkboxlist-filter-view__desc desc'])[3]");
    By localizadorVueltaSalidaLegada = By.xpath("(//span[@class='checkboxlist-filter-view__desc desc'])[4]");

    By localizadorCompañiasTrenes = By.xpath("(//div[@class='providers-filter-view__providers providers-filter-view__providers--others-hidden'])[1]");
    By localizadorSinEscalas = By.xpath("(//label[@class='switch-label'])[1]");
    By localizadorSeleccionPrecio = By.xpath("(//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 fIfQOn'])[1]");
    //Fin de localizadores datos especificos



    public String respuestaDeBusqueda(){

        esperaXSegundos(2000);
        return obtenerTexto(esperarAElementoWeb(localizadorReslutados));
    }
    public String respuestaDeBusuedaFallida(){
        esperaXSegundos(2000);
        return obtenerTexto(esperarAElementoWeb(localizadorResultadoFallido));
    }

    public void ingresoDeDatosEspecificosTren(){

        esperaXSegundos(3000);
        click(esperarAElementoWeb(localizadorEstacionIdaSalida));
        esperaXSegundos(3000);
        click(esperarAElementoWeb(localizadorEstacionIdaLlegada));
        esperaXSegundos(3000);
        bajarScrollMouse();
        click(esperarAElementoWeb(localizadorVueltaSalidaRegreso));
        esperaXSegundos(2000);
        click(esperarAElementoWeb(localizadorVueltaSalidaLegada));
        esperaXSegundos(2000);
        click(esperarAElementoWeb(localizadorCompañiasTrenes));
        esperaXSegundos(2000);
        click(esperarAElementoWeb(localizadorSinEscalas));
        esperaXSegundos(2000);
        click(esperarAElementoWeb(localizadorSeleccionPrecio));
        esperaXSegundos(2000);

    }
}
