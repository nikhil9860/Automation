package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

/**
 * Created by nikhil on 23/6/16.
 */
public class Whatsapp {
    public static void main(String[] args) throws Exception{

        String text= "Whatsapp Spammer _|_ ";
        System.setProperty("webdriver.chrome.driver","/home/nikhil/Downloads/chromedriver");
        //WebElement ID , Button ;
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to start  ");
        String status= sc.nextLine();

        Thread.sleep(3000);


            while (true){

                ID = driver.findElement(By.xpath(".//*[@id='main']/footer/div/div[1]/div/div[2]"));

                ID.sendKeys(text);
                ID.sendKeys(Keys.RETURN);

            }

    }
}
