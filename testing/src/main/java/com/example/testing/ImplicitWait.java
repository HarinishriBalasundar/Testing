package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
