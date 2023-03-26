package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/
        driver.get("http://a.testaddressbook.com/");
        driver.navigate().refresh();


//        sign_in
        WebElement button01 = driver.findElement(By.cssSelector("a[class='btn']"));
        button01.click();
      //  driver.findElement(By.cssSelector("a[data-trackable='{\"category\":\"Top Navigation Menu\",\"action\":\"Level 0\",\"label\":\"Log in\"}']")).click();
//        b.Locate email textbox
//        c. Locate password textbox ve
//        d.Locate signin button
//        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
//        tıklayın
//        i. Username : testtechproed@gmail.com
//        ii.Password : Test1234!
//                NOT: cssSelector kullanarak elementleri locate ediniz.
    }
}
