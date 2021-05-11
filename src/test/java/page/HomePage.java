package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(linkText = "3. Add a User")
	private WebElement addUserLink;
	
	@FindBy(linkText = "4. Login")
	private WebElement loginLink;

	public WebElement getAddUserLink() {
		return addUserLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	

}
