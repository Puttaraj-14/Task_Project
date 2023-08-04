import PageObjects.BaseSetup;
import PageObjects.PageObjectFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Test3 extends BaseSetup {
@Test
public void itemaddedToCart() throws InterruptedException {

    openWebPage("https://www.amazon.in/?ref_=nav_signin");
    PageObjectFunctions.enterTextInSearch("Toys");
    Thread.sleep(5000);

    System.out.println("scroll and click on product");
    PageObjectFunctions.scrollToElement();

    System.out.println("open another url");
    openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?crid=2B2HRYEX531A9&keywords=toys&qid=1691100227&sprefix=toys%2Caps%2C372&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

    System.out.println("click on addToCart");
    PageObjectFunctions.addToCartButton();

    System.out.println("click cart icon");
    Thread.sleep(4000);
    PageObjectFunctions.carticon();

}

}
