package com.UtilityCamp.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseCamp {

	public static Properties campprop;
	public static WebDriver driver;
	
	public BaseCamp() {
		
		try {
			FileInputStream campfls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\ConfigCamp\\qa\\ConfigCampFile.properties");
			
			campprop = new Properties();
			campprop.load(campfls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initCampBrowser() {
		 String CampBrowserset = campprop.getProperty("Browser1");
		 if(CampBrowserset.equals("Chrome")) {
				
			 WebDriverManager.chromedriver().setup();	 
			 driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataCamp.ImplicitlyWait));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataCamp.pageLoad));
				
	}
		 else if(CampBrowserset.equals("FireFox")) {
				
			}
	}
		 public static void lunchURL(String URL) {
				driver.get(campprop.getProperty("URL"));
				
			}
	
	
}
