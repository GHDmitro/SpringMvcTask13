package ua.kiev.prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by macbookair on 24.03.16.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void addUser(User user) {
        userDAO.add(user);
        System.out.println("adddddInService");
    }

    @Transactional
    public void deleteUser(User user) {
        userDAO.delete(user);
    }

    @Transactional(readOnly=true)
    public List<User> listUsers() {
        return userDAO.list();
    }

    @Transactional(readOnly=true)
    public User findUser(long id) {
        return userDAO.findOne(id);
    }

}
