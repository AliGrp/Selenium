package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
//        Add Element butonuna basin
        WebElement button = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        button.click();
        Thread.sleep(3000);
//        Delete butonu’nun gorunur oldugunu test edin Delete tusuna basin
        WebElement delete = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println(delete.isDisplayed());
        delete.click();


//“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println(button.isDisplayed());
        button.click();
    }
}
