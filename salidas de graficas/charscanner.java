import java.util.Scanner;

public class charscanner {


public static void main (String [] args) {



    char letra;

    Scanner solicitando = new Scanner(System.in);
    System.out.println("digite solo una letra");
    letra = solicitando.next().charAt(0);


    System.out.println ("su letra es: " + letra);
    solicitando.close();




}

}




    


    

