package MyPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calsi {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
      DesktopOptions option = new DesktopOptions();
      option.setApplicationPath("C:\\Windows\\System32\\calc.exe");//"C:\Windows\System32\notepad.exe"
      WiniumDriver driver =new WiniumDriver(new URL("http://localhost:9999"), option);
      Thread.sleep(5000); 
      driver.findElement(By.name("7")).click();
      driver.findElement(By.name("Add")).click();
      driver.findElement(By.name("5")).click();
      driver.findElement(By.name("Equals")).click();
      Thread.sleep(5000);
      String total = driver.findElement(By.id("150")).getAttribute("Name");
      System.out.println("Total value is :: "+ total);
	}

}