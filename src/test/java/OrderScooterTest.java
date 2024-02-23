import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Parameterized.class)
public class OrderScooterTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String date;
    private final String comment;

    WebDriver driver = new ChromeDriver();
    public OrderScooterTest(String name, String surname, String address, String phone, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
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
                {"Артем", "Лебедев","Бульвар малых сосен, 18", "88005553535", "01.03.2025","Комментарий"},
                {"Аркадий", "Укупник","Большая-Ленина, 13-7-1", "1080101", "01.12.2024"," "}
        };
    }

    @Test
    public void test(){



    }

}
