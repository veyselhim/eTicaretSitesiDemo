import business.concretes.UserManager;
import core.DatabaseLoggerManagerAdapter;
import core.EmailLogger;
import core.UserValidatorManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(1,"Veysel","Himmetoğlu","veyselhim@gmail.com","3434542");
        
        User user2 = new User(1,"Eda","Himmetoğlu","veyselhim@gmail.com","3434542");

        UserManager userManager = new UserManager(new HibernateUserDao(), new UserValidatorManager(),new DatabaseLoggerManagerAdapter());
        userManager.register(user);
        userManager.login(user2);
    }
}
