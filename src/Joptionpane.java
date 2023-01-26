import javax.swing.JOptionPane;

public class Joptionpane {
    public static void main(String[] args) {

        String cadena;
        int numero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite su nombre: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        letra = JOptionPane.showInputDialog("Letra favorita: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite su altura: "));

        JOptionPane.showMessageDialog(null, "Su nombre es: " + cadena);
        JOptionPane.showMessageDialog(null, "Su edad es: " + numero);
        JOptionPane.showMessageDialog(null, "Su letra favorita es: " + letra);
        JOptionPane.showMessageDialog(null, "Su altura es: " + decimal);




    }
    
}
