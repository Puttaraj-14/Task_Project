import PageObjects.BaseSetup;
import PageObjects.PageObjectFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Combinations extends BaseSetup {

    @Test

    public void All() throws InterruptedException {

        openWebPage("https://www.amazon.in/?ref_=nav_signin");
        PageObjectFunctions.enterTextInSearch("Toys");
        Thread.sleep(5000);

        System.out.println("open another url");
        openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?keywords=toys&qid=1691100898&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

        System.out.println("verify the addToCart button present or not");
        String Acutal =PageObjectFunctions.checkAddTOcatbtn();
        String Expected = "Add to Cart";
        Assert.assertEquals(Acutal,Expected);


        //test2

        System.out.println("click on addToCarticon");
        PageObjectFunctions.addToCartButton();
        Thread.sleep(4000);

        System.out.println("verify header after item added to cart apart from click cart icon");
        String Actual="Added to Cart";
        String Expect=PageObjectFunctions.VerifyHeaderAfteritemAddedToCart();
        Assert.assertEquals(Actual,Expect);


        //test3
        System.out.println("click cart icon");
        Thread.sleep(4000);
        PageObjectFunctions.carticon();


        //test4

        System.out.println("click on delete in cart ");
        PageObjectFunctions.DeleteInCartPage();

        System.out.println("verify empty cart header");
        PageObjectFunctions.CartEmptyHeader();
        String ActualHeader="Your Amazon Cart is empty.";
        String ExpctedHeader=PageObjectFunctions.CartEmptyHeader();
        Assert.assertEquals(ActualHeader,ExpctedHeader);


        //test5
        PageObjectFunctions.enterTextInSearch("Toys");
        Thread.sleep(5000);

        System.out.println("open another url");
        openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?keywords=toys&qid=1691100898&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

        System.out.println("click on addToCarticon");
        PageObjectFunctions.addToCartButton();
        Thread.sleep(4000);

        System.out.println("click on cart icon");
        PageObjectFunctions.carticon();

        System.out.println("click on save for later");
        PageObjectFunctions.SaveForLater();

        System.out.println("verify empty header for saveformore");
        String ActualHeader2="Your Amazon Cart is empty.";
        String ExpectedHeader=PageObjectFunctions.EmptyHeaderSaveForLater();
        Assert.assertEquals(ActualHeader2,ExpectedHeader);


        //test6

        PageObjectFunctions.enterTextInSearch("Toys");
        Thread.sleep(5000);

        System.out.println("open another url");
        openWebPage("https://www.amazon.in/PLUSPOINT-Imagination-Educational-Interaction-Elimination/dp/B09SGG9L6W/ref=sr_1_1_sspa?keywords=toys&qid=1691100898&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

        System.out.println("click on addToCarticon");
        PageObjectFunctions.addToCartButton();
        Thread.sleep(4000);

        System.out.println("click on cart icon");
        PageObjectFunctions.carticon();








    }
}
