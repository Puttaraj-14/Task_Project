import PageObjects.BaseSetup;
import PageObjects.PageObjectFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Test1 extends BaseSetup {
    @Test
    //Verifying the add To card button present or not
    public void ValiodateAddToCartPresent() throws InterruptedException {
      //  PageObjectFunctions pof =new PageObjectFunctions();
        openWebPage("https://www.amazon.in/?ref_=nav_signin");
        PageObjectFunctions.enterTextInSearch("Toys");
        Thread.sleep(5000);

        System.out.println("open another url");
        openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?keywords=toys&qid=1691100898&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

        System.out.println("verify the addToCart button present or not");
        String Acutal =PageObjectFunctions.checkAddTOcatbtn();
        String Expected = "Add to Cart";
        Assert.assertEquals(Acutal,Expected);
        System.out.println("================== Sucessfully completed Test1 ===================");

//        driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-span12 a-button-base celwidget']")).click();
    }


}

