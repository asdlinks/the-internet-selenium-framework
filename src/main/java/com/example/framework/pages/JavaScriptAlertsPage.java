package com.example.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class JavaScriptAlertsPage extends BasePage {
    private final By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By jsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private final By resultText = By.id("result");

    public void open() {
        openUrl("https://the-internet.herokuapp.com/javascript_alerts");
    }

    public Alert clickJsAlert() {
        click(jsAlertButton);
        return driver.switchTo().alert();
    }

    public Alert clickJsConfirm() {
        click(jsConfirmButton);
        return driver.switchTo().alert();
    }

    public Alert clickJsPrompt() {
        click(jsPromptButton);
        return driver.switchTo().alert();
    }

    public String getResultText() {
        return getText(resultText);
    }
}
