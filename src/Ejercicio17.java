import java.util.Scanner;

public class Ejercicio17 {
    static void main() {
        /*17. Tabla de multiplicar
BÁSICO
Pide un número entero y usa un ciclo for para imprimir su tabla de multiplicar del 1 al 10 (por ejemplo: 7 x 1 =
7).
Pista: Dentro del ciclo, multiplica el número ingresado por la variable de control i en cada vuelta.*/

        //declarando variables
        int numero;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("Ingresa un número entero: ");
        numero = order.nextInt();

        //ciclo for
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        order.close();
    }
}
