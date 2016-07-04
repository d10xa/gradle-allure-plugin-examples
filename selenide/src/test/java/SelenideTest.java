import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Description;

import java.io.IOException;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Description("selenide test example")
public class SelenideTest {

    @Test
    public void search_selenide_in_google() throws IOException {
        open("http://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#ires .g").shouldHave(size(10));
        $("#ires .g").shouldBe(visible).shouldHave(
            text("Selenide: concise UI tests in Java"),
            text("selenide.org"));
    }

    @After
    public void tearDown() throws IOException {
        screenshot();
    }

    @Attachment(type = "image/png")
    public byte[] screenshot() throws IOException {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
