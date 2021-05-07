package core;

import DataBaseLogger.DatabaseLoggerManager;

public class DatabaseLoggerManagerAdapter implements LoggerService {
    @Override
    public void log(String message) {
        DatabaseLoggerManager manager = new DatabaseLoggerManager();
        manager.log(message);
    }
}
