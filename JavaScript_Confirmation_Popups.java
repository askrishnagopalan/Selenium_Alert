package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Confirmation_Popups {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement RESULT=driver.findElement(By.id("result"));
		System.out.println(RESULT.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement RESULT1=driver.findElement(By.id("result"));
		System.out.println(RESULT1.getText());
	}

}
