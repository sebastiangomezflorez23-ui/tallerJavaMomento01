import java.util.Scanner;

public class Ejercicio13 {
    static void main() {
        /*13. Año bisiesto
CESDE · Segundo Semestre
INTERMEDIO
Pide un año y determina si es bisiesto. Un año es bisiesto si es divisible entre 4, excepto los divisibles entre
100, salvo que también sean divisibles entre 400.
Pista: Combina condicionales anidados con operadores lógicos && y ||. Piensa primero la regla en español, luego
tradúcela paso a paso a código.*/

        //declarando variables
        int anio;
        boolean esBisiesto;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR SI UN AÑO ES BISIESTO");
        System.out.println("Ingresa un año: ");
        anio = order.nextInt();

        //validación
        esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        //salida de datos
        if (esBisiesto) {
            System.out.println("El año " + anio + " SÍ es bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }

        order.close();
    }
}
