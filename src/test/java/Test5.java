import PageObjects.BaseSetup;
import PageObjects.PageObjectFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Test5 extends BaseSetup {
    @Test

    public void Saveforlater() throws InterruptedException {


        openWebPage("https://www.amazon.in/?ref_=nav_signin");
        PageObjectFunctions.enterTextInSearch("Toys");
        Thread.sleep(5000);

        System.out.println("open another url");
        openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?keywords=toys&qid=1691101472&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

        System.out.println("click on addToCarticon");
        PageObjectFunctions.addToCartButton();
        Thread.sleep(4000);

        System.out.println("click on cart icon");
        PageObjectFunctions.carticon();

        System.out.println("click on save for later");
        PageObjectFunctions.SaveForLater();

        System.out.println("verify empty header for saveformore");
        String ActualHeader="Your Amazon Cart is empty.";
        String ExpectedHeader=PageObjectFunctions.EmptyHeaderSaveForLater();
        Assert.assertEquals(ActualHeader,ExpectedHeader);
    }
}
