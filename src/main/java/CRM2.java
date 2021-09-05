import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CRM2 {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1800, 1040));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".first > .unclickable > .title"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".first .last .title")).click();
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Мила");
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Йовович");
        driver.findElement(By.cssSelector(".select2-arrow")).click();
        driver.findElement(By.cssSelector(".select2-input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[2]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Зам прокурора");
        driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
    }
}


