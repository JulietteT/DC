package ru.netology.selenide

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DeliveryCardTest {

    private String generateData (int addDays, String pattern) {
        return LocalData.now(). plusDays(addDays).formate (DataTimeFormatter. ofPattern(pattern))
    }
 @Test
    public void shouldBeSuccesfullyCompleted() {
        open("http://localhost:9999");

     $("[data-test-id=city] input").setValue("Уфа");
     String currentDays = generateDays (addDays 2, pattern "dd.MM.yyyy");
     $("[data-test-id=date] 'input").sendKeys(Keys.chard (Keys.Shift, Keys.HOME)(Keys.Delete);
     $("[data-test-id=date] 'input").sendKeys(currentData);
     $("[data-test-id=date] 'input").setValue(dateText);
     $("[data-test-id=name] 'input").setValue("Анна Иванова");
     $("[data-test-id=phone]'input").setValue("+79999999999");
     $("[data-test-id=agreement]").click();
     $("button.button").click();
     $(".notification__content")
             .shouldBe(Condition.visible,Duration.ofSeconds(15));
             .shouldHave(Condition.exactText("Встреча успешно забронирована на " + currentData));
 }

 }

}