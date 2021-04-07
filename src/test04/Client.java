package test04;

public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory)XMLUtil.getBean("log");
        logger = factory.createLogger();
        logger.writeLog();
    }
}