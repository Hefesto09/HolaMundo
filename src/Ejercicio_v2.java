import javax.swing.JOptionPane;

public class Ejercicio_v2 {
    public static void main(String[] args) {
        
        double salario_hora, horas, semana;

        horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario trabajado durante la semana"));

        if (horas <= 72) {
            salario_hora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto gana por hora"));

            semana = salario_hora * hora;

        }

    }
}
