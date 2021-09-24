package hiber.dao;

import hiber.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    List<User> getAllUsers();
    User getUser(long id);
}
