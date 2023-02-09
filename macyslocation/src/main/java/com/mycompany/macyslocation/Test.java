/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macyslocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author ukiel
 */
public class Test {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\TestUser\\Desktop\\SeleniumWorkspace\\ABC\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");     
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1400,800");  
        WebDriver driver = new ChromeDriver(options);   
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }
}

