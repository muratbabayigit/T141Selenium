package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.net.http.WebSocket;
import java.time.Duration;

public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testotomasyonu.com/relativeLocators");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement appleHeadPhone=driver.findElement(By.xpath("//*[@id='pic6_thumb']"));
        driver.findElement(RelativeLocator.with(By.xpath("//*[@id='pic7_thumb']"))
                            .toRightOf(appleHeadPhone)).click();
        Thread.sleep(3000);


    }
}
