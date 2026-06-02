package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultipleWindowsPage extends BasePage {
    private final By clickHereLink = By.linkText("Click Here");

    public void open() {
        openUrl("https://the-internet.herokuapp.com/windows");
    }

    public void clickNewWindowLink() {
        click(clickHereLink);
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void switchToWindow(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }
}
