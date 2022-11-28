import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Empleado p = new Empleado("Pepe Pérez", 31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);
    }
}