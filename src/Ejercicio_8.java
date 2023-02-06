import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de a, b, c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double x1, x2;
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces de la ecuación son x1 = " + x1 + " y x2 = " + x2);
        } 
        else if (discriminante == 0) {
            x1 = -b / (2 * a);

            System.out.println("La ecuación tiene una raíz doble x1 = x2 = " + x1);
        } 
        else {
            System.out.println("La ecuación no tiene solución real");
        }
            }
        }
        