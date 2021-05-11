package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;

	
	public void addUser(String uName, String pWord) {
		username.sendKeys(uName);
		password.sendKeys(pWord);
		password.submit();
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}


	
	
	

}
