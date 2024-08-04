public class Logger {
    private static Logger singleInstance = null;

    private Logger(){}

    public static Logger getSingleInstance(){
        if(singleInstance == null)
            singleInstance = new Logger();
        return singleInstance;
    }

    public void log(String message){

        System.out.println("Log message: " + message);
    }
}
