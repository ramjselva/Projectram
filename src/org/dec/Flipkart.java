package org.dec;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ram\\eclipse-workspace\\org.dec\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	WebElement a=d.findElement(By.xpath("//input[@id='inputValEnter']"));
	a.sendKeys("redmi",Keys.ENTER);
	Thread.sleep(5000);
	java.util.List<WebElement> f = d.findElements(By.xpath("//p[@class='product-title ']"));
 int size = f.size();
	System.out.println(size);
	for (int i = 0; i < f.size(); i++) {
		WebElement w = f.get(i);
		String text = w.getText();
		System.out.println(text);
		
	}

}
}
