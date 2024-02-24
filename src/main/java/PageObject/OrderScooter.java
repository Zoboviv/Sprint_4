package PageObject;

import org.openqa.selenium.*;

import static org.junit.Assert.assertTrue;

public class OrderScooter {
    public static WebDriver driver;

    //конструктор класса
    public OrderScooter(WebDriver driver) {
        OrderScooter.driver = driver;
    }

    //локатор Заказать вверху
    private final By buttonOrderUp = By.xpath(".//div[@class='Header_Header__214zg']//button[text()='Заказать']");
    //локатор Заказать внизу
    private final By buttonOrderDown = By.xpath(".//div[@class='Home_RoadMap__2tal_']//button[text()='Заказать']");
    //локатор Имя
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //локатор Фамилия
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор Адрес
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор Станция метро
    private final By metroField = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор Телефон
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор Далее
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    //локатор дата
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор срок
    private final By termButton = By.className("Dropdown-placeholder");
    //локатор цвет
    private final By colorCheckBox = By.id("black");
    //локатор комментарий
    private final  By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор заказать (конец)
    private final By buttonOrderEnd = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор окна "Хотите оформить заказ?"
    private final By confirmationWindow = By.className("Order_ModalHeader__3FDaJ");
    //локатор "Да" в окне "Хотите оформить заказ?"
    private final By buttonYesConfirmationWindow = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[text()='Да']");

    public void clickButtonOrderDown() {
        WebElement element = driver.findElement(buttonOrderDown);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
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

    public void setMetro(String metro) {
        driver.findElement(metroField).sendKeys(metro);
        driver.findElement(By.className("select-search__select")).click();
    }

    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void setDate(String date) {
        driver.findElement(dateField).sendKeys(date);
        driver.findElement(dateField).sendKeys(Keys.ENTER);
    }

    public void setTerm() {
        driver.findElement(termButton).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-option'][text()='сутки']")).click();
    }

    public void setColorCheckBox() {
        driver.findElement(colorCheckBox).click();
    }

    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void clickButtonOrderEnd() {
        driver.findElement(buttonOrderEnd).click();
    }

    public void checkConfirmationWindow() {
        assertTrue(driver.findElement(confirmationWindow).isDisplayed());
    }

    public void clickButtonYesConfirmationWindow() {
        driver.findElement(buttonYesConfirmationWindow).click();
    }

}
