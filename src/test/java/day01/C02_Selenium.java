package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_Selenium {
    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver","src/resources/drivers/msedgedriver.exe");
/*
            En temel haliyle otomosyon yapmak icin classimiza gerekli olan web driver
yerini belirtiyoruz. java kutuphanesindeki " System.setProperty" methoduyla
driverimizin yolunu belirtiyoruz.

 */

                WebDriver driver = new EdgeDriver();
                driver.get("http://www.google.com");

            }
        }





