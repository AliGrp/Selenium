package day_01_prcatise;

import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class C07 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        // arama motorunda nutella yazip aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linkler =driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi: "+linkler.size());
        // linkleri yazdiriniz
        int sayac =1;
        for (WebElement each:linkler) {
            System.out.println(sayac + ". link " + each.getText());
            sayac++;
        }
        // pencereyi kapatiniz
        driver.close();
    }
}
