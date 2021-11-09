public class GetSetTest {


    public static class Numero {

        int num;


        public int getNum() {
            return num+2;
        }

        public void setNum(int num) {
            this.num = num;
        }

    }


    public static void main(String[] args) {

        Numero numero = new Numero();

        numero.num = 50;


        System.out.println("O número + 2 é" + numero.getNum());


    }



}
