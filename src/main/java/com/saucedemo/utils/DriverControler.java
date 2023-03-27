package com.saucedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverControler {


    public static WebDriver driver;

    public static DriverControler chromeHisBrowserWeb() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);
        return new DriverControler();
    }


    public static WebDriver on(String url) {
        driver.get(url);
        return driver;
    }
}
