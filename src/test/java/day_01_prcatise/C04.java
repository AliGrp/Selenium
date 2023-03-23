package day_01_prcatise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari = driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (sayfaKaynakKodlari.contains("gateway")){
            System.out.println("Kaynak kodlarinda gateway iceriyor");
        }else System.out.println("Kaynak kodlarinda gateway icermiyor");
        // sayfayi kapatiniz
        driver.close();

    }
}
