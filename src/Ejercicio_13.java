import javax.swing.JOptionPane;

public class Ejercicio_13 {
    public static void main(String[] args) {
    int htrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas")) ;

    int salario;

    if (htrabajadas <= 40) {
        salario = htrabajadas * 16;
    }
    else {
        salario = 40 * 16 + (htrabajadas - 40) * 20;
    }

    JOptionPane.showMessageDialog(null, "Su salario de la sema es: $" + salario);

    }
}