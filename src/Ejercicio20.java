import java.util.Scanner;

public class Ejercicio20 {
    static void main() {
        /*20. Suma de los primeros N naturales
BÁSICO
Pide un número N y, usando un ciclo for y una variable acumuladora, calcula la suma de todos los números
naturales desde 1 hasta N.
Pista: Declara 'int suma = 0;' antes del ciclo y en cada vuelta haz suma = suma + i. Ese patrón es el 'acumulador' que
ya conoces del pseudocódigo*/

        //declarando variables
        int n;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("SUMA DE LOS PRIMEROS N NATURALES");
        System.out.println("Ingresa un número N: ");
        n = order.nextInt();

        //variable acumuladora
        int suma = 0;

        //ciclo for
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        //salida de datos
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);

        order.close();
    }
}
