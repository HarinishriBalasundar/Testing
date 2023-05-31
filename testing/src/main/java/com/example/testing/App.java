package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //launching the url
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        //maximizing the webpage
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Harinishri");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("B");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("harinibalaa09@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sample");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        Thread.sleep(1000);
        
        
        //subscribe
    }
    
}
