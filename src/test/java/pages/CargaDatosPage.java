package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class CargaDatosPage extends BaseClass {
    public CargaDatosPage(WebDriver driver) {
        super(driver);
    }
    By locatorCargaNombre = By.xpath("//input[@data-test='input-name']");
    By locatorCargaApellido = By.xpath("//input[@data-test='input-surname']");
    By locatorCargaMail = By.xpath("//input[@id='contact-email']");
    By locatorCargaNumero = By.xpath("//input[@maxlength='75']");
    By locatorCargaDirPostal = By.xpath("//input [@data-test='input-address']");
    By locatorCargaNumCalle = By.xpath("//input [@data-test='input-houseNumber']");
    By locatorCargaCodPostal= By.xpath("//input[@data-test='input-postCode']");
    By locatorCargaCiudad = By.xpath("//input[@data-test='input-city']");
    By locatorCargaPais = By.xpath("//li[@data-flag-key='flag_no_1']");
    By locatorclickBtnSr = By.xpath("//label[@class='label--full-width']");
    By locatorBtnDiaNacimiento = By.xpath("(//*[contains(@name,'groups.1.travellers.1.dateOfBirth')])[1]");
    By locatorBtnMesNacimiento = By.xpath("(//*[contains(@value,'7')])[1]");
    By locatorBtnAnioNacimiento = By.xpath("(//*[contains(@name,'groups.1.travellers.1.dateOfBirth')])[2]");
    By locatorBtnFinal = By.xpath("//button[@data-test='submit-button']");

    By locatorTextError = By.xpath("(//label[@for='creditCard.cardHolder'])[2]");

    public void carganombre(){
        click(esperarAElementoWeb(locatorCargaNombre));
        driver.findElement(By.xpath("//input[@data-test='input-name']")).sendKeys("Joaquin");
    }
    public void cargaapellido(){
        click(esperarAElementoWeb(locatorCargaApellido));
        driver.findElement(By.xpath("//input[@data-test='input-surname']")).sendKeys("Mercado");
    }
    public void cargamail(){
        click(esperarAElementoWeb(locatorCargaMail));
        driver.findElement(By.xpath("//input[@id='contact-email']")).sendKeys("abcdefg@gmail.com");
    }
    public void carganumero(){
        click(esperarAElementoWeb(locatorCargaNumero));
        driver.findElement(By.xpath("//input[@maxlength='75']")).sendKeys("12334445555");
    }
    public void cargadirpostal(){
        click(esperarAElementoWeb(locatorCargaDirPostal));
        driver.findElement(By.xpath("//input [@data-test='input-address']")).sendKeys("1234");
    }
    public void carganumcalle(){
        click(esperarAElementoWeb(locatorCargaNumCalle));
        driver.findElement(By.xpath("//input [@data-test='input-houseNumber']")).sendKeys("4567");
    }
    public void cargacodpostal(){
        click(esperarAElementoWeb(locatorCargaCodPostal));
        driver.findElement(By.xpath("//input[@data-test='input-postCode']")).sendKeys("8910");
    }
    public void cargaciudad(){
        click(esperarAElementoWeb(locatorCargaCiudad));
        driver.findElement(By.xpath("//input[@data-test='input-city']")).sendKeys("cabra");
    }
    public void cargapais(){
        click(esperarAElementoWeb(locatorCargaPais));
        driver.findElement(By.xpath("//li[@data-flag-key='flag_no_1']")).sendKeys("España");
    }
    public void clicksr(){
        click(esperarAElementoWeb(locatorclickBtnSr));
    }
    public void cargadianacimiento(){
        click(esperarAElementoWeb(locatorBtnDiaNacimiento));
        driver.findElement(By.xpath("(//*[contains(@name,'groups.1.travellers.1.dateOfBirth')])[1]")).sendKeys("16");
    }
    public void cargamesnacimiento(){
        click(esperarAElementoWeb(locatorBtnMesNacimiento));
       // driver.findElement(By.xpath("//input[@data-test='input-name']")).sendKeys("julio");
    }
    public void cargaanionacimiento(){
        click(esperarAElementoWeb(locatorBtnAnioNacimiento));
        driver.findElement(By.xpath("(//*[contains(@name,'groups.1.travellers.1.dateOfBirth')])[2]")).sendKeys("1998");
    }
    public void btnfinal(){
        click(esperarAElementoWeb(locatorBtnFinal));
    }

    public String texterror(){

        return obtenerTexto(esperarAElementoWeb(locatorTextError));
    }
}
