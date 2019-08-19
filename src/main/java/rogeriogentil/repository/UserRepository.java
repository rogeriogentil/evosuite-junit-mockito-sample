package rogeriogentil.repository;

public class UserRepository implements Users {

    public boolean findBy(final String username, final String password) {
        return password.equals("123456");
    }
}
