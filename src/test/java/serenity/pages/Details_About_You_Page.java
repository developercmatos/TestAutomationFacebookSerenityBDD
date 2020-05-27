package serenity.pages;


import net.serenitybdd.core.pages.PageObject;

public class Details_About_You_Page extends PageObject {


    private static final String LINK_EDIT_DETAILS = "//div[@id='pagelet_bio']//li[2]//a[1]";
    private static final String INPUT_ABOUT_YOU = "//textarea[contains(@name,'textarea')]";
    private static final String SAVED_DETAILS_BUTTON = "//button[contains(@name,'__submit__')]";
    private static final String SAVED_TEXT_DETAILS = "//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/ul/li/div/div/div/div/div/div/ul/li/div/div/span[1]";

    /**
     * Adding a new detail information
     * @param details
     * @return
     */
    public Details_About_You_Page editDetailsAboutYouPage(String details){

        waitForTextToAppear("ABOUT YOU");
        moveTo(LINK_EDIT_DETAILS);
        $(LINK_EDIT_DETAILS).click();
        $(INPUT_ABOUT_YOU).clear();
        $(INPUT_ABOUT_YOU).type(details);

        return this;
    }

    /**
     * Click on saving detail information
     * @return
     */
    public Details_About_You_Page clickSaveDetails(){

        waitFor(SAVED_DETAILS_BUTTON).$(SAVED_DETAILS_BUTTON).click();

        return this;
    }

    /**
     * Validating the saved details
     * @param
     * @return
     */
    public String validateDetailsSaved (){

        return waitFor(SAVED_TEXT_DETAILS).$(SAVED_TEXT_DETAILS).getText();
    }

    public Details_About_You_Page closeBrowser(){

        getDriver().quit();
        return this;

    }

}
