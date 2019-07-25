package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {


	private WebDriver driver; 
	public HomePagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement logInBtn; 

	@FindBy(xpath="//input[@type='text']")
	private WebElement userName; 

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//li[@id='wp-admin-bar-site-name']")
	private WebElement homePageBtn;

	@FindBy(xpath="//input[@class='button border margin-top-10']")
	private WebElement signInBtn;

	@FindBy(xpath="//ul[@class='menu']")
	private WebElement userMenuBtn; 

	@FindBy(xpath="//i[@class='sl sl-icon-user']")
	private WebElement myProfileBtn; 

	@FindBy(xpath="//input[@name='agent_title']")
	private WebElement agentTitle; 

	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone; 

	@FindBy(xpath="//button[@value='Submit']")
	private WebElement saveChange;

	@FindBy(xpath="//i[@class='sl sl-icon-lock']")
	private WebElement changePasswordBtn;

	@FindBy(xpath="//input[@name='current_pass']")
	private WebElement currentPassword;

	@FindBy(xpath="//label[@for='pass1']")
	private WebElement newPassword;

	@FindBy(xpath="//label[@for='pass2']")
	private WebElement confirmNewPassword;
	
	@FindBy(xpath="//i[@class='sl sl-icon-power']")
	private WebElement logOutBtn; 
	
	@FindBy(xpath="//ul[@id='responsive']//a[contains(text(),'New Launch')]")
	private WebElement newLaunchBtn;
	
	@FindBy(xpath="//ul[@id='responsive']//a[text()='Nullam hendrerit Apartments']")
	private WebElement nullamHendreritApartmentsImg;
	
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement yourNameEdt;
	
	
	@FindBy(xpath="//input[@name='your-email']")
	private WebElement yourEmailEdt;
	
	@FindBy(xpath="//input[@name='your-subject']")
	private WebElement yourSubjectEdt;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	private WebElement yourMsgEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//li[@id='menu-users']")
	private WebElement usersBtn;
	
	@FindBy(xpath="//li[@id='menu-users']")
	private WebElement menuUsers;
	
	@FindBy(xpath="//label[@for='user_login']")
	private WebElement userLogin;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	
	
	
	public void clickloginBtn() {
		this.logInBtn.click(); 
	}

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);

	}

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	public void clicksignInBtn() {
		this.signInBtn.click(); 

	}

	public void clickhomePageBtn() {
		this.homePageBtn.click(); 

	}

	public void clickuserMenuBtn() {
		this.userMenuBtn.click(); 
	}

	public void clickmyProfileBtn() {
		this.myProfileBtn.click(); 
	}

	public void sendAgentTitle(String agentTitle) {
		this.userName.clear();
		this.userName.sendKeys(agentTitle);

	}

	public void sendphone(String phone) {
		this.userName.clear();
		this.userName.sendKeys(phone);

	}

	public void clicksaveChangeBtn() {
		this.saveChange.click(); 

	}

	public void clickchangePasswordBtn() {
		this.changePasswordBtn.click();

	}	

	public void sendcurrentPassword(String currentPassword ) {
		this.currentPassword.clear();
		this.currentPassword.sendKeys(currentPassword);
	}
	public void sendnewPassword(String newPassword ) {
		this.newPassword.clear();
		this.newPassword.sendKeys(newPassword);
	}
	public void sendconfirmNewPassword(String confirmNewPassword ) {
		this.confirmNewPassword.clear();
		this.confirmNewPassword.sendKeys(confirmNewPassword);
	}
	public void clicklogOutBtn() {
		this.logOutBtn.click();

	}
	
	public void clicknewLaunchBtn() {
		this.newLaunchBtn.click();
	}

	public void clicknullamHendreritApartmentsImg() {
		this.nullamHendreritApartmentsImg.click(); 
	}
	
	public void sendyourName(String name) {
		this.yourNameEdt.clear(); 
		this.yourNameEdt.sendKeys(name); 
	}
	
	public void sendyourEmail(String email) {
		this.yourEmailEdt.clear(); 
		this.yourEmailEdt.sendKeys(email); 
	}
	
	public void sendyourSubject(String subject) {
		this.yourSubjectEdt.clear(); 
		this.yourSubjectEdt.sendKeys(subject); 
	}
	
	public void sendyourMessage(String message) {
		this.yourMsgEdt.clear(); 
		this.yourMsgEdt.sendKeys(message);
	}
	public void clickSubmit() {
		this.Submit.click();
	}
	public void clickusersBtn() {
		this.usersBtn.click();
	}
	
	public void clickmenuUsers() {
		this.menuUsers.click();
}
	
	public void senduserLogin(String name) {
		this.userLogin.clear(); 
		this.userLogin.sendKeys(name);	
}
	public void sendemail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email);		
}
	

}




