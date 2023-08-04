package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.SplittableRandom;

public class PageObjectFunctions extends BaseSetup
{
public static void enterTextInSearch(String input)
{
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(input);
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    System.out.println(" sucessfully enter text");

}
    public static void scrollToElement()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).click();
    }
public static void switchWindow()
{
    String parentWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();

    for (String windowHandle : allWindowHandles) {
        if (!windowHandle.equals(parentWindowHandle)) {
            driver.switchTo().window(windowHandle);
            break; // Switched to the new window, so break the loop.
        }
    }
}

public static void addToCartButton(){
    driver.findElement(By.id("add-to-cart-button")).click();

}

public static void carticon(){
    driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
}

public static String VerifyHeaderAfteritemAddedToCart(){

   String Excpected=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
   return Excpected;
}


public static void DeleteInCartPage(){
    driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
}


public static String CartEmptyHeader(){

    String ExpHeader=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
    return ExpHeader;
}


public static void SaveForLater(){

    driver.findElement(By.xpath("(//input[@value='Save for later'])[1]")).click();

}

public static String EmptyHeaderSaveForLater(){
    String ExpHeader=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
    return ExpHeader;
}

public static void SeeMoreLikeThis(){
    driver.findElement(By.xpath("(//input[@value='See more like this'])[1]")).click();
}

public static String SeeMoreLikeThisHeader(){
    String exp=driver.findElement(By.xpath("//h1[@class='a-size-large']")).getText();
    return exp;
}




public static String checkAddTOcatbtn() throws InterruptedException {
//    driver.findElement(By.xpath("//*[@id=\"CardInstancenGimih94jJTynKx13mZUlQ\"]/div[1]/div[2]/div[1]/div/div[1]/a/div/img")).click();
      Thread.sleep(2000);
    String txt=driver.findElement(By.xpath("//*[@id='submit.add-to-cart-announce']")).getText();
    return txt;
}
}
