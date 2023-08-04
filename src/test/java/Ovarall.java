import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Ovarall {


    @Test

    public void AllTestCase() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeExtension\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?ref_=nav_signin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("toys");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).click();
        String ItemAdding=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();


        String parentWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break; // Switched to the new window, so break the loop.
            }
        }

        Thread.sleep(5000);
        String Expected1 = "Add to Cart";
        String Acutal2 = driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']")).getText();

        Assert.assertEquals(Acutal2,Expected1);


        //VerifyAbletoClickonaddToCart
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(4000);

        String Expected2=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
        String Actual2="Added to Cart";

        Assert.assertEquals(Actual2,Expected2);


        //itemaddedToCart

        driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
        String IteminCart=driver.findElement(By.xpath("(//span[@class='a-truncate-full a-offscreen'])[1]")).getText();

        if(ItemAdding.equals(IteminCart)){
            System.out.println("while added item same item reflect in cart");
        }else {
            System.out.println("while added item same item not reflect in cart");

        }

        //DeletFromCartPage

        driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
        String Expected3=driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
        String Actual3="Your Amazon Cart is empty.";

        Assert.assertEquals(Actual3,Expected3);



        //ShareTextLinkInCartPage

//        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("toys");
//        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,200)");
//
//        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).click();
//        String ItemAdding2=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
//
//
//        String parentWindowHandle2 = driver.getWindowHandle();
//        Set<String> allWindowHandles2 = driver.getWindowHandles();
//
//        for (String windowHandle1 : allWindowHandles2) {
//
//            if (!windowHandle1.equals(parentWindowHandle2)) {
//                driver.switchTo().window(windowHandle1);
//                System.out.println("switch 2");
//                break; // Switched to the new window, so break the loop.
//            }
//        }
//
//        driver.findElement(By.id("add-to-cart-button")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
//        driver.findElement(By.xpath("(//input[@value='Save for later'])[1]")).click();
//
//       String  Expected4= driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']")).getText();
//        String Actual4="Your Amazon Cart is empty.";
//
//        Assert.assertEquals(Actual4,Expected4);



        //ValidateQuantityChange

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("toys");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'])[1]")).click();

        String ItemAdding3=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();

        String parentWindowHandle3 = driver.getWindowHandle();
        Set<String> allWindowHandles3 = driver.getWindowHandles();

        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break; // Switched to the new window, so break the loop.
            }
        }
        driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='nav-cart']")).click();

        WebElement DrpodownElement=driver.findElement(By.xpath("//select[@name='quantity']"));

        Select drp=new Select(DrpodownElement);
        drp.selectByValue("4");

        String Expected5= driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).getText();
        String Acutal5="4";

        Assert.assertEquals(Acutal5,Expected5);


    }


}
