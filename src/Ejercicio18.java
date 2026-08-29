import java.util.Scanner;

public class Ejercicio18 {
    static void main() {
        /*18. Conteo regresivo con while
BÁSICO
Pide un número entero positivo N y usa un ciclo while para imprimir la cuenta regresiva desde N hasta 1.
Pista: Inicializa una variable contador = N antes del while; dentro del ciclo, imprime y luego decrementa con
contador--*/

        //declarando variables
        int n;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CONTEO REGRESIVO");
        System.out.println("Ingresa un número entero positivo: ");
        n = order.nextInt();

        //inicialización del contador
        int contador = n;

        //ciclo while
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }

        order.close();
    }
}
