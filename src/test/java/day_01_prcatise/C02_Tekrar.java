package day_01_prcatise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(4000);
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("Teknosa Title: "+driver.getTitle());
        System.out.println("Teknosa Url: "+driver.getCurrentUrl());
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getTitle().contains("Teknoloji")) {
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("teknosa")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(4000);
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (driver.getTitle().contains("MEDUNNA")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("medunna")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(4000);
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(4000);
        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(4000);
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(4000);
        // pencereyi kapat
        driver.close();
    }
}
