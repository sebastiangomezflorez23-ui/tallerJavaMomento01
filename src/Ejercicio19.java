import java.util.Scanner;

public class Ejercicio19 {
    static void main() {
        /*19. Validar número positivo con do-while
BÁSICO
Usa un ciclo do-while para pedir repetidamente un número hasta que el usuario ingrese uno positivo.
Pista: El do-while ejecuta el bloque al menos una vez, ideal aquí porque siempre debes pedir el dato la primera vez
antes de poder validarlo.*/

        //declarando variables
        double numero;

        //scanner
        Scanner order = new Scanner(System.in);

        //ciclo do-while
        System.out.println("VALIDAR NÚMERO POSITIVO");
        do {
            System.out.println("Ingresa un número positivo: ");
            numero = order.nextDouble();

            if (numero <= 0) {
                System.out.println("Error: debes ingresar un número mayor a cero. Intenta de nuevo.");
            }
        } while (numero <= 0);

        //salida de datos
        System.out.println("Número positivo: " + numero);

        order.close();

    }
}
