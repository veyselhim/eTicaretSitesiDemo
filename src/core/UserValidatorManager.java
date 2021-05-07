package core;

import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorManager implements UserValidator {

    @Override
    public boolean validate(User user) {
        if (user.getFirstName().isEmpty() || user.getLastName().isEmpty() || user.getMail().isEmpty() || user.getPassword().isEmpty() ||
                user.getFirstName().length()<3 || user.getLastName().length()<3){
            System.out.println("Lütfen alanların hepsini doldurunuz ve ad ve soyad kısımlarını 2 karakterden fazla giriniz.");



            return false;
        }else if(user.getPassword().length()<6){
            System.out.println("Lütden şifrenizi 6 veya  daha fazla karakter giriniz.");
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean isEmailValid(User user) {

        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = user.getMail();
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(user.getMail());
        return matcher.matches();
    }

    @Override
    public boolean validateLogin(User user) {
        if (user.getFirstName().isEmpty() || user.getPassword().isEmpty()){
            System.out.println("Lütfen alanları giriniz");
            return false;
        }else{
            return true;
        }


    }
}
