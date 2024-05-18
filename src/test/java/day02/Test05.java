package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test05 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- http://babayigit.net/test/ adresine gidilir ve pencere maximize edilir
        2- INFO FORM butonuna tıklanır
        3- Form verileri girilir
        4- Save butonuna tıklanır
        5- Sonuç yazdırılır
         */

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://babayigit.net/test/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//img[@src='img/info.png']")).click();
        driver.findElement(By.id("firstName")).sendKeys("Eghbal");
        driver.findElement(By.name("lastName")).sendKeys("Gajar");
        driver.findElement(By.id("email")).sendKeys("eghbalgajar@babayigit.net");
        driver.findElement(By.id("phone")).sendKeys("905323323232");
        driver.findElement(By.id("occupation")).sendKeys("QA SDET");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("city")).sendKeys("Maragheh");
        driver.findElement(By.id("country")).sendKeys("IRAN");
        driver.findElement(By.xpath("//img[@src='img/save.png']")).click();
        Thread.sleep(2500);
        driver.quit();
    }
}
