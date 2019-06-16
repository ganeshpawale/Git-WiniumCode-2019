package MyPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotePad {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesktopOptions option =new DesktopOptions();//DesktopOtions is class
		option.setApplicationPath("C:\\Windows\\System32\\notepad.exe");//Give notepad application exe file path
		WiniumDriver driver =new WiniumDriver(new URL("http://localhost:9999"),option);
		Thread.sleep(5000);
		driver.findElement(By.id("15")).sendKeys("my name is Jai Ganesh");//Find textbox for put value
		

	}

}
