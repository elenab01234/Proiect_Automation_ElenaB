package api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import api.utils.TokenUtils;

public class AuthTests {

    @Test
    public void loginSuccessfully() {
        // POST https://api.practicesoftwaretesting.com/users/login
        String token = TokenUtils.getToken();
        // System.out.println(token);

        Assert.assertNotNull(token);
    }
}
