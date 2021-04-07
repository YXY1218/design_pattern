package test04;

class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}