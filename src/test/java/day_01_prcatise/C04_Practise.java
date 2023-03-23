package day_01_prcatise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04_Practise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // Kaynak Kodlarini konsola yazdiriniz
        System.out.println(driver.getPageSource());
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if (driver.getPageSource().contains("gateway")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        // sayfayi kapatiniz
        driver.close();
    }
}
