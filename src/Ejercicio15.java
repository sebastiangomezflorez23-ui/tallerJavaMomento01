import java.util.Scanner;

public class Ejercicio15 {
    static void main() {
        /*15. El mayor de tres números
INTERMEDIO
Pide tres números enteros y determina cuál es el mayor, usando únicamente condicionales anidados (sin usar
Math.max).
Pista: Compara el primero contra el segundo; dentro de cada caso, compara el 'ganador' contra el tercero. Son dos
niveles de anidamiento.*/

        //declarando variables
        int numero1;
        int numero2;
        int numero3;
        int mayor;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR EL MAYOR DE TRES NÚMEROS");
        System.out.println("Ingresa el primer número: ");
        numero1 = order.nextInt();
        System.out.println("Ingresa el segundo número: ");
        numero2 = order.nextInt();
        System.out.println("Ingresa el tercer número: ");
        numero3 = order.nextInt();

        //validación anidada
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                mayor = numero1;
            } else {
                mayor = numero3;
            }
        } else {
            if (numero2 > numero3) {
                mayor = numero2;
            } else {
                mayor = numero3;
            }
        }

        //salida de datos
        System.out.println("El mayor de los tres números es: " + mayor);

        order.close();
    }
}
