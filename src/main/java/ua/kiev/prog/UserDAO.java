package ua.kiev.prog;

import java.util.List;

/**
 * Created by macbookair on 24.03.16.
 */
public interface UserDAO {
    void add(User user);
    void delete(User user);
    User findOne(long id);
    List<User> list();
}
