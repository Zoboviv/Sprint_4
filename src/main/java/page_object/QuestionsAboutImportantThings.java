package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class QuestionsAboutImportantThings {
    public static WebDriver driver;

    //конструктор класса
    public QuestionsAboutImportantThings(WebDriver driver) {
        this.driver = driver;
    }

    public void clickQuestions(String n) {
        WebElement element = driver.findElement(By.id("accordion__heading-" + n));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.id("accordion__heading-"+ n)).click();
    }
    public void checkAnswer(String n, String text) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accordion__panel-" + n)));
        assertEquals(driver.findElement(By.id("accordion__panel-" + n)).getText(), text);
    }



}
