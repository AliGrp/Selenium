package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Examples {
    /*
  ı Browser'ı açıp maximize yapın
   Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
   Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
   Amazon sayfasına geri dönün
   Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
   Sayfanın konumunu ve boyutunu yazdırın
   Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
   İstediğiniz şekilde olup olmadığını test edin
   Sayfayı kapatn
    */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

//         Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

//         Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//         Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
       driver.get("https://youtube.com");

//         Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

//         Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualurl = driver.getCurrentUrl();
        String expecturl = "https://www.amazon.com/";
        if (actualurl.equals(expecturl)){
            System.out.println("URL TEST PASSED");
        }else
        System.out.println("URL TEST FAILED");


//         Sayfanın konumunu ve boyutunu yazdırın
        System.out.println("Konum: "+driver.manage().window().getPosition());
        System.out.println("Boyutlari: "+driver.manage().window().getSize());

//         Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(100,80));
        driver.manage().window().setSize(new Dimension(800,800));

//         İstediğiniz şekilde olup olmadığını test edin
        //POSITION
        Point actualPosition = driver.manage().window().getPosition();
        if (actualPosition.x==100 && actualPosition.y==80){
            System.out.println("POSITION TEST PASSED");
        }else System.out.println("POSITION TEST FAILED");

        //SIZE
        Dimension actualSize = driver.manage().window().getSize();
        if (actualSize.height==800 && actualSize.width==800){
            System.out.println("SIZE TEST PASSED");
        }else System.out.println("SIZE TEST FAILED");

//         Sayfayı kapatın

        driver.close();

    }
}