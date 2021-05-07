package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void register(User user) {
        System.out.println("Hibernate ile kayıt olundu : " + user.getFirstName());
    }

    public void login(User user) {
        System.out.println("Hibernate ile giriş yapıldı : " + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernate ile silindi : " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
    }

    @Override
    public void getById(int userId) {
        System.out.println("Hibernate ile getirildi" + userId);
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
