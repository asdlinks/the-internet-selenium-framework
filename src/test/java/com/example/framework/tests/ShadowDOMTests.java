package com.example.framework.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import com.example.framework.pages.ShadowDOMPage;

public class ShadowDOMTests extends BaseTest {

    @Test
    public void verifyShadowDomIsHandledCorrectly() {
        ShadowDOMPage shadowDOMPage = new ShadowDOMPage();

        shadowDOMPage.open();
        String text = shadowDOMPage.getShadowParagraphText();
        assertNotNull(text, "Shadow DOM text should be accessible.");
        assertFalse(text.isBlank(), "Shadow DOM text should not be blank.");
    }
}
