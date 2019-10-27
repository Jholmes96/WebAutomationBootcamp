package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import HomePage.AmazonHomePage;
import LogInPage.AmazonLogInPage;

public class LogInTest extends AmazonLogInPage {
    AmazonHomePage homePage = new AmazonHomePage();
    @Test @Ignore
    public void testlogIn(){
        homePage.signIn();
        validateLoginField("username");
        continueButton();
        validatePasswordField("password");
        clickOnSignInButton();
    }
}
