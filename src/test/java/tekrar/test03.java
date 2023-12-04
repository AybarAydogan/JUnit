package tekrar;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class test03 extends TestBase {

    @Test
    public void test03() {

        driver.get("https://www.facebook.com");

        ReusableMethods.bekle(2);

        driver.findElement(By.xpath("//*[@*='open-registration-form-button']")).click();

        WebElement firstnameKutusu = driver.findElement(By.xpath("//*[@name='firstname']"));
        Actions actions = new Actions(driver);
        Faker faker = new Faker();

        String email = faker.internet().emailAddress();

        actions.click(firstnameKutusu)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("20").sendKeys(Keys.TAB)
                .sendKeys("NİSAN").sendKeys(Keys.TAB)
                .sendKeys("2004").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT).perform();

        driver.findElement(By.xpath("//*[@name='websubmit']")).click();

        ReusableMethods.bekle(15);
    }
}
