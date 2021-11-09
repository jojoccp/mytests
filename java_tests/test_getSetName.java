package teste;

public class test_getSetName {

    public static void main (String args[])  {

        teste.test_getSetName teste = new teste.test_getSetName("Nome");
        System.err.println(teste.getName());
    }

    private String name;
    private String lastname;

    test_getSetName(String param){
        setName(param);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("At least 3 chars");
        }
    }
}