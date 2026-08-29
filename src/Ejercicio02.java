import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        //2. Área y perímetro de un rectángulo

        //declarando variables
        double base;
        double altura;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULAR AREA Y PERIMETRO DE UN RECTÁNGULO");
        System.out.println("Ingresa la base: ");
        base = order.nextDouble();
        System.out.println("Ingresa la altura: ");
        altura = order.nextDouble();

        //salida de datos
        System.out.println("El area es: " + String.format("%.2f",base * altura));
        System.out.println("El perimetro es: " + String.format("%.2f", 2 * (base + altura)));

        order.close();
    }
}
