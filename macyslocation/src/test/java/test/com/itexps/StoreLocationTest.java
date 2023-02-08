/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class StoreLocationTest {

    private WebDriver driver;
    private String baseUrl;

    public StoreLocationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void StoreLocationTest() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.costco.com/");
        driver.findElement(By.linkText("Locations")).click();
        driver.findElement(By.xpath("//div[@id='title-container']/h1")).click();
        //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='title-container']/h1 | ]]
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='title-container']/h1")).getText(), "Find a Warehouse");
        } catch (Error e) {
            System.out.println(e.toString());
        }
        driver.findElement(By.id("search-warehouse")).click();
        driver.findElement(By.id("search-warehouse")).clear();
        driver.findElement(By.id("search-warehouse")).sendKeys("60133");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//table[@id='warehouse-list']/tr/td[2]/div/div/h2")).click();
        driver.findElement(By.linkText("Bloomingdale")).click();
        driver.close();
    }

}
