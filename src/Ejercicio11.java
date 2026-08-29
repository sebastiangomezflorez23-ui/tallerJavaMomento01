import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        /*11. Clasificación de un número
INTERMEDIO
Pide un número entero y clasifícalo como: negativo, cero, positivo par o positivo impar. Debes llegar a esa
clasificación con condicionales anidados.
Pista: Primero separa negativo / no negativo. Dentro de 'no negativo', separa cero de positivo. Dentro de 'positivo',
evalúa par/impar con %. Así se anidan los if*/

        //declarando variables
        int numero;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CLASIFICAR UN NÚMERO");
        System.out.println("Ingresa un número entero: ");
        numero = order.nextInt();

        //validación anidada y salida de datos
        if (numero < 0) {
            System.out.println("El número " + numero + " es NEGATIVO");
        } else {
            if (numero == 0) {
                System.out.println("El número es CERO");
            } else {
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es POSITIVO PAR");
                } else {
                    System.out.println("El número " + numero + " es POSITIVO IMPAR");
                }
            }
        }

        order.close();

    }
}
