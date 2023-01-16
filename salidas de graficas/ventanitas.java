import javax.swing.JOptionPane;

public class ventanitas {
    

    public static void main (String [] args){

        int numero;
        String palabra;
        byte numeropequeno;
        char letra;
        float decimal;
        double decimalnull;


numero = Integer.parseInt(JOptionPane.showInputDialog("digite su numero"));  
palabra = JOptionPane.showInputDialog("digite su mensaje"); 
numeropequeno = Byte.parseByte(JOptionPane.showInputDialog("digite su numero pequeno"));
letra = JOptionPane.showInputDialog("digite su letra").charAt(0);
decimal = Float.parseFloat(JOptionPane.showInputDialog("digite su numero decimal"));
decimalnull = Double.parseDouble(JOptionPane.showInputDialog("digite su decimal este es un doble y consume 64 de memoria"));



JOptionPane.showMessageDialog(null, "el numero es " + numero);
JOptionPane.showMessageDialog(null," la palabra es " + palabra);
JOptionPane.showMessageDialog(null,"Su numero pequeno es " + numeropequeno);
JOptionPane.showMessageDialog(null, "su letra es " + letra);
JOptionPane.showMessageDialog(null, "su decimal es " + decimal);
JOptionPane.showMessageDialog(null,"su decimal que provide del double es "+ decimalnull);





    }
}
