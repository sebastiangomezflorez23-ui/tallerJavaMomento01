import java.util.Scanner;

public class Ejercicio27 {
    static void main() {
        /*27. Determinar si un número es primo
INTERMEDIO
Pide un número entero mayor a 1 y determina si es primo, usando un ciclo for que pruebe sus posibles
divisores.
Pista: Un número es primo si solo es divisible por 1 y por sí mismo. Recorre con for desde 2 hasta el número - 1 (o
hasta su raíz cuadrada para optimizar) contando cuántas veces el módulo da 0.*/

        //declarando variables
        int numero;
        int contadorDivisores;
        boolean esPrimo;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR SI UN NÚMERO ES PRIMO");
        System.out.println("Ingresa un número entero mayor a 1: ");
        numero = order.nextInt();

        //variable acumuladora (cuenta divisores)
        contadorDivisores = 0;

        //ciclo for probando posibles divisores
        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }

        //validación
        if (contadorDivisores == 0) {
            esPrimo = true;
        } else {
            esPrimo = false;
        }

        //salida de datos
        if (esPrimo) {
            System.out.println("El número " + numero + " es PRIMO");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }

        order.close();

    }
}
