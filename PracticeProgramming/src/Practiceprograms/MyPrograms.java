package Practiceprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.parser.ParseException;

public class MyPrograms {
	public static WebDriver driver=null;
public static void main (String[] args) throws java.text.ParseException {
	
System.setProperty("webdriver.chrome.driver", "/PracticeProgramming/drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://demoqa.com/datepicker/");
String date="12/January/2030";
String[] dateArr=date.split("/");
String day=dateArr[0];
String month=dateArr[1];
String year=dateArr[2];

WebElement webElem=driver.findElement((By.xpath("//input[@id='datepicker1']")));
boolean yflag=false;
driver.findElement(By.id("datepicker1")).click();
while(true){
String AppYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
	if (Integer.parseInt(year)>Integer.parseInt(AppYear)) {
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	} 
	else if(Integer.parseInt(year)==Integer.parseInt(AppYear))
	{
	yflag=true;
	break;		
	}
	else{
	driver.findElement(By.xpath("//span[contains(text(),'Previous')]")).click();		
	}
}
if(yflag){
while(true){
String monthName=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
int MonthNum=getMonthJavaInt(monthName);
int ReqMonthNum=getMonthJavaInt(month);
	if (MonthNum>ReqMonthNum) {
		driver.findElement(By.xpath("//span[contains(text(),'Previous')]")).click();
	} 
	else if(MonthNum==ReqMonthNum){
	SelectDay(day);
	break;
	
	}
	else {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
}
}
	//driver.quit();

}


public static int getMonthJavaInt(String monthName1) throws java.text.ParseException 
{

	Date date = new SimpleDateFormat("MMMM").parse(monthName1);
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	return cal.get(Calendar.MONTH)+1;
}

public static void SelectDay(String day){
	
	//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]
	boolean Dflag=false;
	int Weekdays=7;
	int rows=5;
	for(int i=1;i<=rows;i++){
	for(int j=1;j<=Weekdays;j++){
		String APPDay=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		if(day.equals(APPDay)){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]")).click();
		Dflag=true;
		break;
		}
	}
	if(Dflag){
		break;
	}
	}
	
	
	
	
}














}//end






























/*while(true){
String AppMonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
if (!AppMonth.equalsIgnoreCase("december")) {
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	if(AppMonth.equalsIgnoreCase(month)){
	 flag=true;	
	break;
	}
} else {
	if(AppMonth.equalsIgnoreCase(month)){
		 flag=true;	
		break;
		}
	
}	
}

if(flag){
break;
}*/




