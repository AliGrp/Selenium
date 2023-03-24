package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C04_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//        2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagname = aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagname.equals(expectedTagName)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
//        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAtt = aramaKutusu.getAttribute("name");
        String expectedAtt = "field-keywords";
        if (actualAtt.equals(expectedAtt)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

    }
}
