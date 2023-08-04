package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseSetup

{
    public static WebDriver driver;
    public void openWebPage(String url)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeExtension\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(url);//"https://www.amazon.in/?ref_=nav_signin"
    }

    public void AnotherTabUrl(String url2){
        driver.get(url2);
    }
}
