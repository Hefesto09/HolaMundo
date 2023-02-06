import javax.swing.JOptionPane;

public class Ejercicio_9 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero y le diremos si es multiplo de 10: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "Si es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "NO es multiplo de 10");
        }
    }
    
}
