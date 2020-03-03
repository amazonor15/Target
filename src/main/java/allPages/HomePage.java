package allPages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Generic {
	
	String search= "//input[@id='search']";
	String searchReseult= "//span[text()='computer']";



	public HomePage(WebDriver driver) {
		super(driver);

	}


	public void url() {
		getURL("https://www.target.com/");
	}

	public String getTitle() {
		return driver.getTitle();

	}


	public void searching() {
		typeOnElement(search, "computer");
	}


	public String searchResult() {
		return getText(searchReseult);

	}





}
