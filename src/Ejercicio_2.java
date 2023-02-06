import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float salario_hora, horas, semana;

        System.out.println("Para saber su salario semanal, ingrese sus horas trabajadas durante la semana: ");
        horas = entrada.nextFloat();

        if (horas <= 72) {
            System.out.println("cuanto gana por hora: ");
            salario_hora = entrada.nextFloat(); 

            semana = salario_hora * horas;

            System.out.println("Su salario correspondiente de esta semana es: $" + semana);
        }

        else {
            System.out.println("se trabaja un maximo de 12 horas por dia, ingrese sus horas correctas");
        }

    }
}
