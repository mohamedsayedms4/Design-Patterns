public class Logger {

    private LogLevel level = LogLevel.INFO;
    private static Logger instance;

    private Logger() {}

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public void logDebug(String message) {
        if(level.ordinal() <= LogLevel.INFO.ordinal())
            System.out.println("[DEBUG] " + message);
    }

    public void logInfo(String message) {
        if(level.ordinal() <= LogLevel.INFO.ordinal())
            System.out.println("[INFO] " + message);
    }

    public void logWarn(String message) {
        if(level.ordinal() <= LogLevel.WARN.ordinal())
            System.out.println("[WARN] " + message);
    }

    public void logError(String message) {
        if(level.ordinal() <= LogLevel.ERROR.ordinal())
            System.out.println("[ERROR] " + message);
    }

    public  static Logger getInstance() {
        if(null == instance){
            synchronized (Logger.class){
                if (null == instance){
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

}
