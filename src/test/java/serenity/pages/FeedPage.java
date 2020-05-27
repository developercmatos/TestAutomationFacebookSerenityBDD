package serenity.pages;

import net.serenitybdd.core.pages.PageObject;

public class FeedPage extends PageObject {

    private static final String NAME_SESSION = "//*[@class='_1vp5'][contains(text(),'Madison')]";


    /**
     * Validating the name session
     */
    public String validateTheNameSession (){

        return waitFor(NAME_SESSION).$(NAME_SESSION).getText();
    }

    /**
     * Navigating to profile page
     * @return
     */
    public ProfilePage navigatetoProfilePage(){

        $(NAME_SESSION).click();
        waitForTextToAppear("Madison Aleahjggehadh McDonaldman");

        return this.switchToPage(ProfilePage.class);
    }



}
