import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
    /*
     * guillermo tiene N dolares. 
     * Luis tiene la mitad de lo que tiene guillermo.
     * juan tiene la mitad de lo que tiene luis y guilermo juntos
     * hacer un programa que calcule e imprima la cantidad de dinero que tienen los 3
     */
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, suma;

        System.out.println("Hola Guillermo cuanto dinero tienes? ");
        guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo + luis) / 2;

        suma = juan + luis + guillermo;

        System.out.println("La suma de dinero que tienen los 3 es de: $" + suma);

    }
    
}
