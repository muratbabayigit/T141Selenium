package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.TreeMap;

public class Test02 {

     /*
          1-Driver oluşturalim
          2-Java class'imiza chnomedriver.exe i tanitalim
          3-Driver'in tum ekranı kaplamasini saglayalim
          4-"https://www.testotomasyonu.com” adresine gidelim
          5-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklesini
            söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
          6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
          7-Title'ın Test ve url inin testotomasyonu kelimesinin içerip icermedigini kontrol edelim
          8-Ardindan "https://wisequarter.com/” adresine gidip
          9-Bu adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
          10-Bir onceki web sayfamiza geri donelim
          11-Sayfayı yenileyelim
          12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
          13- En son adim olarak butun sayfalarimizi kapatmis olalim
         */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testotomasyonu.com");
       // Thread.sleep(10000);
        // İş ile ne kadar sürecek olursa olsun 10000ms bekler. Sayafa 2000ms de açılırsa bile 10000ms bekler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Sayfa açılana kadar en fazla 15sn bekle, daha erken yüklenirse beklemeye devam etme
        String firstSiteTitle= driver.getTitle();
        String firstSiteUrl=driver.getCurrentUrl();

        if (firstSiteTitle.contains("Test") && firstSiteUrl.contains("testotomasyonu")){
            System.out.println("Title ve Url aranan kelimeleri içeriyor");
        }else{
            System.out.println("En bir seçenek aranan kelimeyi içermiyor");
        }
        driver.navigate().to("https://www.wisequarter.com");
        String seconSiteTitle=driver.getTitle();

        if (seconSiteTitle.contains("Quarter")){
            System.out.println("İkinci sitenin başlığında \"Quarter\" kelimesi vardır");
        }


        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();
    }
}
