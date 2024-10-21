package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class LoginPage {
	
	@FindBy(id="username")
	WebElement UserName ;
	
	@FindBy (id="password")
	WebElement Password ;
	
	@FindBy (id="submit")
	WebElement BntSubmit ;
	
@FindBy (xpath="/html/body/div/div/section/div/div/article/div[1]/h1")
WebElement VerifLogin;

public LoginPage () {
	PageFactory.initElements(Config.driver, this);
}

public void connect (String username, String password) {
	
	UserName.sendKeys(username);
	
	Password.sendKeys(password);
	
	BntSubmit.click();
}
	
	public String verifMessageLogin() {
		
		String actualtext = VerifLogin.getText();
		
		return actualtext ;
	
}

}
