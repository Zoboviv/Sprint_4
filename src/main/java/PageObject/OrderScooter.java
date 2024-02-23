package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderScooter {
    private static WebDriver driver;
    //конструктор класса
    public OrderScooter(WebDriver driver){
        this.driver = driver;
    }

    //локатор Заказать вверху
    private By buttonOrderUp = By.xpath(".//div[@class='Header_Header__214zg']//button[text()='Заказать']");
    //локатор Заказать внизу
    private By buttonOrderDown = By.xpath(".//div[@class='Home_RoadMap__2tal_']//button[text()='Заказать']");
    //локатор Имя
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //локатор Фамилия
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор Адрес
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор Станция метро
    private By metroField = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор Телефон
    private By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор Далее
    private By nextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    //локатор дата
    private By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор срок
    private By termButton = By.className("Dropdown-placeholder");
    //локатор цвет
    private By colorCheckBox = By.id("black");
    //локатор комментарий
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор заказать (конец)
    private By buttonOrderEnd = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор окна "Хотите оформить заказ?"
    private By confirmationWindow = By.className("Order_ModalHeader__3FDaJ");
    //локатор "Да" в окне "Хотите оформить заказ?"
    private By buttonYesConfirmationWindow = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[text()='Да']");

    public void clickbuttonOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    public void clickButtonOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setMetro(String address) {
        driver.findElement(metroField).sendKeys(address);
    }

}
