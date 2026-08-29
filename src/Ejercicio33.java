import java.util.Scanner;

public class Ejercicio33 {
    static void main() {
        /*33. Máximo y mínimo de un arreglo
BÁSICO
Declara un arreglo de 8 enteros, llénalo con datos ingresados por el usuario y determina cuál es el valor
máximo y cuál el valor mínimo.
Pista: Inicializa dos variables (maximo y minimo) con el primer elemento del arreglo (posición 0) y luego recorre el
resto comparando cada valor con un condicional dentro del ciclo*/

        //declarando el arreglo
        int[] numeros = new int[8];

        //declarando variables
        int maximo;
        int minimo;

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("MÁXIMO Y MÍNIMO DE UN ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //inicializando máximo y mínimo con el primer elemento
        maximo = numeros[0];
        minimo = numeros[0];

        //recorriendo el resto del arreglo (desde la posición 1)
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        //salida de datos
        System.out.println("\nEl valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

        order.close();

    }
}
