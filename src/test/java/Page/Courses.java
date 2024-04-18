package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Courses {
	
	WebDriver driver;
	
	public Courses(WebDriver driver) {
    	this.driver=driver;
     PageFactory.initElements(driver, this);
    }
	public void ExplicitWait(WebElement webElement,int time){
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
	 }
	
	@FindBy(xpath="//a[text()=\"Login\"]") 
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"Email address\"]") 
	WebElement email;
	
    @FindBy(xpath="//input[@class=\"input password\"]") 
    WebElement password;
    
    @FindBy(xpath="//button[text()=\"Login\"]") 
    WebElement submit;
    
    @FindBy(xpath="//a[@title=\"Free Online courses\"]") 
    WebElement coursesElement;
    
    @FindBy(xpath="//input[@placeholder=\"Search courses based on skills and careers\"]") 
    WebElement searchBar;
    
    @FindBy(xpath="//input[@id=\"gnb-search-bar\"]") 
    WebElement clickOnSearch;
    
    @FindBy(xpath="(//span[@class=\"courselist-compare\"])[9]") 
    WebElement addToCompare;
    
    @FindBy(xpath="(//div[@class=\"courselist-card-ctas\"]//span[2])[2]") 
    WebElement addToCompare1;
    
    @FindBy(xpath="//span[@class=\"compare-courses-text\"]") 
    WebElement compareButton;
    
    @FindBy(xpath="//span[@class=\"button-container compare-now-button\"]") 
    WebElement compareNow;
    
    
    public void background() throws InterruptedException, AWTException {
    	ExplicitWait(login,3);
    	login.click();
//		ExplicitWait(login,3);
//		Thread.sleep(2000);
    	ExplicitWait(email,3);
		email.sendKeys("0001yashvigupta@gmail.com");
		Robot robot = new Robot();
		int xCoordinate = 500;
        int yCoordinate = 500;
        robot.mouseMove(xCoordinate, yCoordinate);
//        Thread.sleep(2000);  
        ExplicitWait(password,3);
		password.sendKeys("Yashvi@24");
		 ExplicitWait(submit,3);
		
		submit.click();
}
    
    
    public void Course() throws InterruptedException
	{
//		Thread.sleep(3000);
		 ExplicitWait(coursesElement,3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",coursesElement);
		coursesElement.click();

	}
	public void searchBar() throws InterruptedException
	{
		 ExplicitWait(searchBar,3);
		searchBar.click();
//		Thread.sleep(1000);
		
	}
	public void input(String Course) throws InterruptedException
	{
//		Thread.sleep(2000);
		 ExplicitWait(searchBar,3);
		searchBar.sendKeys(Course);
		
	}
	public void click() throws InterruptedException, AWTException
	{
		 ExplicitWait(clickOnSearch,3);
//	Thread.sleep(1000);
	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	clickOnSearch.click();
		
	}
	public void compare() throws InterruptedException
	{
//		Thread.sleep(2000);
		 ExplicitWait(addToCompare,3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    Thread.sleep(1000);
	    js.executeScript("arguments[0].scrollIntoView(true);", addToCompare);
	    js.executeScript("arguments[0].click();", addToCompare);
	    ExplicitWait(addToCompare1,3);
	    js.executeScript("arguments[0].click();", addToCompare1);
		Thread.sleep(1000);
	}
	public void compareButton() throws InterruptedException
	{
		ExplicitWait(compareButton,3);
		compareButton.click();
//		Thread.sleep(1000);	
		}
	public void compareNow() throws InterruptedException
	{
		ExplicitWait(compareNow,3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", compareNow);

		String mainWindowHandle = driver.getWindowHandle();
	    for (String windowHandle : driver.getWindowHandles()) 
	    {
	        if (!windowHandle.equals(mainWindowHandle)) 
	        {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
		
//		Thread.sleep(1000);
	}

	
//	***************************************** SCENARIO-2 *********************************************************
	
	
    @FindBy(xpath="//div[@class=\"n-lognSgnBx gnbY21ProfileBox\"]/div[2]/strong") 
    WebElement Profileicon;
    
    @FindBy(xpath="//a[@class=\"rpY21MLink ripple dark\"]") 
    WebElement menuProfile;
    
    @FindBy(xpath="//div[@class=\"_17b2 \"]/child::div[5]/child::button[1]") 
    WebElement scleft;
    
    @FindBy(xpath="(//div[@class=\"text-field\"])[1]") 
    WebElement scroll;
    
    @FindBy(xpath="//div[@class=\"search-TextField \"]/child::input[@placeholder=\"Search\"][1]") 
    WebElement searchYear;
    
    @FindBy(xpath="//div[@class=\"e251\"]/child::ul[@class=\"_69be\"]/child::li[1]") 
    WebElement textYear;
    
    @FindBy(xpath="//div[@class=\"paper-card section-form__section-card\"]/child::div[@class=\"_0e47 _2225\"][2]") 
    WebElement searchCity;
    
    @FindBy(xpath="//div[@class=\"search-TextField \"]/input") 
    WebElement clickOnCity;
    
    @FindBy(xpath="//ul[@class=\"_69be _0bd8\"]/child::li[1]/child::span[1]") 
    WebElement textCity;
    
    @FindBy(xpath="//div[@class=\"_7010\"]/child::button[@class=\"custom-button custom-button--primary\"]") 
    WebElement save;

    @FindBy(xpath="//div[@class=\"paper-card section-form__section-card\"]/child::div[@class=\"_0e47 _2225\"][3]") 
    WebElement clickOnBudget;
    
    @FindBy(xpath="//div[@class=\"e251\"]/ul/li[2]/span") 
    WebElement budget;
    
    @FindBy(xpath="//div[@class=\"_202e\"]//child::button[2]") 
    WebElement finalSave;
    
   

    public void icon() throws InterruptedException
	{
		Thread.sleep(1000);
//    	ExplicitWait(Profileicon,3);
		Profileicon.click();
		Thread.sleep(1000);
	}
	public void profile() throws InterruptedException
	{
//		ExplicitWait(menuProfile,3);
		Thread.sleep(1000);
		menuProfile.click();
		Thread.sleep(1000);
	}
	public void scrollleft() throws InterruptedException
	{
//		ExplicitWait(scleft,3);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", scleft);
		scleft.click();
		Thread.sleep(1000);
//		ExplicitWait(scroll,3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",scroll);
		scroll.click();
		
	}
	public void selectYear(String year) throws InterruptedException, AWTException {
		
//		ExplicitWait(searchYear,3);
		searchYear.click();
//		year through data table
		Thread.sleep(1000);
//		ExplicitWait(searchYear,3);
		searchYear.sendKeys(year);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
//		ExplicitWait(textYear,3);
		textYear.click();
		
	}
	public void selectCity(String city2) throws InterruptedException, AWTException
	{
//		ExplicitWait(searchCity,3);
		searchCity.click();
		Thread.sleep(1000);
//		ExplicitWait(clickOnCity,3);
		clickOnCity.click();
		clickOnCity.sendKeys(city2);
		Thread.sleep(1000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
//		ExplicitWait(textCity,3);
		textCity.click();
//		ExplicitWait(save,3);
		save.click();
	}
	public void selectBudget() throws InterruptedException
	{
//		ExplicitWait(clickOnBudget,3);
		clickOnBudget.click();
//		ExplicitWait(budget,3);
		Thread.sleep(1000);
		budget.click();
		Thread.sleep(1000);
	}
	public void finalrecord() throws InterruptedException
	{
		Thread.sleep(1000);
//		ExplicitWait(finalSave,3);
		finalSave.click();
		
	}

	
//	***************************************** SCENARIO-3 *********************************************************
	
	
    @FindBy(xpath="//div[@class=\"menu-button__top-wrapper\"]/child::div[@class=\"menu-button__wrapper\"]") 
    WebElement dots;

    @FindBy(xpath="(//div[@class=\"personal-info__menu-wrapper\"])/div[1]") 
    WebElement editButton;

    @FindBy(xpath="//div[@class=\"f5fe\"]/div[2]/div[1]/input") 
    WebElement editName;

    @FindBy(xpath="//div[@class=\"f5fe\"]/div[8]/textarea") 
    WebElement editAchievements;

    
	public void clickOnDots() throws InterruptedException
	{
//		Thread.sleep(1000);
		ExplicitWait(dots,3);
		dots.click();
	}
	public void editProfileDetails() throws InterruptedException
	{
//		Thread.sleep(1000);
		ExplicitWait(editButton,3);
		editButton.click();
	}
	public void editDetails(String name,String achievements) throws InterruptedException
	{
//		Thread.sleep(1000);
		ExplicitWait(editName,3);
		editName.click();
		ExplicitWait(editName,3);
//		Thread.sleep(1000);
		editName.sendKeys(name);
//		Thread.sleep(1000);
		ExplicitWait(editAchievements,3);
		editAchievements.click();
//		Thread.sleep(1000);
		ExplicitWait(editAchievements,3);
		editAchievements.sendKeys(achievements);
//		Thread.sleep(1000);
	}
	
	
	
//	***************************************** SCENARIO-4 *********************************************************
	
    @FindBy(xpath="//ul[@class=\"fotr_seo\"]/li[8]/div/ul[@class=\"foot3LinkList\"]/li/a[@title=\"Study Abroad Home\"]") 
    WebElement clickOnHome;
    
    @FindBy(xpath="//div[@class=\"_4b09 _8e95 _5750\"]/div[1]/input[@class=\"_2e7d\"]") 
    WebElement searchCollege;
    
    @FindBy(xpath="//div[@class=\"spaceUp\"]/ul[1]/li[1]/p[1]") 
    WebElement clickOnclg;
    

    public void home() throws InterruptedException
	{
    	ExplicitWait(clickOnHome,3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clickOnHome);
//		clickOnHome.click();
		
	}
	
	public void SearchClg() throws InterruptedException
	{
		ExplicitWait(searchCollege,3);
		searchCollege.click();
		Thread.sleep(1000);
	}
	public void ClickOnCollege()
	{
		ExplicitWait(clickOnclg,3);
		clickOnclg.click();
	}
	
	
//	***************************************** SCENARIO-5 *********************************************************

	
    @FindBy(xpath="//div[@class=\"trendingTagsWdgt\"]/div[1]/span[1]") 
    WebElement scrollForLocation;
    
    @FindBy(xpath="//div[@class=\"filterDropdown dropDBox\"]/span[1]")  
    WebElement allLocation; 
    
    @FindBy(xpath="//div[@class=\"filterBox hide\"]/child::ul")
    WebElement dropdown1;
    
    
    
    public void scrollDown() throws InterruptedException
	{
		Thread.sleep(1000);
//		ExplicitWait(clickOnclg,3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5000)");
		
	}
	public void ClickOnLocation() throws InterruptedException
	{
//		Thread.sleep(1000);
		ExplicitWait(allLocation,3);
		allLocation.click();
		
//		  return allLocation.getAttribute("id").contains("location");
	}
	public String assertMethod()
	{
		return dropdown1.getText();
	}
	
}




	
	

	
	
