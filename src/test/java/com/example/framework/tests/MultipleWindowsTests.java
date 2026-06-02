package com.example.framework.tests;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.framework.pages.MultipleWindowsPage;

public class MultipleWindowsTests extends BaseTest {

    @Test
    public void verifyNewTabOpensFromMultipleWindows() {
        MultipleWindowsPage windowsPage = new MultipleWindowsPage();

        windowsPage.open();
        String originalHandle = driver.getWindowHandle();
        windowsPage.clickNewWindowLink();

        Set<String> handles = windowsPage.getWindowHandles();
        assertEquals(2, handles.size(), "A new window should be opened.");

        for (String handle : handles) {
            if (!handle.equals(originalHandle)) {
                windowsPage.switchToWindow(handle);
                break;
            }
        }

        assertEquals("New Window", windowsPage.getPageTitle(), "The new tab should show the expected page title.");
    }
}
