package day04_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {


    /*
         Mahşerin 4 atlısından ilki webdriver ayarlarını yapmaktı
         ama bu adın mecburi değildir
         Selenium 4.8  ile kendi webdriver'ını oluşturduğundan
         biz dışardan webdriver tanımlamasak da
         elenium kendi driver'ını kullanacaktır
           */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(2000);
        driver.quit();

    }
}
