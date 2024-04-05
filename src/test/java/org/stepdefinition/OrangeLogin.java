package org.stepdefinition;



import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.pom.LoginPage;
import org.utilityclass.BaseClass;

import io.cucumber.java.en.*;

public class OrangeLogin extends BaseClass {
//	WebDriver driver;
//	LoginPage l;
	static LoginPage l;
	

@Given("The user should be in orange homepage and has to fill {string} and {string} and click the login buttons")
public void the_user_should_be_in_orange_homepage_and_has_to_fill_and_and_click_the_buttons(String user, String pass) {
   
	browserLaunchh("chrome");
	launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitWait(20);
		l= new LoginPage();
	   sendKeys(l.getTxtUser(),user);
	   sendKeys(l.getTxtPass(),pass);
	   l.getClick().click();
	
}
@When("The user click recruitment page")
	public void the_user_click_recruitment_page() {
	  l.getRecruitmentClick().click();
	}
	@When("The user click add button")
	public void the_user_click_add_button() {
	    l.getAddClick().click();
	}
	@When("The user has to fill fullname {string}")
	public void the_user_has_to_fill_fullname(String string) {
		sendKeys(l.getFullName(),string);
	}

	@When("The user has to fill lastname {string}")
	public void the_user_has_to_fill_lastname(String lst) {
		sendKeys(l.getLastName(),lst);
	}
	@When("The user has to choose the vacancy buttons")
	public void the_user_has_to_choose_the_vacancy_buttons() throws InterruptedException {
		Thread.sleep(3000);
		l.getVacancyclick().click();
		l.vacancy.click();
	}
	@When("The user has to fill email id {string}")
	public void the_user_has_to_fill_email_id(String email) {
		sendKeys(l.getEmail(),email);
	}

	@When("The user has to fill contact number {string}")
	public void the_user_has_to_fill_contact_number(String contact) throws InterruptedException {
		Thread.sleep(3000);
		sendKeys(l.getContactNumber(),contact);
	}
	@When("The user has to scrolldown")
	public void the_user_has_to_scrolldown() {
		jsDown(l.getScrolDown());
	}

	@When("The user has to click the {string} button")
	public void the_user_has_to_click_the_button(String string) throws InterruptedException {
	   Thread.sleep(3000);
	   l.getSave().click();
	   Thread.sleep(3000);
	   quit();
	   
	}
	



	}
	



	


