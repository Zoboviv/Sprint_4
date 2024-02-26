import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import page.object.OrderScooter;

import java.util.Objects;

@RunWith(Parameterized.class)
public class OrderScooterTest extends AncestorTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phone;
    private final String color;
    private final String date;
    private final String comment;


    public OrderScooterTest(String name, String surname, String address, String metro, String phone,String color, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.color = color;
        this.date = date;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][] {
                {"Артем", "Лебедев","Бульвар малых сосен, 18","ВДНХ" , "88005553535","Черный", "01.04.2024","Комментарий"},
                {"Аркадий", "Укупник","Большая-Ленина, 13-7-1", "Спартак", "78931234567","Серый", "01.12.2024"," "}
        };
    }

    @Test
    public void testButtonOrderUp(){
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
        if(Objects.equals(color, "Серый")){
            orderScooter.setColorCheckBoxGrey();
        }else {
            orderScooter.setColorCheckBoxBlack();
        }
        orderScooter.setComment(comment);
        orderScooter.clickButtonOrderEnd();
        orderScooter.checkConfirmationWindow();
        orderScooter.clickButtonYesConfirmationWindow();
        orderScooter.checkEndConfirmationWindow();
        orderScooter.clickButtonSeeStatus();
        orderScooter.checkWindowTrackOrderColumns();
    }

}
