package day10_Actions_Faker_FileTestleri;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_ActionsAsagıyaInme extends TestBase {

    @Test
    public void iframeTesti() {

        // 2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/ ");

        //3- video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4- videoyu izlemek icin Play tusuna basin
        // play

        //5- videoyu calistirdiginizi test edin

    }
}
