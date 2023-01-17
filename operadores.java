

import java.util.Scanner;

public class operadores {
    public static void main (String[]args){

        Scanner read = new Scanner(System.in);

        float numero1,numero2,suma,resta,multiplicacion,divicion;


        numero1 = read.nextFloat();
        numero2 = read.nextFloat();

        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        divicion = numero1/numero2;


        System.out.println("la suma es " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es" + multiplicacion);
        System.out.println("la divicion es" + divicion);

        read.close();


    }
}
