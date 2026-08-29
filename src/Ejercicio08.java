import java.util.Scanner;

public class Ejercicio08 {
    static void main() {
        /*8. Signo de un número
        Pide un número y determina si es positivo, negativo o cero.
        BÁSICO
        Pista: Necesitas tres caminos posibles: usa if / else if / else,
        evaluando primero == 0 o el orden que prefieras.*/

        //declarando variables
        double numero;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR EL SIGNO DE UN NÚMERO");
        System.out.println("Ingresa un número: ");
        numero = order.nextDouble();

        //validación y salida de datos
        if (numero == 0) {
            System.out.println("El número es 0");
        } else if (numero > 0){
            System.out.println(numero + " Es un número positivo");
        } else {
            System.out.println(numero + " Es un número negativo");
        }

        order.close();
    }
}
