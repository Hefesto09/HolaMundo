import java.util.Scanner;

public class Operadpres_aritmeticos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, suma, resta, multiplicacion, divicion, resto;

        System.out.println("Digite 2 numeros");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        divicion = numero1 / numero2;
        resto = numero1%numero2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la divicion es: " + divicion);
        System.out.println("El resultado de la resto es: " + resto);

        
    }
}
