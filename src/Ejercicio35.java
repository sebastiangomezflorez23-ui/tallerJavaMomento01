import java.util.Scanner;

public class Ejercicio35 {
    static void main() {
        /*35. Invertir un arreglo
INTERMEDIO
Declara un arreglo de 6 enteros, llénalo con datos ingresados por el usuario y muestra sus elementos en
orden inverso (del último al primero), sin usar métodos ya construidos de Java para invertir arreglos.
Pista: Para recorrer en reversa, usa un ciclo for que comience en (arreglo.length - 1) y vaya disminuyendo hasta 0.*/

        //declarando el arreglo
        int[] numeros = new int[6];

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("INVERTIR UN ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //mostrando el arreglo en orden inverso
        System.out.println("\nEl arreglo en orden inverso es:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        order.close();

    }
}
