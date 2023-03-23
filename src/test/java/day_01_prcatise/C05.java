package day_01_prcatise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();
        System.out.println("Maximize konum: "+driver.manage().window().getPosition());
        System.out.println("Maximize olcusu: "+driver.manage().window().getSize());
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum: "+driver.manage().window().getPosition());
        System.out.println("Fullscreen olcu: "+driver.manage().window().getSize());
        // sayfayi kapatiniz
        driver.close();
    }
}
