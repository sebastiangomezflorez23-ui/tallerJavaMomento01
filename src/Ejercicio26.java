import java.util.Scanner;

public class Ejercicio26 {
    static void main() {
        /*26. Cajero automático con intentos limitados
INTERMEDIO
Simula la validación de una clave: usa un ciclo do-while que permita máximo 3 intentos para ingresar la clave
correcta (defínela como constante en el código). Si acierta, muestra 'Acceso concedido'; si agota los intentos,
muestra 'Cuenta bloqueada'.
Pista: Lleva un contador de intentos dentro del do-while y evalúa dos condiciones de salida: clave correcta o intentos
agotados. Piensa qué condición debe controlar el while(...).*/

    //constante
    final int CLAVE_CORRECTA = 1234;

    //declarando variables
    int claveIngresada;
    int intentos;
    boolean accesoConcedido;

    //scanner
    Scanner order = new Scanner(System.in);

    //inicializando variables de control
    intentos = 0;
    accesoConcedido = false;

    //ciclo do-while
        System.out.println("CAJERO AUTOMÁTICO");
        do {
        System.out.println("Ingresa tu clave: ");
        claveIngresada = order.nextInt();
        intentos++;

        if (claveIngresada == CLAVE_CORRECTA) {
            accesoConcedido = true;
        } else {
            System.out.println("Clave incorrecta. Intentos restantes: " + (3 - intentos));
        }

    } while (!accesoConcedido && intentos < 3);

    //salida de datos
        if (accesoConcedido) {
        System.out.println("Acceso concedido");
    } else {
        System.out.println("Cuenta bloqueada");
    }

        order.close();
}

}