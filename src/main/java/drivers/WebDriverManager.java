package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static void setupWebDriver(){
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void quiteWebDriver(){
        driver.quit();
        driver=null;
    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void maxWindow(){
        driver.manage().window().maximize();
    }

}
