class logger {
    private static logger inst;
    private logger() {
        System.out.println("Logger initialized.");
    }
    public static logger getInstance() {
        if (inst == null) {
            inst = new logger();
        }
        return inst;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        logger log1 = logger.getInstance();
        logger log2 = logger.getInstance();

        log1.log("This is the first log message.");
        log2.log("This is the second log message.");
        if (log1 == log2) {
            System.out.println("Same instance of Logger is used.");
        } else {
            System.out.println("Different instances - Singleton violated.");
        }
    }
}