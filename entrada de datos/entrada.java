import java.util.Scanner;

public class entrada {

    public static void main (String [] args) {

        int numero;

        Scanner digitando =  new Scanner(System.in);

        System.out.println("digite su numero porfavor!");

        numero = digitando.nextInt();

        System.out.println( "su numero es :" + numero);
        digitando.close();

    }
    
}
