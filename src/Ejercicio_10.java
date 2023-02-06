import javax.swing.JOptionPane;

public class Ejercicio_10 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Ingrese 2 numeros");
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "el primer numero es mayor que el segundo");
        }
        else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El segundo numero es mayor que el primero");
        }
        else {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
    }
}
