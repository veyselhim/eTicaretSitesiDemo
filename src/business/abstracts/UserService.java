package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {

    void register(User user);

    void login(User user);

    void update(User user);

    void delete(User user);

    void getById(int userId);

    List<User> getAll();

}
