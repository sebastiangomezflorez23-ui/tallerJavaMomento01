import java.util.Scanner;

public class Ejercicio22 {
    static void main() {
        /*22. Factorial de un número
CESDE · Segundo Semestre
INTERMEDIO
Pide un número entero N y calcula su factorial (N!) usando un ciclo for y una variable acumuladora de tipo
long.
Pista: Inicializa 'long factorial = 1;' y multiplica en cada vuelta: factorial *= i. Usa long en lugar de int porque el factorial
crece muy rápido*/

        //declarando variables
        int n;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULAR FACTORIAL DE UN NÚMERO");
        System.out.println("Ingresa un número entero N: ");
        n = order.nextInt();

        //variable acumuladora
        long factorial = 1;

        //ciclo for
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        //salida de datos
        System.out.println("El factorial de " + n + " es: " + factorial);

        order.close();
    }
}
