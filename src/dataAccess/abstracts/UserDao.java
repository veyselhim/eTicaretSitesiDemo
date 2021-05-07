package dataAccess.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserDao {

    void register(User user);

    void login(User user);

    void delete(User user);

    void update(User user);

    void getById(int userId);

    List<User> getAll();
}
