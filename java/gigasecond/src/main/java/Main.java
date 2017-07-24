import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Andrew on 7/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Gigasecond giga = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
        System.out.println("Calling getDate:" + giga.getDate());
    }
}
