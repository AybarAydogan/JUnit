package tekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class test2 extends TestBase {
    @Test
    public void trendyol(){
        // trendyol gidiniz
        driver.get("https://www.trendyol.com");
        // cocokeys'ini kapatınız
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        // bir ürünün linkini giriniz
        driver.findElement(By.xpath("(//p[@class='link-text'])[1]")).click();
       WebElement uyeOl = driver.findElement(By.xpath("//*[@id=login-register]/div[2]/div/button[2]"));
  uyeOl.click();


    }
}
