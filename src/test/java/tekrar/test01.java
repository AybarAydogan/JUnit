package tekrar;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class test01 extends TestBase {
    @Test
    public void test01(){

        // twitch uygulamasına gir
        driver.get("https://www.twitch.com");
        // üye ol buttonuna tıkla
        driver.findElement(By.xpath("(//div[@class='Layout-sc-1xcs6mc-0 bEHpPc'])[2]")).click();

        driver.findElement(By.id("signup-username")).sendKeys("javacandir");
        driver.findElement(By.id("password-input")).sendKeys("Aybaraydogan1015");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/div/form/div[3]/button/div/div")).click();

    }
}
