import javax.swing.JOptionPane;

public class Ejercicio_11 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Ingrese una letra en mayuscula");

        char letra = JOptionPane.showInputDialog("").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Esta es una letra mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"Esta NO es una letra mayuscula");
        }
    }
    
}
