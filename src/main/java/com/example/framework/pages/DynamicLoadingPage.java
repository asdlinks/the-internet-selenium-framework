package com.example.framework.pages;

import org.openqa.selenium.By;

public class DynamicLoadingPage extends BasePage {
    private final By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private final By example2Link = By.linkText("Example 2: Element rendered after the fact");
    private final By startButton = By.cssSelector("#start button");
    private final By finishText = By.cssSelector("#finish h4");

    public void open() {
        openUrl("https://the-internet.herokuapp.com/dynamic_loading");
    }

    public void openExample1() {
        click(example1Link);
    }

    public void openExample2() {
        click(example2Link);
    }

    public void startLoading() {
        click(startButton);
    }

    public String getFinishText() {
        return waitForVisible(finishText).getText();
    }

    public boolean isFinishVisible() {
        return isElementVisible(finishText);
    }
}
