package com.example.framework.tests;

import com.example.framework.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        DriverManager.initDriver();
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
