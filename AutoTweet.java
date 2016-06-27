package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        System.setProperty("webdriver.chrome.driver","/home/nikhil/Downloads/chromedriver");
        String Content = "";
        String line = null;
        String UName = "nikhil9860";
        String Password="0nikhil9";
        WebElement ID,Pass ,Button ,Tweet,Tbutton;
        FileReader fr = new FileReader("Tweet.txt") ;
        BufferedReader br = new BufferedReader(fr);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twitter.com/login");
        ID = driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input"));
        ID.sendKeys(UName);
        Pass =driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input"));
        Pass.sendKeys(Password);
        Button = driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/div[2]/button"));
        Button.click();
        Thread.sleep(3000);



        while ((line=br.readLine())!=null){

            Content = Content+line+"\n";


        }


        while (true){

            Tweet = driver.findElement(By.xpath(".//*[@id='tweet-box-home-timeline']"));
            Tweet.sendKeys(Content+"12");
            Thread.sleep(3000);

            Tbutton=driver.findElement(By.xpath(".//*[@id='timeline']/div[2]/div/form/div[2]/div[2]/button"));
            Tbutton.click();
            Thread.sleep(3000);


        }




//        driver.close();
//        driver.quit();
    }
}
