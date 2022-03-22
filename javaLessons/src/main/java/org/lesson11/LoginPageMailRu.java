package org.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageMailRu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ru/");

        //Click Login button(Textfield)
        WebElement element2 = driver.findElement(By.xpath("//button[text()=\"Войти\"]"));
        element2.click();

        //Get the Web Element corresponding to the field Email (Textfield)
        WebElement element1 = driver.findElement(By.xpath("//iframe[@class=\"ag-popup__frame__layout__iframe\"]"));
        driver.switchTo().frame(element1);
        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        emailField.click();
        emailField.sendKeys("testuser_q");

        Thread.sleep(3000);

        WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
        element3.click();

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.click();
        password.sendKeys("12345678igna");
        Thread.sleep(3000);

        WebElement element4 = driver.findElement(By.xpath("//button[@data-test-id='submit-button']"));
        element4.click();

        Thread.sleep(10000);

        WebElement element5 = driver.findElement(By.xpath("//a[@class='compose-button compose-button_white compose-button_short js-shortcut']"));
        element5.click();

        Thread.sleep(3000);

        WebElement element6 = driver.findElement(By.xpath("//input[@class='container--H9L5q size_s--3_M-_']"));
        element6.click();
        element6.sendKeys("testuser_q@mail.ru");

        Thread.sleep(3000);

        WebElement element7 = driver.findElement(By.xpath("//input[@name='Subject']"));
        element7.click();
        element7.sendKeys("Тест Сообщение");

        Thread.sleep(3000);

        WebElement element9 = driver.findElement(By.xpath("//div[contains(@class, 'cke_editable')]/div"));
        element9.click();
        element9.sendKeys("Добрый день это, тестовое сообщение");

        WebElement element10 = driver.findElement(By.xpath("//span[@class='button2__txt']"));
        element10.click();

    }
}

