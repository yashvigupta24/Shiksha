package StepDefinition;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import Page.Courses;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompareCourses {
	static WebDriver driver;
	Courses cs;
	
	@Given("user is logged in to the Shiksha application")
	public void user_is_logged_in_to_the_shiksha_application() throws InterruptedException, AWTException {
		driver = SetupDriver.chromedriver();
		   cs = new Courses(driver);
		   cs.background();
	}

	@When("User clicks on Shiksha online")
	public void user_clicks_on_shiksha_online() throws InterruptedException {
	   cs.Course();
	}

	@And("Click on the search bar")
	public void click_on_the_search_bar() throws InterruptedException {
	   cs.searchBar();
	}

	@And("^Enter the name of the (.*)")
	public void enter_the_name_of_the(String course) throws InterruptedException {
	    cs.input(course);
	}
	



	@And("Clicks on Search button")
	public void clicks_on_search_button() throws InterruptedException, AWTException {
	    cs.click();
	}

	@And("Select courses to compare")
	public void select_courses_to_compare() throws InterruptedException {
	   cs.compare();
	}

	@And("Clicks on compare courses button")
	public void clicks_on_compare_courses_button() throws InterruptedException {
	    cs.compareButton();
	}

	@And("Clicks on Compare Now button")
	public void clicks_on_comapre_now_button() throws InterruptedException {
	    cs.compareNow();
	}

	@Then("Comparison between Selected Courses are displayed")
	public void comparison_between_selected_courses_are_displayed() {
	   Assert.assertEquals("https://www.shiksha.com/online-courses/course-comparison/googl7-micrl159", driver.getCurrentUrl());
	   
	}
//	********************************************************************************************************************
	
//	Scenario-2
	
	@When("User clicks on profile icon")
	public void user_clicks_on_profile_icon() throws InterruptedException {
		cs.icon();
	}

	@And("click on profile")
	public void click_on_profile() throws InterruptedException {
		cs.profile();
	}

	@And("ScrollLeft for add budget button")
	public void scroll_left_for_add_budget_button() throws InterruptedException {
		 cs.scrollleft();
	}

	@And("Enter details")
	public void enter_details(DataTable dataTable) throws InterruptedException, AWTException {
		List<Map<String,String>> admissionYear = dataTable.asMaps(String.class, String.class);     
		String year1 = admissionYear.get(0).get("year");
		String city1 = admissionYear.get(0).get("city");
		
		cs.selectYear(year1);
		cs.selectCity(city1);
		
		cs.selectBudget();
	}

	@And("clicks on save button")
	public void clicks_on_save_button() throws InterruptedException {
		 cs.finalrecord();
	}

	@Then("Record sucessfully added message is displayed")
	public void record_sucessfully_added_message_is_displayed() {
		Assert.assertEquals("https://www.shiksha.com/userprofile/edit", driver.getCurrentUrl());
	}

	


//	****************************************************************************************************
//	Scenario-3


	@When("User clicks on icon")
	public void user_clicks_on_icon() throws InterruptedException {
	   cs.icon();
	}

	@And("click on profile icon")
	public void click_on_profile_icon() throws InterruptedException {
	   cs.profile();
	}
	
	
	@And("click on three dots")
	public void click_on_three_dots() throws InterruptedException {
	   cs.clickOnDots();
	}

	@And("click on edit personal details")
	public void click_on_edit_personal_details() throws InterruptedException {
	   cs.editProfileDetails();
	}

	@And("^Enter (.*) and (.*)$")
	public void enter_and(String name, String achievements) throws InterruptedException {
	   cs.editDetails(name, achievements);
	}
	
	@Then("clicks on save option")
	public void clicks_on_save_option() throws InterruptedException {
	   cs.finalrecord();
	   Assert.assertEquals("https://www.shiksha.com/userprofile/edit", driver.getCurrentUrl());
	}
	
	
// ************************************** SCENARIO-4 ******************************************************************	
	
	
	
	
	@When("User clicks on Study Abroad Home")
	public void user_clicks_on_study_abroad_home() throws InterruptedException {
	    cs.home();
	}
	@And("click on Search button")
	public void click_on_search_button() throws InterruptedException {
		cs.SearchClg();
	}
	
	@Then("click on selected course")
	public void click_on_selected_course() {
	   cs.ClickOnCollege();
	   Assert.assertEquals("https://www.shiksha.com/studyabroad/usa/universities/university-of-north-texas", driver.getCurrentUrl());
	}
	
	// ************************************** SCENARIO-5 ******************************************************************	
	
	

	
	@When("Scroll down to All Location")
	public void scroll_down_to_all_location() throws InterruptedException {
		cs.scrollDown();
	}

	@Then("Click on All Location")
	public void click_on_all_location() throws InterruptedException {
	  cs.ClickOnLocation();
	  String msg=cs.assertMethod();
	  Assert.assertTrue(msg.contains("Bombay"));
	}

	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}

}
