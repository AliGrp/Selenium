package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C05_WebElementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        Web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
//        Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucSayisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucSayisi.get(0).getText());
       String tamSayi = sonucSayisi.get(0).getText().split(" ")[2];
        System.out.println(tamSayi);
        Arrays.stream(sonucSayisi.get(0).getText().split(" ")).skip(2).limit(1).forEach(System.out::println);
//        Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
            List<WebElement>resimler = driver.findElements(By.className("s-image"));
            resimler.get(3).click();


    }
}
