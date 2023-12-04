package day12_WebTables_excelOtomasyon;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcelOtomasyonu {

    @Test
    public void excelOtomasyonTesti() throws IOException {

        String dosyoYolu = "C:\\Users\\AfadLocal\\IdeaProjects\\com._Junit\\src\\test\\java\\day12_WebTables_excelOtomasyon\\ulkeler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(dosyoYolu);

        /*
           Bilgisayarımızdaki fiziki bir dosyayı
            kodlarımıza direkt eklememiz mümkün değil

            Apache poi verdiğimiz dosya yolunda ki
            fiziki excel dosyasında bulunan tüm dataları
            fileInputStream objesi sayesinde okuyup
            o bilgileri kullanabileceğiniz
            EXCEL dosyasının KOPYASINI oluşturur

            biz de bu kopya excel üzerinde istediğimiz işlemleri yapabiliriz

            ÖNEMLİ NOT :
            bu test methodu içinde yaptığımız tüm işlemler
            excel üzerinde değil
            38.satırın çalıştığı anda excel'de var olan bilgiler üzerindedir

            satir ve sutün bilgileri index ile çalışır
            yani 0'dan başlar
         */

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sayfa1 = workbook.getSheet("sayfa1");
        Row ucuncuSatir = sayfa1.getRow(3);
        Cell ikinciData = ucuncuSatir.getCell(2);

        System.out.println(ikinciData);

        // 12.satırda bulunan ülkenin türkçe isminin "Azerbaycan" olduğunu test edin

        String actualIstenenUlkeAdi = sayfa1.getRow(11).getCell(2).toString();
        String expecedUlkeAdi = "Azerbaycan";

        Assert.assertEquals(expecedUlkeAdi,actualIstenenUlkeAdi);

    }
}
