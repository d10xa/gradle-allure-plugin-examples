import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Description("junit test example")
public class JunitTest {

    @Title("Test with html attachment")
    @Test
    public void testWithAttachment() {
        attachment();
        Assert.assertTrue(true);
    }

    @Attachment(value = "hello.html", type = "text/html")
    public String attachment() {
        return "<p>HELLO</p>";
    }

}
