package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage (){
	PageFactory.initElements(driver, this);}
	
	@FindBy(name="username")
	private WebElement txtUser ;
	
	@FindBy(name="password")
	private WebElement txtPass ;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement click;
	
	@FindBy(xpath="//a[text()='Candidates']")
	private WebElement candidateClick;
	
	@FindBy(xpath="//label[text()='Job Title']/parent::div/following-sibling::div/div/div/div[1]")   //span[text()='Payroll Administrator']
	private WebElement jobTitle;
	
	@FindBy(xpath="//label[text()='Job Title']/parent::div/following-sibling::div/div/div/div/span[text()='Payroll Administrator']")
	private WebElement srchJobTitle;
	
	public WebElement getCandidateClick() {
		return candidateClick;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getClick() {
		return click;
	}
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement recruitmentClick ;


	public WebElement getRecruitmentClick() {
		return recruitmentClick;
	}

	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addClick;


	public WebElement getAddClick() {
		return addClick;
	}
	
	@FindBy(name="firstName")
	private WebElement fullName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//label[text()='Vacancy']/parent::div/following-sibling::div/div/div/div[1]")
	public WebElement vacancyclick;
	
	@FindBy(xpath="//label[text()='Vacancy']/parent::div/following-sibling::div/div/div/div/span[text()='Payroll Administrator']")
	public WebElement vacancy;
	
	@FindBy(xpath="//label[text()='Hiring Manager']/parent::div/following-sibling::div/div/div/div[1]")
	public WebElement hiringManagerclick;
	
	public WebElement getHiringManagerclick() {
		return hiringManagerclick;
	}
	public WebElement getStatusclick() {
		return statusclick;
	}

	@FindBy(xpath="//label[text()='Hiring Manager']/parent::div/following-sibling::div/div/div/div/span[text()='Ranga Akunuri']")
	public WebElement hiringManager;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div/div/div/div[1]")
	public WebElement statusclick;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div/div/div/div/span[text()='Application Initiated']")
	public WebElement status;
	
	public WebElement getSrchJobTitle() {
		return srchJobTitle;
	}
	public WebElement getVacancyclick() {
		return vacancyclick;
	}
	public WebElement getVacancyStatus() {
		return vacancyStatus;
	}

	@FindBy(xpath="(//input[@placeholder='Type here'][1])")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Contact Number']/parent::div/following-sibling::div/input")
	private WebElement contactNumber;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement scrolDown;
	
	public WebElement getScrolDown() {
		return scrolDown;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;


	public WebElement getFullName() {
		return fullName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getVacancy() {
		return vacancy;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContactNumber() {
		return contactNumber;
	}
	public WebElement getSave() {
		return save;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")
	private WebElement vacancyStatus ;
//	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement candidateName;
	
	@FindBy(xpath="//label[text()='Method of Application']/parent::div/following-sibling::div/div/div/div[1]")
	public WebElement methodclick;
	
	public WebElement getMethodclick() {
		return methodclick;
	}
	public WebElement getMethod() {
		return method;
	}

	@FindBy(xpath="//label[text()='Method of Application']/parent::div/following-sibling::div/div/div/div/span[text()='Manual']")
	public WebElement method;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;

	public WebElement getJobTitle() {
		return jobTitle;
	}
	public WebElement getSearch() {
		return search;
	}

	public WebElement getHiringManager() {
		return hiringManager;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getCandidateName() {
		return candidateName;
	}
	
	@FindBy(xpath="//span[text()='Claim']")
	private WebElement claim;

	public WebElement getClaim() {
		return claim;
	}
	
	@FindBy(xpath="//button[text()=' Assign Claim ']")
	private WebElement assignclaim;

	public WebElement getAssignclaim() {
		return assignclaim;
	}
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeename;

	public WebElement getEmployeename() {
		return employeename;
	}
	
	@FindBy(xpath="//a[text()='Submit Claim']")
	public WebElement submitclaim;
	public WebElement getSubmitclaim() {
		return submitclaim;
	}

	@FindBy(xpath="//label[text()='Event']/parent::div/following-sibling::div/div/div/div[text()='-- Select --']")
	private WebElement eventnameclick;
	
	@FindBy(xpath="//span[text()='Accommodation']")
	private WebElement eventname;

	public WebElement getEventnameclick() {
		return eventnameclick;
	}
	public WebElement getEventname() {
		return eventname;
	}
	
	@FindBy(xpath="//label[text()='Currency']/parent::div/following-sibling::div/div/div/div[text()='-- Select --']")
	private WebElement currencyclick;
	
	@FindBy(xpath="//span[text()='Indian Rupee']")
	private WebElement currency;
	
	@FindBy(xpath="//button[text()=' Create ']")
	private WebElement create;
	

	public WebElement getCurrencyclick() {
		return currencyclick;
	}
	public WebElement getCurrency() {
		return currency;
	}
	public WebElement getCreate() {
		return create;
	}
	@FindBy(xpath="//button[text()=' Submit ']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	

	
	
}
