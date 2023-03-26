package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        Web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon"
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon" spellcheck="false">
        //input[@id="twotabsearchtextbox"] ==> id ile alma
         */

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //            SORU 2) Hybrid bolumune tiklayiniz

        //WebElement hybrid=driver.findElement(By.xpath("//*[@class='a-size-base a-color-base']"));

        //(//span[@class='a-size-base a-color-base'])[11] ==> Bu sekilde index kullanarak webelemente ulasabiliriz
        // birden fazla sonuc ciktigi icin 11. sirada bulunan web elementimizi indexle belirttik

        // //*[text()='Hybrid Bikes'] ==> text ile alma
        //*[@id="n/1265459011"]/span/a/span

        //driver.findElement(By.xpath("//*[@id='n/1265459011']/span/a/span")).click();

        //*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
                //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
               // metin varsa bu şekilde locate edebiliriz

        /*
        <span class="a-size-base a-color-base">hybrid bike</span>
         */
        WebElement hybridBike=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.isDisplayed());//WE goruntuleniyormu -->true
        System.out.println(hybridBike.isEnabled());//WE erisilebiliyormu -->true
        System.out.println(hybridBike.isSelected());//WE secebiliyormu -->secilemiyor false
        hybridBike.click();

        //Sadece sonuc sayısını yazdıralım

        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println("sonuc = " + sonuc[0]);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

//        List<WebElement> resimler = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//        resimler.get(8).click();
        WebElement resimler = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));

    }
}
