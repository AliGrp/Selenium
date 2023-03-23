package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {
     /*
Amazon sayfasına gidin
Search bölümünü locate edip, "Tablet" aratalım
Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
Sayfayı kapatın
 */
     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//         Amazon sayfasına gidin
         driver.get("https://www.amazon.com");

//         Search bölümünü locate edip, "Tablet" aratalım
        WebElement searchBox =  driver.findElement(By.id("twotabsearchtextbox"));

//         Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
         searchBox.sendKeys("Tablet"+ Keys.ENTER);
//         Sayfayı kapatın

     }
}
