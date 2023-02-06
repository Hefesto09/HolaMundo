import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota de participacion: ");
        float participacion = entrada.nextInt();

        System.out.println("nota de primer examen: ");
        float examen_1 = entrada.nextInt();

        System.out.println("nota de segundo examen: ");
        float examen_2 = entrada.nextInt();

        System.out.println("nota de examen final: ");
        float examen_final = entrada.nextInt();

        float nota_final = (participacion*10/100) + (examen_1*25/100) + (examen_2*25/100) + (examen_final*40/100);

        System.out.println("La nota final del estudiante es de: " + nota_final);

    }
}
