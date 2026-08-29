import java.util.Scanner;

public class Ejercicio03 {
    static void main() {
        /*3. Conversor de Celsius a Fahrenheit
                BÁSICO
        Pide una temperatura en grados Celsius y conviértela a Fahrenheit,
        mostrando el resultado con dos
        decimales.
                Pista: La fórmula es F = (C × 9/5) + 32. Para mostrar solo dos
                decimales investiga String.format("%.2f", valor) o printf.*/

        //declarando variables
        double celsius;
        double fahrenheit;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CONVERSOR DE CELCIUS A FAHRENHEIT");
        System.out.println("Ingresa la temperatura en grados Celsius: ");
        celsius = order.nextDouble();

        //cálculo
        fahrenheit = (celsius * 9 /5) + 32;

        //salida de datos
        System.out.println("La temperatura en fahrenheit es: " + String.format("%.2f", fahrenheit)+ "°F");

        order.close();
    }
}
