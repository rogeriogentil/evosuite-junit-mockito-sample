package rogeriogentil.service;

import javax.security.auth.login.FailedLoginException;

public interface Authentication {

    void authenticate(String username, String password) throws FailedLoginException;
}
