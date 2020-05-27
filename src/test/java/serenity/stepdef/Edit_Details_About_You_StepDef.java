package serenity.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import serenity.pages.Details_About_You_Page;
import serenity.pages.FeedPage;
import serenity.pages.LoginPage;
import serenity.pages.ProfilePage;

import static org.junit.Assert.assertEquals;

public class Edit_Details_About_You_StepDef {

    FeedPage feedPage;
    LoginPage loginPage;
    ProfilePage profilePage;
    Details_About_You_Page details_about_you_page;


    @Given("^I navigate to facebook page$")
    public void i_navigate_to_facebook_page() {
        loginPage.navigateToLoginPage();
    }


    @When("^I do login with valid credentials login \"([^\"]*)\",\"([^\"]*)\"$")
    public void i_do_login_with_valid_credentials_login(String arg1, String arg2) {
        loginPage.addLoginInformation(arg1,arg2);
    }

    @When("^Click on the button$")
    public void click_on_the_button() {
        loginPage.clickLoginButton();
    }

    @When("^I verify my session name \"([^\"]*)\"$")
    public void i_verify_my_session_name(String arg1) {
        String session = feedPage.validateTheNameSession();
        assertEquals(arg1,session);
        System.out.println("The expected name is: " + arg1);
        System.out.println("The name is: " + session);
    }


    @When("^I navigate to details about you page$")
    public void i_navigate_to_details_about_you_page() {
        profilePage.navigateToDetailsPage();

    }

    @When("^Add details about you \"([^\"]*)\"$")
    public void add_details_about_you(String arg1) {
        details_about_you_page.editDetailsAboutYouPage(arg1);
        details_about_you_page.clickSaveDetails();

    }

    @Then("^I must be able to view my information saved \"([^\"]*)\"$")
    public void i_must_be_able_to_view_my_information_saved(String arg1) {

        String textDetails = details_about_you_page.validateDetailsSaved();
        assertEquals(arg1,textDetails);

        System.out.println("The expected text is: "+arg1);
        System.out.println("The name is: " + textDetails);

        details_about_you_page.closeBrowser();


    }


}
