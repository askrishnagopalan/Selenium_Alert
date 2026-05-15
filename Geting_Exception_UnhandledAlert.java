package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geting_Exception_UnhandledAlert {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
}
}
