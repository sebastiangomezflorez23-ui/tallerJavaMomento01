import java.util.Scanner;

public class Ejercicio25 {
    static void main() {
        /*25. Promedio de N calificaciones
INTERMEDIO
Pide primero cuántas calificaciones se van a ingresar (N) y luego, con un ciclo controlado por contador, pide
cada nota, acumúlalas y calcula el promedio final.
Pista: Necesitas dos variables: una para acumular la suma y otra como contador del ciclo (for (int i = 1; i <= n; i++)). Al
final divide la suma entre n*/

        //declarando variables
        int n;
        double nota;
        double suma;
        double promedio;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("PROMEDIO DE N CALIFICACIONES");
        System.out.println("¿Cuántas calificaciones vas a ingresar?: ");
        n = order.nextInt();

        //variable acumuladora
        suma = 0;

        //ciclo for controlado por contador
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa la calificación " + i + ": ");
            nota = order.nextDouble();
            suma = suma + nota;
        }

        //cálculo
        promedio = suma / n;

        //salida de datos
        System.out.println("El promedio de las " + n + " calificaciones es: " + String.format("%.2f", promedio));

        order.close();
    }
}
