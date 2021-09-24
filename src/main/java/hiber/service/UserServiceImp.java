package hiber.service;

import hiber.dao.UserDaoImp;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImp implements UserService {

    public final UserDaoImp userDaoImp;

    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public void addUser(User user) {
        userDaoImp.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDaoImp.updateUser(user);
    }

    @Override
    public void deleteUser(long id) {
        userDaoImp.deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Override
    public User getUser(long id) {
        return userDaoImp.getUser(id);
    }
}

