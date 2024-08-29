package registerfunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCRF001 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        
        WebElement myAccountdropMenu = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]"));
        myAccountdropMenu.click();
        
        WebElement registerOption =driver.findElement(By.linkText("Register"));
        registerOption.click();
        
        WebElement firstName =  driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.sendKeys("Adnan");
        
        WebElement lastName =   driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.sendKeys("Joy");
        
        WebElement Email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        Email.sendKeys("adnanjoybi760@gmsil.com");
        
        WebElement telePhone=driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
        telePhone.sendKeys("01752243984");
        
        WebElement Password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        Password.sendKeys("cse06307482");
        
        WebElement ConfirmPassword=driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        ConfirmPassword.sendKeys("cse06307482");
        
       WebElement privacyPolicyfield= driver.findElement(By.name("agree"));
       privacyPolicyfield.click();
       
       WebElement ContinueButton=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
       ContinueButton.click();
       
       //Checking Weather the User has Successfully login or not
       myAccountdropMenu.click();
       
      WebElement LogoutOption = driver.findElement(By.linkText("Logout"));
      if(LogoutOption.isDisplayed()) {
    	  
        System.out.println("login Successfully");
    	  
    	String actualURl=  driver.getCurrentUrl();
    	String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/success";
    	 
    	if(actualURl.equals(expectedURL)){	 
    		 System.out.println("User is taken to Account Success page");
    		 
    		 String expectedHeding ="your Account has been Created";
    		WebElement headingElement= driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
    		
    	 String actualHeading=headingElement.getText(); 
    	 
    	 if(actualHeading.equals(expectedHeding)) {
    		 
    		 System.out.println("Proper page Heading is displayed");
    	 }else {
    		 System.out.println("Proprer Heading is not displayed.Hence Failed");
    	 }
    	WebElement actualCongratulationsElement= driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]"));
    	 String  actualCongratulationsText =actualCongratulationsElement.getText(); 
    	String expectedCongratulationsText ="";
    	 }
    		
    	 }else {
    		 
    		 System.out.println("User is not taken to Account Succes page.Hence Failed");
    	 }
    	  
      } else {
    	  System.out.println("User has not logged in.Hence failed");
      }
       
       
        
        
	}

}
