package com.example.framework.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.example.framework.pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTests extends BaseTest {

    @Test
    public void verifyJavaScriptAlertsAreDisplayed() {
        JavaScriptAlertsPage alertsPage = new JavaScriptAlertsPage();

        alertsPage.open();
        var alert = alertsPage.clickJsAlert();
        assertEquals("I am a JS Alert", alert.getText(), "JS Alert should be displayed.");
        alert.accept();
        assertEquals("You successfully clicked an alert", alertsPage.getResultText());

        alertsPage.open();
        alert = alertsPage.clickJsConfirm();
        assertEquals("I am a JS Confirm", alert.getText(), "JS Confirm should be displayed.");
        alert.dismiss();
        assertEquals("You clicked: Cancel", alertsPage.getResultText());

        alertsPage.open();
        alert = alertsPage.clickJsPrompt();
        assertEquals("I am a JS prompt", alert.getText(), "JS Prompt should be displayed.");
        alert.sendKeys("Selenium");
        alert.accept();
        assertTrue(alertsPage.getResultText().contains("Selenium"));
    }
}
