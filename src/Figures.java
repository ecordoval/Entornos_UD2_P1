public class Figures {

    public static char Asterisk = '*';

    public static void writeSquare(int a) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.printf("*");
            }

            System.out.println("");

        }
    }

    public static void writeSquare(int a, char caracter) {

        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.print(caracter);
            }

            System.out.println("");

        }
    }

}