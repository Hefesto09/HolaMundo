import javax.swing.JOptionPane;

public class Ejercicio_15 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ingrese 3 numeros");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Tercer numero"));

        if (n1 >= n2 && n1 >= n3) {
            JOptionPane.showMessageDialog(null, n1);
            if (n2 >= n3) {
                JOptionPane.showMessageDialog(null, n2);
                JOptionPane.showMessageDialog(null, n3);
            }
            else {
                JOptionPane.showMessageDialog(null, n3);
                JOptionPane.showMessageDialog(null, n2);
            }
        }
        else if (n2 >= n1 && n2 >= n3) {
            JOptionPane.showMessageDialog(null, n2);
            if (n1 >= n3) {
                JOptionPane.showMessageDialog(null, n1);
                JOptionPane.showMessageDialog(null, n3);
            }
            else {
                JOptionPane.showMessageDialog(null, n3);
                JOptionPane.showMessageDialog(null, n1);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, n3);
            if (n1 >= n2) {
                JOptionPane.showMessageDialog(null, n1);
                JOptionPane.showMessageDialog(null, n2);
            }
            else {
                JOptionPane.showMessageDialog(null, n2);
                JOptionPane.showMessageDialog(null, n1);
            }
        }
    }
}
