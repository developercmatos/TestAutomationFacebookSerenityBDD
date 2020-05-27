package serenity.pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

    private static final String INPUT_USERNAME = "//*[@id=\"email\"]";
    private static final String INPUT_PASSWORD = "//*[@id=\"pass\"]";
    private static final String LOGIN_BUTTON = "//label[@id='loginbutton']";


    /**
     * Navigating to login page
     * @return
     */
    public LoginPage navigateToLoginPage(){

        open();
        waitForTextToAppear("Sign Up");

        return this;
    }

    /**
     * Adding login information
     * @param username
     * @param password
     * @return
     */
    public LoginPage addLoginInformation(String username, String password) {

        waitFor(INPUT_USERNAME).$(INPUT_USERNAME).type(username);
        waitFor(INPUT_PASSWORD).$(INPUT_PASSWORD).type(password);

        return this.switchToPage(LoginPage.class);
    }

    /**
     * click on login button
     * @return
     */
    public FeedPage clickLoginButton(){

        waitFor(LOGIN_BUTTON).$(LOGIN_BUTTON).click();

        return this.switchToPage(FeedPage.class);
    }

    public LoginPage closeBrowser(){

        getDriver().quit();
        return this;

    }


}
