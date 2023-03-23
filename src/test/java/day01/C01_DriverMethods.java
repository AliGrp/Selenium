package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//bos bir browser actik
        driver.get("http://www.google.com");//gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfe basligi: "+driver.getTitle());//sayfa basligi
        System.out.println("Sayfa url: "+driver.getCurrentUrl());//url verri
        System.out.println("Sayfa html kodlari: "+driver.getPageSource());//sayfa kaynak kodlarini getirir
        System.out.println("Sayfa hash: "+driver.getWindowHandle());//sayfa hash degerleri getirir bu degerle baska sayfadan bu sayfaya donmeyi saglar


    }
}
