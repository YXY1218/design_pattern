package test04;

public class ConsoleLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new ConsoleLog();
        return logger;
    }
}