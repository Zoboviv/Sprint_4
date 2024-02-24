import PageObject.OrderScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class OrderScooterTest {
    public WebDriver getWebDriver(boolean useFirefox) {
        if (useFirefox) {
            return new FirefoxDriver();
        } else {
            return new ChromeDriver();
        }
    }
    WebDriver driver = getWebDriver(false);//true для FirefoxDriver
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phone;
    private final String date;
    private final String comment;


    public OrderScooterTest(String name, String surname, String address, String metro, String phone, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.date = date;
        this.comment = comment;
    }

    @Before
    public void setUp(){
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][] {
                {"Артем", "Лебедев","Бульвар малых сосен, 18","ВДНХ" , "88005553535", "01.04.2024","Комментарий"},
                {"Аркадий", "Укупник","Большая-Ленина, 13-7-1", "Спартак", "78931234567", "01.12.2024"," "}
        };
    }

    @Test
    public void testButtonOrderUpBlack(){
        OrderScooter orderScooter = new OrderScooter(driver);
        orderScooter.clickButtonOrderUp();
        orderScooter.setName(name);
        orderScooter.setSurname(surname);
        orderScooter.setAddress(address);
        orderScooter.setMetro(metro);
        orderScooter.setPhone(phone);
        orderScooter.clickNextButton();
        orderScooter.setDate(date);
        orderScooter.setTerm();
        orderScooter.setColorCheckBoxBlack();
        orderScooter.setComment(comment);
        orderScooter.clickButtonOrderEnd();
        orderScooter.checkConfirmationWindow();
        orderScooter.clickButtonYesConfirmationWindow();
        orderScooter.checkEndConfirmationWindow();
        orderScooter.clickButtonSeeStatus();
        orderScooter.checkWindowTrackOrderColumns();
    }

    @Test
    public void testButtonOrderDownGrey(){
        OrderScooter orderScooter = new OrderScooter(driver);
        orderScooter.clickButtonOrderDown();
        orderScooter.setName(name);
        orderScooter.setSurname(surname);
        orderScooter.setAddress(address);
        orderScooter.setMetro(metro);
        orderScooter.setPhone(phone);
        orderScooter.clickNextButton();
        orderScooter.setDate(date);
        orderScooter.setTerm();
        orderScooter.setColorCheckBoxGrey();
        orderScooter.setComment(comment);
        orderScooter.clickButtonOrderEnd();
        orderScooter.checkConfirmationWindow();
        orderScooter.clickButtonYesConfirmationWindow();
        orderScooter.checkEndConfirmationWindow();
        orderScooter.clickButtonSeeStatus();
        orderScooter.checkWindowTrackOrderColumns();
    }

}
