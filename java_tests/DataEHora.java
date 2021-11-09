import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {

    public static String dateTimePattern() {
        LocalDateTime datenow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        String data = formatter.format(datenow);

        return data;
    }

    public static void main(String[]args){

        DataEHora dataEHora = new DataEHora();

        String formatted = dataEHora.dateTimePattern();

        LocalDateTime notFormatted = LocalDateTime.now();

        System.out.println("Data não formatada: " + notFormatted);
        System.out.println("Data formatada: " + formatted);


    }
}
