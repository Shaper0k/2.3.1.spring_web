package hiber.service;

import hiber.dao.UserDaoImp;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class UserServiceImp implements UserService {

    public final UserDaoImp userDaoImp;

    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Transactional
    public void addUser(User user) {
        userDaoImp.addUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDaoImp.updateUser(user);
    }

    @Transactional
    public void deleteUser(long id) {
        userDaoImp.deleteUser(id);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Transactional
    public User getUser(long id) {
        return userDaoImp.getUser(id);
    }
}

