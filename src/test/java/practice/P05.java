package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P05 extends TestBase {

        @Test
        public void Iframe () throws InterruptedException {
            driver.get("https://the-internet.herokuapp.com/iframe");
            WebElement yaziElementi = driver.findElement(By.xpath("(//h3)[1]"));
            if (yaziElementi.isDisplayed()) {
                System.out.println("Yazı Testi Passed");
                System.out.println(yaziElementi.getText());
            } else {
                System.out.println("Yazı görüntülenemedi");
            }
            ;
            WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
            driver.switchTo().frame(iframe);

            WebElement textArea = driver.findElement(By.xpath("//*[@data-id='mce_0']"));

            textArea.clear();
            textArea.sendKeys("Merhaba Dünya");
            Thread.sleep(3000);

            driver.switchTo().defaultContent();

            WebElement eselenium = driver.findElement(By.xpath("(//*[@target='_blank'])[2]"));

            if (eselenium.isDisplayed()) {
                System.out.println("Link Yazısı Görüntülendi");
                System.out.println(eselenium.getText());
            } else {
                System.out.println("Link Yazısı Görüntülenemedi");
            }
            ReusableMethods.bekle(3);


        }
    }

