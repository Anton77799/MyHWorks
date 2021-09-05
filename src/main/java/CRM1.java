import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CRM1 {

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
            WebElement element = driver.findElement(By.cssSelector(".dropdown:nth-child(3) > .unclickable > .title"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".dropdown:nth-child(3) .single:nth-child(4) .title")).click();
        driver.findElement(By.cssSelector(".back")).click();
        driver.findElement(By.name("crm_project[name]")).sendKeys("Кузя Рябкис");
        driver.findElement(By.cssSelector(".select2-default > .select2-arrow")).click();
        driver.findElement(By.cssSelector(".select2-focused")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[2]")).click();
        new WebDriverWait(driver, 10);

        {
                WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[2]/div[5]/div[2]/div/select"));
                dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).click();
        }
        {
                WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[2]/div[6]/div[2]/div/select"));
                dropdown.findElement(By.xpath("//option[. = 'Ким Юрий']")).click();
        }
        {
                WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[2]/div[7]/div[2]/div/select"));
                dropdown.findElement(By.xpath("//option[. = 'Рунов Михаил']")).click();
        }
        {
                WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[2]/div[8]/div[2]/div/select"));
                dropdown.findElement(By.xpath("//option[. = 'Козлова Светлана']")).click();
        }
        {
                WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[2]/div[9]/div[2]/div/select"));
                dropdown.findElement(By.xpath("//option[. = 'Новиков Андрей']")).click();
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[2]/div/a/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[2]/div/a/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("#select2-drop-mask"));
            Actions builder = new Actions(driver);
        }
        driver.findElement(By.cssSelector(".lang-ru")).click();
            driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn")).click();
        }
    }

