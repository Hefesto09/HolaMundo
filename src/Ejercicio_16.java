import javax.swing.JOptionPane;

public class Ejercicio_16 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingrese un numero entre 0 - 99999");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero"));

        int contador = 0;

        if (numero == 0) {
            contador = 1;
        }
        else {
            while (numero != 0) {
                contador++;
                numero /= 10;
            }
        }
        JOptionPane.showMessageDialog(null, "el numero ingresado tiene " + contador + " cifra(s)");
    }
}
