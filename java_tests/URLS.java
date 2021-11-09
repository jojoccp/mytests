public class URLS {


    public static class URLValidation {

        String[] urls = {"urlum", "urldois", "urltres", "urlquatro", "urlcinco"};


        public static void main(String[] args) {

            URLValidation urlvalidation = new URLValidation();

            if ((urlvalidation.urls.length) > 5) {
                System.out.println("O usuário cadastrou mais que 5 imagens");
            }

            System.out.println(urlvalidation.urls.length);

            System.out.println(urlvalidation.urls[3]);

        }
    }
}
