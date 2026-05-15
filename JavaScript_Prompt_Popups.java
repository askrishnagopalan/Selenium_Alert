package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Prompt_Popups {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Selenium");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		WebElement RESULT=driver.findElement(By.id("result"));
		System.out.println(RESULT.getText());
	}

}
