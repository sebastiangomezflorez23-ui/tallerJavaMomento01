import java.util.Scanner;

public class Ejercicio31 {
    static void main() {
        /*31. Mi primer arreglo
BÁSICO
Declara un arreglo de 5 enteros. Llénalo pidiendo cada valor al usuario con Scanner dentro de un ciclo for, y
luego muéstralos todos en pantalla usando otro ciclo for.
Pista: Se declara así: int[] numeros = new int[5];. Para acceder a una posición usas numeros[i], donde i va de 0 a 4 (la
primera posición de un arreglo en Java siempre es la 0).*/

        //declarando el arreglo
        int[] numeros = new int[5];

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("MI PRIMER ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //mostrando el arreglo
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        order.close();
    }
}
