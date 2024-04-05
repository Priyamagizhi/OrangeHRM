package org.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.pom.LoginPage;
import org.utilityclass.BaseClass;

import io.cucumber.java.en.*;

public class ClaimRequest extends BaseClass{
	LoginPage l=new LoginPage();
	

	@When("The user has to be in the claim module and able to click the Assign claim")
	public void the_user_has_to_be_in_the_claim_module_and_able_to_click_the_Assign_claim() throws InterruptedException {
		Thread.sleep(3000);
		click(l.getClaim());
		click(l.getAssignclaim());
	}

	@Then("The user has to fill the employee name , event and currency and click the create button")
	public void the_user_has_to_fill_the_employee_name_event_and_currency_and_click_the_create_button() throws InterruptedException, AWTException {
	   Thread.sleep(3000);
 click(l.getSubmitclaim());
	    click(l.getEventnameclick());
	    click(l.getEventname());
	    click(l.getCurrencyclick());
	    click(l.getCurrency());
	    click(l.getCreate());
	    
	}

	@Then("The user has to add their expenses type and amount {string}  and click submit")
	public void the_user_has_to_add_their_expenses_type_and_amount_and_click_submit(String string) {
	   click(l.getSubmit());
	}


	

}
