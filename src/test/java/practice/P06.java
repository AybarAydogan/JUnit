package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class P06 extends TestBase {

    //1- https://demoqa.com/droppable adresine gidelim
    //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
    //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

    @Test
    public void test01(){

        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        WebElement tasinacakEleman= driver.findElement(By.id("draggable"));
        WebElement hedefAlan= driver.findElement(By.id("droppable"));

        Actions actions =new Actions(driver);
        ReusableMethods.bekle(3);
        actions.dragAndDrop(tasinacakEleman,hedefAlan).perform();

        WebElement drppedyazisi= driver.findElement(By.xpath("//p[text()='Dropped!']"));

        String expectedText="Dropped!" ,actualText=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();

        Assert.assertEquals(expectedText,actualText);
}
}
