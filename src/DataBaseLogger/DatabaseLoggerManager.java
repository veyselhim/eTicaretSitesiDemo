package DataBaseLogger;

public class DatabaseLoggerManager { //dış servis eklenmesi
    public void log(String message){
        System.out.println("Logged to database : "+message);
    }
}
