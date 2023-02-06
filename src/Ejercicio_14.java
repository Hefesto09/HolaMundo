import javax.swing.JOptionPane;

public class Ejercicio_14 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingrese dos numeros");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("numero 1") );
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2") );

        if (n1%2 == 0 && n2%2 == 0 ) {
            JOptionPane.showMessageDialog(null, "ambos son pares");
        }
        else if (n1%2 != 0 && n2%2 != 0) {
            JOptionPane.showMessageDialog(null, "ambos son inpares");
        }
        else {
        JOptionPane.showMessageDialog(null, "Uno es par y el otro inpar");
        }


    }
}
