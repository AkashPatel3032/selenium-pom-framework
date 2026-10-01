package com.akash.automation.tests;

import org.testng.annotations.Test;

import com.akash.automation.base.BaseTest;

public class BrowserLaunchTest extends BaseTest {

    @Test
    public void openGoogle() {

        driver.get("https://www.google.com");

        System.out.println("Google opened successfully");
    }
}