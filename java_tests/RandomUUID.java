import java.util.UUID;

public class RandomUUID {

    public static UUID uuidRandom() {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        return uuid;
    }


    public static void main(String[] args) {

        System.out.println("Seu id randomico é: " + uuidRandom());
    }
}
