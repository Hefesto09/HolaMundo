import java.util.Scanner;

public class Ejercicio_4 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese el número de carros vendidos: ");
    int carros_vendidos = entrada.nextInt();

    System.out.print("Ingrese el valor total de las ventas: ");
    int venta_total = entrada.nextInt();

    int SalarioBase = 1000;
    int comisionxcarro = 150;
    double comisionxcentage = 0.05;
    double comision = carros_vendidos * comisionxcarro + (venta_total * comisionxcentage);
    double salario = SalarioBase + comision;
    System.out.println("El salario del vendedor es: " + salario);
}
}
