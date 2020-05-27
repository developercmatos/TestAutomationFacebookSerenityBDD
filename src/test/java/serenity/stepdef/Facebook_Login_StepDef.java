package serenity.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import serenity.pages.Details_About_You_Page;
import serenity.pages.FeedPage;
import serenity.pages.LoginPage;
import serenity.pages.ProfilePage;

import static org.junit.Assert.assertEquals;

public class Facebook_Login_StepDef {

    FeedPage feedPage;
    LoginPage loginPage;
    Details_About_You_Page contact_basic_information_page;
    ProfilePage profilePage;

    @When("^I verify my session \"([^\"]*)\"$")
    public void i_verify_my_session(String arg1) {
        String session = feedPage.validateTheNameSession();
        assertEquals(arg1,session);
        System.out.println("The expected name is: " + arg1);
        System.out.println("The name is: " + session);

    }

    @Given("^I navigate to facebook login page$")
    public void i_navigate_to_facebook_login_page() {
        loginPage.navigateToLoginPage();
    }


    @When("^I do login using valid credentials login \"([^\"]*)\",\"([^\"]*)\"$")
    public void i_do_login_using_valid_credentials_login(String arg1, String arg2) {
        loginPage.addLoginInformation(arg1,arg2);
    }

    @When("^Click on the login button$")
    public void click_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("^I must be able to view my session name in feed page \"([^\"]*)\"$")
    public void i_must_be_able_to_view_my_session_name_in_feed_page(String arg1) {
        String name_session = feedPage.validateTheNameSession();
        assertEquals(arg1,name_session);

        System.out.println("The expected messagem is:" + arg1);
        System.out.println("The message is:" + name_session);

        loginPage.closeBrowser();
    }



}
