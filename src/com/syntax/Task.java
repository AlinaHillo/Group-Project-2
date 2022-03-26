package com.syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver amazon=new ChromeDriver();
        amazon.get("https://www.amazon.com/");
        String url=amazon.getCurrentUrl();
        System.out.println(url);
        String title=amazon.getTitle();
        System.out.println(title+" "+url);
        amazon.quit();
    }
}
