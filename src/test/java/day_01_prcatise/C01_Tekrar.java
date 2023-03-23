package day_01_prcatise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        ChromeDriver driver =new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        // amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);
        // n11 adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("Her Sey Yolunda Merkez");
    }
}
