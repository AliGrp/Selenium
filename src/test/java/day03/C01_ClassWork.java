package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;

public class C01_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

//   https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
//   “city bike” araması yapın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike",Keys.ENTER);
//   Arama sonuç metnini yazdırın
        List<WebElement> searchConclusion=driver.findElements(By.className("sg-col-inner"));//tum class name'i icerene WebElementleri bir list icine koyduk
        System.out.println("Arama sonucu: "+searchConclusion.get(0).getText());//list icerisinden birinci elemani alarak degerini yazdiriyorum
//   Sonuç sayısını yazdırın
       String conclusionNumber= searchConclusion.get(0).getText().split(" ")[2];
        System.out.println("conclusionNumber = " + conclusionNumber);
//   Sonuc sayısını LAMBDA ile yazdırın
        Arrays.stream(searchConclusion.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);
//   Çıkan ilk sonucun resmine tıklayın.
        List<WebElement> resimler=driver.findElements(By.className("s-image"));
        resimler.get(0).click();
//   Sayfayı kapatın

    }
}
