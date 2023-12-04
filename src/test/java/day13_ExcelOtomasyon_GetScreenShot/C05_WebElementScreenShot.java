package day13_ExcelOtomasyon_GetScreenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C05_WebElementScreenShot extends TestBase {

    @Test
    public void aramaTesti() throws IOException {
        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        // dress icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);
        // arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));

        String unExpectedAramaSonucu = "0 Products Found";
        String actualAramaSonucu = aramaSonucElementi.getText();
        Assert.assertNotEquals(unExpectedAramaSonucu, actualAramaSonucu);

        ReusableMethods.bekle(3);
        // arama sonuç yazısının screenshot'ini kaydedin

        // 1.adım scrennshot alacağımız webelementi locate et

        //2.adım screenshot'ı kaydedeceğimiz file'ı oluşturalım

        File istenenWebelementScreenshot = new File("target/screenshots/tumSayfaScreenshot.jpg");

        // 3.adım webelement üzerinde screenshot'ı alıp geçici bir dosyaya kaydedin
        File geciciDosya = aramaSonucElementi.getScreenshotAs(OutputType.FILE);

        // 4.adım gecici dosyayı asıl dosyaya kopyalayım
        FileUtils.copyFile(geciciDosya,istenenWebelementScreenshot);


    }


}
