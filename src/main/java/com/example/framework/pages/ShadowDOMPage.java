package com.example.framework.pages;

import org.openqa.selenium.WebElement;

public class ShadowDOMPage extends BasePage {
    private final String hostSelector = "my-paragraph";
    private final String innerSelector = "span";

    public void open() {
        openUrl("https://the-internet.herokuapp.com/shadow_dom");
    }

    public String getShadowParagraphText() {
        WebElement element = getShadowRootElement(hostSelector, innerSelector);
        return element.getText();
    }
}
