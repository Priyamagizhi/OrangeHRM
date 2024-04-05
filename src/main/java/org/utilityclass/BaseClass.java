package org.utilityclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class BaseClass {
	
	public static  WebDriver driver ;
	
	public static WebDriver browserLaunchh (String browserName ) {
		 switch(browserName) {
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver ();
				 break;
		 case "edge":
			 WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver ();
			break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver ();
                 break;
                 default:
               	  System.err.println("INVALID");}
		return driver;}
	

// url launch
public static void launchUrl (String url) {
	
driver.get(url);
driver.manage().window().maximize();}

//implicitly wait

public static void implicitWait(long sec) { ;
driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);}
	

//sendkeys
public static void sendKeys(WebElement e,String name) { 
	e.sendKeys(name);}
//click
public static void click(WebElement e) {
	e.click(); }
//quit
public static void quit() {
	driver.quit();}

//getAttribute
public static String getAttribute (WebElement e ) {
	String attribute = e.getAttribute("value");
	return attribute; }
//getText

public static String getText(WebElement e) {
	String text = e.getText();
	return text; }
//Actions
//moveToElement

public static void moveToElement(WebElement e) {
	Actions a = new Actions(driver);
	a.moveToElement(e).perform(); }

//drag And drop

public static void dragAnddrop(WebElement e,WebElement h) {
	Actions a = new Actions(driver);
	a.dragAndDrop(e,h).perform();}

// context Click (right click)

public static  void contextclick(WebElement name) {
	Actions a = new Actions(driver);
	a.contextClick(name).perform(); }

// doubleClick

public static void doubleClick(WebElement name) {
	Actions a = new Actions(driver);
    a.doubleClick(name).perform();
}

// select
//selectByIndex

public static void selectByIndex(WebElement b, int index ) {
Select s = new Select(b);	
s.selectByIndex(index);
}

// selectByVisibleText

 public static void selectByVisibleText(WebElement c,String value) { 
	 Select s = new Select(c);
	 s.selectByVisibleText(value); }
 
//selectByValue
 
 public static void selectByValue(WebElement c,String value) { 
	 Select s = new Select(c);
	 s.selectByValue(value); }
 
// to check single or multiple select dropdown
 
 public static void isMultiple(WebElement c) {
	 Select s = new Select(c);
	 s.isMultiple(); }
    
 // deselectByValue 
 public static void 
	  deSelectByValue(WebElement c,String value) { 
		 Select s = new Select(c);
		 s.deselectByValue(value); }
 
// deselectByVisibleText
 
 public static void 
  deSelectByVisibleText(WebElement c,String value) { 
	 Select s = new Select(c);
	 s.deselectByVisibleText(value); }
 
// deselectByIndex
 
 public static void deSelectByIndex(WebElement b, int index ) {
		Select s = new Select(b);	
		s.deselectByIndex(index); }
 // getOptions
 public static void getOptions(WebElement d,int index) {
	 Select s = new Select(d);
	 List<WebElement> options = s.getOptions();
	WebElement e = options.get(index);
	String text = e.getText(); }
 
 
 //TakesScreenshot
 
 public static void TakesScreenshot(String name) throws IOException {
	 TakesScreenshot tk = (TakesScreenshot)driver;
       File str = tk.getScreenshotAs(OutputType.FILE);
       File des = new File(System.getProperty("user.dir")+"//src//test//resources//"+name+".png");
       FileUtils.copyFile(str,des); }
      
      // JavascriptExecutor 
       
     public static void jsSendKeys(String value , WebElement e) {
       
      JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].setAttribute('value','"+value+"')",e);
       }
     
	
      public static void jsDown(WebElement down) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("arguments[0].scrollIntoView(true)", down);}


public static void keyDown() throws AWTException {
Robot h = new Robot();

h.keyPress(KeyEvent.VK_DOWN);
h.keyRelease(KeyEvent.VK_DOWN);
h.keyPress(KeyEvent.VK_DOWN);
h.keyRelease(KeyEvent.VK_DOWN);
h.keyPress(KeyEvent.VK_ENTER);
h.keyRelease(KeyEvent.VK_ENTER);
}

public static void generateJVMReport(String json) {
	//1.Loc
	File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
	//2.Configuration
	
	Configuration con=new Configuration(loc, "Facebook");
	con.addClassifications("BrowserName", "Chrome");
	con.addClassifications("BrowserVersion", "123");
	con.addClassifications("OS Name", "Windows");
	con.addClassifications("Enivorn", "QA");

	
	List<String> js=new ArrayList<>();
	js.add(json);
	//3.ReportBuilder
	ReportBuilder r=new ReportBuilder(js, con);
	r.generateReports();

}}



//Thread.sleep(4000);
//WebElement up = driver.findElement(By.id("email"));
//js.executeScript("arguments[0].scrollIntoView(false)",up);
//	


