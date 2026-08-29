import java.util.Scanner;

public class Ejercicio05 {
    static void main() {
        /*5. Promedio de tres notas
                Pide al usuario tres calificaciones (double) y calcula el promedio.
                BÁSICO
                Pista: Suma las tres variables y divide entre 3.0 (no entre 3, para evitar
                una división entera si en algún punto usaras
                enteros)*/

        //declarando variables
        double nota1;
        double nota2;
        double nota3;
        double promedio;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULAR PROMEDIO DE TRES NOTAS");
        System.out.println("Ingresa la primera nota: ");
        nota1 = order.nextDouble();
        System.out.println("Ingresa la segunda nota: ");
        nota2 = order.nextDouble();
        System.out.println("Ingresa la tercera nota: ");
        nota3 = order.nextDouble();

        //cálculo
        promedio = (nota1 + nota2 + nota3) / 3.0;

        //salida de datos
        System.out.println("El promedio es: "+ String.format("%.2f", promedio));

        order.close();

    }

}
