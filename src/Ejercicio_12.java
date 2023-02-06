import javax.swing.JOptionPane;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del producto"));

        if (precio >= 300) {

            double descuento = precio * 0.2;
            double precio_final = precio - descuento;

            JOptionPane.showMessageDialog(null, "Su precio final a pagar es de: $" + precio_final);
        }
        else {
            JOptionPane.showMessageDialog(null, "su precio a pagar es de: $" + precio);
        }
    }
}
