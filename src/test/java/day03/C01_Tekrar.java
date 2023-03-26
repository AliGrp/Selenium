package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

//        https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
//        “city bike” araması yapın
WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
searchBox.sendKeys("city bike", Keys.ENTER);
//        Arama sonuç metnini yazdırın
        List<WebElement> sonucMetni =  driver.findElements(By.className("sg-col-inner"));
        System.out.println("sonucMetni = " + sonucMetni.get(0).getText());
//        Sonuç sayısını yazdırın
        String [] sonuc=sonucMetni.get(0).getText().split(" ");
        System.out.println("sonuc = " + sonuc[2]);
//        Sonuc sayısını LAMBDA ile yazdırın
        Arrays.stream(sonucMetni.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);
//        Çıkan ilk sonucun resmine tıklayın.
        List<WebElement> resimler01 =driver.findElements(By.className("s-image"));
        resimler01.get(3).click();
//                Sayfayı kapatın

    }
}
