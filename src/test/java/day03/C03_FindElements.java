package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasinda kac adet link vardir
        driver.get("https://www.amazon.com");
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerListesi = " + linklerListesi.size());

        //linkleri yazdiralim
        int num =1;
        for (WebElement w:linklerListesi){
            System.out.println(num + w.getText());
            num++;
        }


    }
}
