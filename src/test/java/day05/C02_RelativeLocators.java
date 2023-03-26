package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C02_RelativeLocators {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
//        2.) Berlin’i 3 farkli relative locator ile locate edin
        WebElement NYC = driver.findElement(By.id("pid3_thumb"));
        WebElement area = driver.findElement(By.id("pid8_thumb"));
        WebElement berlin = driver.findElement(with(By.tagName("img")).below(NYC).toLeftOf(area));
        berlin.click();


//        3 ) Relative locator’larin dogru calistigini test edin

        String actualIdDegeri= berlin.getAttribute("id");
        System.out.println("actualIdDegeri = " + actualIdDegeri);
        String expectedIdDegeri = "pid7_thumb";
        if (actualIdDegeri.equals(expectedIdDegeri)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

    }
}
