import java.util.Scanner;

public class Ejercicio06 {
    static void main() {
        /*6. Conversor de moneda
CESDE · Segundo Semestre
BÁSICO
Pide un monto en pesos y conviértelo a dólares usando una tasa de cambio fija definida como constante en el
programa.
Pista: Declara la tasa con 'final double TASA = ...;'. La palabra 'final' en Java equivale a una constante, útil cuando un
valor no debe cambiar durante la ejecución*/

        //constante
        final double TASA = 4000.0;

        //declarando variables
        double pesos;
        double dolares;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CONVERSOR DE PESOS A DÓLARES");
        System.out.println("Ingrese el monto de pesos: ");
        pesos = order.nextDouble();

        //cálculo
        dolares = pesos / TASA;

        //salida de datos
        System.out.println("El monto en dólares es: " + String.format("%.2f", dolares));

        order.close();
    }
}
