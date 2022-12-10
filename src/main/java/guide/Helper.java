package guide;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static String getServiceInfo(Class<?> clazz){
        /*
         * Returns the class name and the current time. Use to mark servlet
         * responses. 
         */

        String className = clazz.getName();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return "Served by " + className + " at " + formatter.format(date); 
    }
    
}
