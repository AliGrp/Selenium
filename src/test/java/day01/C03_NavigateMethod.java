package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Amazon sayfasına gidelim:
        driver.navigate().to("https://amazon.com");
        //driver.get("https://amazon.com");

        //techproeducation sayfasına gidelim:
        Thread.sleep(3000);//3000 ms bekler=> Java methodu
        driver.navigate().to("https://techproeducation.com");
        //driver.get("https://techproeducation.com");

        //Amazon sayfasına geri dönelim:
        Thread.sleep(3000);
        driver.navigate().back();

        //techproeducation sayfasına tekrar gidelim:
        Thread.sleep(3000);
        driver.navigate().forward();

        //Sayfayı yenileyelim(refresh):
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayı kapatalım:
        driver.close();

    }
}
