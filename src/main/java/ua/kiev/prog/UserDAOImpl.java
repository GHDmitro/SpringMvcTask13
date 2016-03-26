package ua.kiev.prog;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by macbookair on 24.03.16.
 */
@Repository
public class UserDAOImpl implements UserDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
        System.out.println("AdddddInDaaao");
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public User findOne(long id) {

        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> list() {
//        List<User> list = (List<User>) entityManager.createQuery("select u from User u", User.class );
        Query query = entityManager.createQuery("select u from User u ", User.class);
        return (List<User>) query.getResultList();
    }
}
