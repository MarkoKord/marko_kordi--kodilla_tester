package com.kodilla.selenium.allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");


        WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat-td\"]/div/select"));
        Select type = new Select(category);
        type = new Select(category);
        type.selectByIndex(6);


        WebElement itemName = driver.findElement(By.xpath("//*[@id=\"gh-ac-box\"]/div/input"));
        itemName.sendKeys("mini mavic");

        Thread.sleep(2000);
      WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
      clickButton.click();



    }
}
