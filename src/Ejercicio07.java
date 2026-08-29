import java.util.Scanner;

public class Ejercicio07 {
    static void main() {
        /*7. Par o impar
        Pide un número entero e indica si es par o impar.
        Pista: Usa el operador módulo %. Si numero % 2 == 0, el número es par.*/

        //declarando variables
        int numero;
        int mitad;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR SI UN NÚMERO ES PAR O IMPAR");
        System.out.println("Ingresa un número entero: ");
        numero = order.nextInt();

        //validación y salida de datos
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
            System.out.println("La mitad del numero es: " + numero / 2);
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }

        order.close();
    }
}
