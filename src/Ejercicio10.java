import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        /*10. Aprobado o reprobado
        Pide una nota final (0 a 5) e indica si el estudiante aprobó (nota >= 3.0) o reprobó.
        Pista: Es la misma lógica del ejercicio anterior, pero con un valor double en vez de int.*/

        //declarando variables
        double nota;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR APROBADO O REPROBADO");
        System.out.println("Ingresa la nota final (0 a 5): ");
        nota = order.nextDouble();

        //validación y salida de datos
        if (nota >= 3.0) {
            System.out.println("El estudiante aprobó con nota: " + String.format("%.2f", nota));
        } else {
            System.out.println("El estudiante reprobó con nota: " + String.format("%.2f", nota));
        }

        order.close();
    }
}
