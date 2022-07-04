package test.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        Thread.sleep(1500);
        WebElement element1 = driver.findElement(By.xpath("//div[@class='card-up']"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//li[@id='item-1']"));
        element2.click();
        Thread.sleep(1000);

        WebElement element3 = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        element3.click();
        Thread.sleep(1000);

        WebElement element4 = driver.findElement(By.xpath("//li[@class='btn btn-light '][2]"));
        element4.click();
        Thread.sleep(1000);
        WebElement element5 = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        element5.click();
        Thread.sleep(1000);
        WebElement element6 = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
        element6.click();
    }

}
