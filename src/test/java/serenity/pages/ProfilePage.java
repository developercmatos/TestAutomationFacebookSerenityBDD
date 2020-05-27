package serenity.pages;

import net.serenitybdd.core.pages.PageObject;


public class ProfilePage extends PageObject {

    private static final String SESSION_LINK = "//*[@class='_1vp5'][contains(text(),'Madison')]";
    private static final String ABOUT_MENU_ITEM = "//a[contains(text(),'About')]";
    private static final String LINK_DETAILS_ABOUT_YOU = "//span[contains(text(),'Details About You')]";

    public Details_About_You_Page navigateToDetailsPage(){

        waitFor(SESSION_LINK).$(SESSION_LINK).click();
        waitFor(ABOUT_MENU_ITEM).$(ABOUT_MENU_ITEM).click();
        waitFor(LINK_DETAILS_ABOUT_YOU).$(LINK_DETAILS_ABOUT_YOU).click();

        return this.switchToPage(Details_About_You_Page.class);
    }

}
