import java.util.Scanner;

public class entrada2carateres  {

    public static void main (String [] args){


        String palabras;

        Scanner lectura = new Scanner(System.in);

        System.out.println("digite su palabra");
        palabras = lectura.nextLine();

        System.out.println ("su palabra es:" + palabras);
        lectura.close();



    }

   
    
}

