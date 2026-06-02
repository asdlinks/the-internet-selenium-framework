package com.example.framework.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.framework.pages.DynamicLoadingPage;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void verifyDynamicLoadingHiddenAndRenderedElements() {
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();

        dynamicLoadingPage.open();
        dynamicLoadingPage.openExample1();
        dynamicLoadingPage.startLoading();
        assertEquals("Hello World!", dynamicLoadingPage.getFinishText(), "Hidden element should appear after loading.");

        dynamicLoadingPage.open();
        dynamicLoadingPage.openExample2();
        dynamicLoadingPage.startLoading();
        assertEquals("Hello World!", dynamicLoadingPage.getFinishText(), "Rendered element should appear after loading.");
    }
}
