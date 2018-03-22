package MyPack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkBroken {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver", "C:/Users/yogesha/Desktop/Reports/NewExp/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
List<WebElement>total_Links=driver.findElements(By.tagName("a"));
total_Links.addAll(driver.findElements(By.tagName("img")));
System.out.println(total_Links.size());

List<WebElement>Activelinks=new ArrayList<WebElement>();

for(int i=0;i<total_Links.size();i++){
if((total_Links.get(i).getAttribute("href"))!=null){
	Activelinks.add(total_Links.get(i));
	
}
}

System.out.println(Activelinks.size());
for(int j=0;j<Activelinks.size();j++){
HttpURLConnection connec=(HttpURLConnection) new URL(Activelinks.get(j).getAttribute("href")).openConnection();
connec.connect();
String response=connec.getResponseMessage();
System.out.println(Activelinks.get(j).getAttribute("href")+"Response Code is"+response);
connec.disconnect();

}


		
		

		
		
		
		
		
		
		
	}
	

	
}


