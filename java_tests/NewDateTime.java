import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewDateTime {

    public static String dateTimePattern(LocalDateTime received) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        String inThePattern = formatter.format(received);

        return inThePattern;
    }

    public static void main(String[] args) {
        LocalDateTime datenow = LocalDateTime.now();



        System.out.println("Data e hora atual: " + dateTimePattern(datenow));
    }
}
