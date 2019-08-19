package rogeriogentil.service;

import org.junit.Before;
import org.junit.Test;
import rogeriogentil.repository.Users;

import javax.security.auth.login.FailedLoginException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationImplTest {

    private static final String VALID_USERNAME = "user@email.com";
    private static final String VALID_PASSWORD = "123456";

    private AuthenticationImpl authentication;

    @Before
    public void setUp() {
        authentication = new AuthenticationImpl();
    }

    @Test
    public void mustAuthenticate() throws FailedLoginException {
        Users usersMocked = mock(Users.class);
        when(usersMocked.findBy(VALID_USERNAME, VALID_PASSWORD)).thenReturn(Boolean.TRUE);

        authentication.authenticate(VALID_USERNAME, VALID_PASSWORD);
    }
}