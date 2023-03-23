package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //techproeducation sayfasına gidelim:
        driver.get("https://techproeducation.com");

        //Sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu: "+driver.manage().window().getSize());

        //Sayfayi minimize(simge durumu) yapalim
        Thread.sleep(2000);
        driver.manage().window().minimize();

        //Sayfayi maximize(buyutme) yapalim
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //Sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu: "+driver.manage().window().getSize());

        //Sayfayi fullscreen yapalim
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        //Sayfanin konumu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu: "+driver.manage().window().getSize());

        driver.close();
    }
}
