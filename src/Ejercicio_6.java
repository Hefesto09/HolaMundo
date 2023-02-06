import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        float n1 = entrada.nextInt();

        System.out.println("ingrese el segundo numero: ");
        float n2 = entrada.nextInt();

        double resultado = Math.pow((n1 + n2),2);

        System.out.println("El resultado es: " + resultado);
        
    }
}
