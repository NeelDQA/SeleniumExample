package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement uName;
	
	@FindBy(name="password")
	private WebElement pWord;
	

	
	public void login(String user, String pass) {
		uName.sendKeys(user);
		pWord.sendKeys(pass);
		pWord.submit();
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement getpWord() {
		return pWord;
	}

	
}
