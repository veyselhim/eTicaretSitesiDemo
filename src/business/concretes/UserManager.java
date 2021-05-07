package business.concretes;

import business.abstracts.UserService;
import core.EmailLogger;
import core.LoggerService;
import core.UserValidator;
import core.Utils;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

   private UserDao userDao;
   private UserValidator validator;
   private LoggerService loggers;

    public UserManager(UserDao userDao, UserValidator validator , LoggerService loggers) {
        this.userDao = userDao;
        this.validator = validator;
        this.loggers = loggers;
    }

    @Override
    public void register(User user) {
        if (validator.validate(user) && validator.isEmailValid(user)==true){
            userDao.register(user);
            Utils.runLoggers(loggers, user.getFirstName());
        }else if(!validator.isEmailValid(user)==true){
            System.out.println("E mail yanlış");
        }
    }

    @Override
    public void login(User user) {
        if (validator.validateLogin(user)) {
            userDao.login(user);
        }

    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void getById(int userId) {
        userDao.getById(userId);
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
