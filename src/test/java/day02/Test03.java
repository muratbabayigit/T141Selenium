package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {
    public static void main(String[] args) {
         /*
        1-https://babayigit.net/test/index.html adresine gidin
        2-Arama kutusuna wise quarter yazıp saerch butonuna tıklayın
        3-Arama sonuçlarında sonuç sayısını kaydedip yazdırın

         */

        System.setProperty("Webdriver.chrome,driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://babayigit.net/test/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("search")).sendKeys("wise quarter"); //+ Keys.ENTER);
        //driver.findElement(By.name("q"));
       // driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.id("hdtb-tls")).click();
        System.out.println(driver.findElement(By.id("result-stats")).getText());
        driver.quit();


    }
}
