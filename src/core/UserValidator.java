package core;

import entities.concretes.User;

public interface UserValidator {

    boolean validate(User user);

    boolean isEmailValid(User user);

    boolean validateLogin(User user);
}
