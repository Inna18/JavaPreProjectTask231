package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public User getActiveUserByEmail(String email) {
        return userDao.getActiveUserByEmail(email);
    }


    @Override
    @Transactional
    public boolean isEmailAlreadyInUse(String email) {
        boolean emailInDB = true;

        if (userDao.getActiveUserByEmail(email) == null) {
            emailInDB = false;
        }
        return emailInDB;
    }


}
