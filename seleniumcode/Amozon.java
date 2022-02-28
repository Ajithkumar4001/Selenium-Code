package seleniumcode;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("//*[@id=\"nav-link-accountList\"]/span/span");
	}

}
