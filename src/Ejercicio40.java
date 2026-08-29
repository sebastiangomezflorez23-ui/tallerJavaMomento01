import java.util.Scanner;

public class Ejercicio40 {
    static void main() {
        /*40. Integrador: arreglos + modularidad
INTERMEDIO
Crea un método llamado calcularPromedio que reciba un arreglo de enteros como parámetro y retorne el
promedio de sus elementos (double). Desde main(), declara un arreglo de 5 números, llénalo con datos del
usuario y muestra el resultado invocando tu método.
Pista: Un arreglo se puede pasar como parámetro igual que cualquier otro tipo: public static double
calcularPromedio(int[] numeros) { ... }. Dentro del método, recorre el arreglo recibido con arreglo.length para saber
cuántos elementos tiene, sin necesidad de pasar ese dato por separado*/

        //declarando el arreglo
        int[] numeros = new int[5];

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("INTEGRADOR: ARREGLOS + MODULARIDAD");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //invocando el método y mostrando el resultado
        double promedio = calcularPromedio(numeros);
        System.out.println("\nEl promedio de los elementos del arreglo es: " + String.format("%.2f", promedio));

        order.close();
    }

    //método calcularPromedio
    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
}
