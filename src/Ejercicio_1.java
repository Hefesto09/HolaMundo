import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float nota_1, nota_2, nota_3, suma;

        System.out.println("Digite 3 calificaciones");
        nota_1 = entrada.nextFloat();
        nota_2 = entrada.nextFloat();
        nota_3 = entrada.nextFloat();

        suma = nota_1 + nota_2 + nota_3;

        System.out.println("La suma es: " + suma);

    }
}
