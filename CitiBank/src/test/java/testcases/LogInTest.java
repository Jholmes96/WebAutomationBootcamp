package testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import CitiBankLogIn;

public class LogInTest extends CitiBankLogIn {

    @Test @Ignore
    public void testLogin(){
        logIn();
    }
}
