package rogeriogentil.service;

import rogeriogentil.repository.UserRepository;
import rogeriogentil.repository.Users;

import javax.security.auth.login.FailedLoginException;

public class AuthenticationImpl implements Authentication {

    private Users users;

    public AuthenticationImpl() {
        this.users = new UserRepository();
    }

    public void authenticate(final String username, final String password) throws FailedLoginException {
        boolean userFound = this.users.findBy(username, password);

        if (!userFound) {
            throw new FailedLoginException("Invalid Credentials.");
        }
    }
}
