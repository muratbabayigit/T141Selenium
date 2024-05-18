package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        /* Exercise3... */
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        // Click on  Calculater under Micro Apps
        // Type any number in the first input
        // Type any number in the second input
        // Click on Calculate
        // Get the result
        // Print the result

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.name("number1")).sendKeys("100");
        driver.findElement(By.name("number2")).sendKeys("400");
        driver.findElement(By.id("calculate")).click();
        driver.findElement(By.id("answer")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
