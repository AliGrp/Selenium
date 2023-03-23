package day_01_prcatise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // ilk kutucuga 20 giriniz
        driver.findElement(By.id("number1")).sendKeys("20", Keys.ENTER);
        // ikinci kutucuga 30 giriniz
        driver.findElement(By.id("number2")).sendKeys("30", Keys.ENTER);
        // calculate'e tıklayınız
        driver.findElement(By.id("calculate")).click();
        // sonucu yazdırınız
        System.out.println("sonuc: "+driver.findElement(By.id("answer")).getText());
        // sayfayi kapatiniz
        driver.close();
    }
}
