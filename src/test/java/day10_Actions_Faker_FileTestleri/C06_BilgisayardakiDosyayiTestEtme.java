package day10_Actions_Faker_FileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_BilgisayardakiDosyayiTestEtme {

    @Test
    public void test01(){

        // Downloads' da logo.png olduğunu test edin

        String dosyaYolu = "C:\\Users\\AfadLocal\\Downloads\\logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // Herkeste farkli olan ==> user.home
        //          /Users/ahmetbulutluoz
        // Herkeste ayni olan
        //          /Downloads/logo.png

        String dinamikDosyaYolu = System.getProperty("user.home") +
                "/Downloads/logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }

    }

