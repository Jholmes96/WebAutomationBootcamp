package testCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import Signout.SignOut;

public class SignOutTest extends SignOut {
    @Test @Ignore
    public void testSignOut(){
        validateSignOut();
        sleepFor(5);
    }
}
