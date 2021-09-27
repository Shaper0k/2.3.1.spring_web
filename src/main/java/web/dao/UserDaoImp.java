package web.dao;


import web.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager manager;

    public void addUser(User user) {
        manager.persist(user);
    }

    public void updateUser(User user) {
        manager.merge(user);
    }

    public void deleteUser(long id) {
        manager.createQuery("DELETE FROM User u WHERE u.id = :id")
                .setParameter("id", id).executeUpdate();
    }

    public User getUser(long id) {
        return manager.find(User.class, id);
    }

    public List<User> getAllUsers() {
        return manager.createQuery("from User", User.class).getResultList();
    }
}