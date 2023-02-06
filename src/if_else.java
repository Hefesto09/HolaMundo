import javax.swing.JOptionPane;

public class if_else {
    public static void main(String[] args) {
        /*
         * la sentencia if:
         * if (condicion) {
         *      instruccion
         * }
         * else {
         *      condicion2
         * }
         * 
         * se ejecuta uno u otro
         * 
         * ahora trabajaremos con JOptionPane para practicarlo pero el if else se puede usar de diferentes formas
         */

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int dato = 5;

        if (numero == dato) { // aqui se puede usar
            // == "significa algo es igual a algo"
            // != "significa algo es diferente a algo"
            // >, <, <=, >=, "Se puede usar cualquiera de estos"
            JOptionPane.showMessageDialog(null, "EL numero es: 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es diferente a dato");
        }
    }
    
}
