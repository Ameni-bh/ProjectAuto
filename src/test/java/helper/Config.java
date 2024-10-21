package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
	public static WebDriver driver ;
	
	public static void confEdge () {
		
		System.setProperty("webdriver.edge.driver", "c:/msedgedriver.exe");
		
	}
public static void maximaze () {
	
	driver.manage().window().maximize();
}
public static void attente (int s) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
}
}
