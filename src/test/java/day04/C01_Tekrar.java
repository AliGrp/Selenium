package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //Web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Amazon'da city bike ara
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //            SORU 2) Hybrid bolumune tiklayiniz
        WebElement hybrid=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        hybrid.click();

        //görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonuc=driver.findElement(By.xpath("//*[text()='15 results for']"));
        String sonucSayisi =sonuc.getText().split(" ")[0];
        System.out.println("sonucSayisi = " + sonucSayisi);



        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement resim = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        resim.click();
    }

}
