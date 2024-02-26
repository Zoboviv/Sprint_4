import org.junit.Test;
import page.object.OrderScooter;

public class OrderScooterButtonDownTest extends AncestorTest {
    @Test
    public void testButtonOrderDown(){
        OrderScooter orderScooter = new OrderScooter(driver);
        orderScooter.clickButtonOrderDown();
        orderScooter.checkWindowWhoIsTheScooterFor();
    }
}
