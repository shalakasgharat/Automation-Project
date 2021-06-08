package Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class JPetStore 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\SeleniumJar\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://petstore.octoperf.com/actions/Catalog.action");     //open website
		//-----------------------------------------------------------------------------------------------
		Thread.sleep(3000);
		w.manage().window().maximize();   //maximize the window
		
		//Sign in
		
		
		w.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		/*
		
		//Register Now                                                 
		w.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).sendKeys("DEMO12");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys("demo1234");
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("Shalaka");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("Gharat");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("shalaka@gmail.com");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("8422996606");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("At: Pirkon");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("Post: Aware");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys("Uran");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys("Maharashtra");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys("410206");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys("India");
		
		Select s=new Select(w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select")));
		s.selectByVisibleText("english");
		Select s1=new Select(w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")));
		s1.selectByVisibleText("BIRDS");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		System.out.println("registration done");
		//-----------------------------------------------------------------------------------------------
		 
		 */
		
		//Sign in
	
		w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]")).sendKeys("DEMO12");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys("demo1234");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		System.out.println("Login successful");
		
		//-----------------------------------------------------------------------------------------------
		
		//Sign out
		//w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		
		//-----------------------------------------------------------------------------------------------
		
		w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();   	//My account
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();  //save account information
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();   //My Orders
		w.navigate().back();
		
		//Sign out
		w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		//-----------------------------------------------------------------------------------------------
		
		//Search 
		w.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[1]")).sendKeys("Parrot");  //search text box
		w.findElement(By.xpath("//*[@id=\"SearchContent\"]/form/input[2]")).click();   //search button
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click(); 
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click(); //item ID
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")).click();  // add to cart
		w.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();  //proceed to checkout
		//Login
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]")).sendKeys("DEMO12");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).clear();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/p[2]/input[2]")).sendKeys("demo1234");
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		
		w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]/img")).click();  //cart img
		w.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).click();  //proceed to checkout
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();  //Continue
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();   //Confirm
		
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0, 145)"); 
		//Take Screenshot of Payment Receipt
		TakesScreenshot t =(TakesScreenshot) w;
		File src=t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\HP\\Desktop\\New folder\\Pd1.png"));
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //return to main menu
		//-----------------------------------------------------------------------------------------------
		
		// ?
		w.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[4]")).click();
		//JavascriptExecutor js=(JavascriptExecutor)w;
		
		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[1]/a")).click();   //Signing Up
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");   //vertical scroll up
		
		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[2]/a")).click();    //Signing In
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		
		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[3]/a")).click();    //Working with the Product Catalog
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[4]/a")).click();    //Browsing the Catalog
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[5]/a")).click();    //Searching the Catalog
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[6]/a")).click();    //Working with the Shopping Cart
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[7]/a")).click();    //Adding and Removing Items
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[8]/a")).click();    //Updating the Quantity of an Item
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[9]/a")).click();    //Ordering Items
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); 

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[10]/a")).click();   //Reviewing an Order
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.findElement(By.xpath("//*[@id=\"Content\"]/ul/li[11]/a")).click();    //Known Issues
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		w.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");  //back 
		System.out.println("back"); 
		//-----------------------------------------------------------------------------------------------
		
		//Fish
		w.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Angelfish
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Large Angelfish
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FI-SW-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();   //Small Angelfish
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FI-SW-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();   //Return to FISH
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Tiger Shark
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Toothless Tiger Shark	
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();   //Return to FI-SW-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();   //Return to FISH
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")).click();  //Koi
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Spotted Koi	
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();     //Return to FI-FW-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Spotless Koi
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();     //Return to FI-FW-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();   //Return to FISH
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")).click();  //Goldfish
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Male Goldfish
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FI-FW-02
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Adult Female Goldfish
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FI-FW-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();   //Return to FISH
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to Main Menu
		
		//-----------------------------------------------------------------------------------------------
		
		
		//Dogs
		w.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Bulldog
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Male Adult Bulldog
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-BD-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Female Puppy Bulldog
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-BD-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Poodle
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Male Puppy Poodle	
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-PO-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")).click();  //Dalmation
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Spotless Male Puppy Dalmation
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-DL-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Spotted Adult Female Dalmation
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-DL-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")).click();  //Golden Retriever
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Female Golden Retriever
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-RT-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a")).click();  //Labrador Retriever
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Male Labrador Retriever
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-RT-02
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Adult Female Labrador Retriever
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-RT-02
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")).click();  //Adult Male Labrador Retriever
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-RT-02
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")).click();  //Adult Female Labrador Retriever
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-RT-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a")).click();  //Chihuahua
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Male Chihuahua
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-CW-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Adult Female Chihuahua
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to K9-CW-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to DOGS
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to Main Menu
		
		//-----------------------------------------------------------------------------------------------
		
		//cats
		w.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Manx
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Tailless Manx
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FL-DSH-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //With tail Manx
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FL-DSH-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to CATS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Persian
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Female Persian
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FL-DLH-02
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Adult Male Persian
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to FL-DLH-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to CATS
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to Main Menu
		//-----------------------------------------------------------------------------------------------
		
		//reptiles
		w.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Rattlesnake
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Venomless Rattlesnake	
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to RP-SN-01
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Rattleless Rattlesnake
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to RP-SN-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to REPTILES
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Iguana
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Green Adult Iguana
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click(); //Return to RP-LI-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to REPTILES
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to Main Menu
		
		//-----------------------------------------------------------------------------------------------
		
		//birds
		w.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")).click();
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Amazon Parrot
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Male Amazon Parrot
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to AV-CB-01
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to BIRDS
		
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();  //Finch
		w.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();  //Adult Male Finch
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to AV-SB-02
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to BIRDS
		w.findElement(By.xpath("//*[@id=\"BackLink\"]/a")).click();  //Return to Main Menu
		System.out.println("Automation done");
		//-----------------------------------------------------------------------------------------------
		

	}

}

