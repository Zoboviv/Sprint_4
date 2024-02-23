package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantThings {

    private static WebDriver driver;
    String n;

    //конструктор класса
    public QuestionsAboutImportantThings(WebDriver driver){
        this.driver = driver;
    }

    // метод кликает по вопросу
    public static void clickQuestion(String n) {
        WebElement element = driver.findElement(By.id("accordion__heading-" + n));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.id("accordion__heading-" + n)).click();
        }

}
