import java.util.Scanner;

public class Ejercicio29 {
    static void main() {
        /*29. Serie de Fibonacci
INTERMEDIO
Pide un número N y muestra los primeros N términos de la serie de Fibonacci (0, 1, 1, 2, 3, 5, 8...) usando un
ciclo for y variables acumuladoras.
Pista: Mantén dos variables (anterior y actual) que se van actualizando en cada vuelta del ciclo: el siguiente término
es la suma de los dos anteriores*/

        //declarando variables
        int n;
        int anterior;
        int actual;
        int siguiente;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("SERIE DE FIBONACCI");
        System.out.println("¿Cuántos términos deseas ver?: ");
        n = order.nextInt();

        //valores iniciales de la serie
        anterior = 0;
        actual = 1;

        System.out.println("Serie de Fibonacci:");

        //ciclo for
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(anterior);
            } else if (i == 2) {
                System.out.println(actual);
            } else {
                siguiente = anterior + actual;
                System.out.println(siguiente);
                anterior = actual;
                actual = siguiente;
            }
        }

        order.close();
    }
}
