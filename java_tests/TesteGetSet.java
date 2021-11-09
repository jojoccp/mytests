import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TesteGetSet {

    public static class Testando {

        private LocalTime horaAtual;

        public LocalTime getHoraAtual() {
            return conversor(horaAtual);
        }

        public void setHoraAtual(LocalTime horaAtual) {
            this.horaAtual = horaAtual;
        }

        public static LocalTime conversor(LocalTime horaAtual) {
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedDate = horaAtual.format(myFormatObj);

            return LocalTime.parse(formattedDate);
        }
    }

    public static void main(String[] args) {

      Testando testando = new Testando();


      String horalocal = "10:50:23";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime dateTime = LocalTime.parse(horalocal, formatter);

      testando.horaAtual = dateTime;

      System.out.println(testando.getHoraAtual());


    }
}
