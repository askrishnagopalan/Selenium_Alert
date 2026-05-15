package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_All_Three_PopUps {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		WebElement RESULT1=driver.findElement(By.id("result"));
		System.out.println(RESULT1.getText());
		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		Thread.sleep(2000);
		alert1.dismiss();
		WebElement RESULT2=driver.findElement(By.id("result"));
		System.out.println(RESULT2.getText());
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		alert1.accept();
		WebElement RESULT3=driver.findElement(By.id("result"));
		System.out.println(RESULT3.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		alert1.dismiss();
		WebElement RESULT4=driver.findElement(By.id("result"));
		System.out.println(RESULT4.getText());
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		alert1.sendKeys("Selenium");
		Thread.sleep(2000);
		alert1.accept();
		WebElement RESULT5=driver.findElement(By.id("result"));
		System.out.println(RESULT5.getText());
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		alert1.sendKeys("");
		Thread.sleep(2000);
		alert1.dismiss();
		WebElement RESULT6=driver.findElement(By.id("result"));
		System.out.println(RESULT6.getText());
	}
}
