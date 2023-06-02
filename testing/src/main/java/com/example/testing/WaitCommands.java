package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitCommands {
	public static void main(String args[])
	{
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //Launch the url and page
    driver.navigate().to("");
    //Sending the username
    WebElement username=driver.findElement(By.xpath(""));

	}
}
