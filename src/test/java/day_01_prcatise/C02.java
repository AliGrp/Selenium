package day_01_prcatise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Pencereyi maximize yapiniz
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String title = driver.getTitle();
        System.out.println("Teknosa basligi: "+title);
        String url = driver.getCurrentUrl();
        System.out.println("Teknosa Url: "+url);
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (title.contains("Teknoloji")){
            System.out.println("Title teknosa kelimesini iceriyor");
        }else System.out.println("Title teknosa kelimesi icermiyor");
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (url.contains("teknosa")){
            System.out.println("Url teknosa kelimesini iceriyor");
        }else System.out.println("Url teknosa kelimesi icermiyor");
        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (driver.getTitle().contains("nar")){
            System.out.println("Title MEDUNNA kelimesini iceriyor");
        }else System.out.println("Title MEDUNNA kelimesi icermiyor");
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("medunna")){
            System.out.println("Url MEDUNNA kelimesini iceriyor");
        }else System.out.println("Url MEDUNNA kelimesi icermiyor");
        // teknosa adresine geri donunuz
        driver.navigate().back();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
    }
}
