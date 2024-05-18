package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        /*
         //....Exercise-1:...
                 // Create a new class with main method
                 // Set Path
                 // Create a chrome driver
                 // Maximize window
                 // Open google home page https://www.google.com
                 // On the same class, navigate to wisequarter home page https://www.wisequarter.com and navigate back to google
                 // Wait about 4 sn
                 // Navigate forward to wisequarter
                 // Refresh page
                 // Close/quit the browser
                 // And Last step print "All is well" on console
         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.wisequarter.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println("All is well");
    }
}
