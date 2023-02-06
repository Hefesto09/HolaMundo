import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas: ");
        int horasTotales = entrada.nextInt();

        int semana = horasTotales / 168;
        int dias = horasTotales % 168 / 24;
        int horas = horasTotales % 24;


        System.out.println("Esto equivale a: ");
        System.out.println(semana +  " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");

    }
}
