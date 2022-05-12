package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUserById(int id);

    public void deleteUserById(int id);

    public User getActiveUserByEmail(String email);

    public boolean isEmailAlreadyInUse(String email);
}
