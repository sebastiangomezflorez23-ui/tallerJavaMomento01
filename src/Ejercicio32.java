import java.util.Scanner;

public class Ejercicio32 {
    static void main() {
        /*32. Suma y promedio de un arreglo
BÁSICO
Declara un arreglo de 10 enteros, llénalo con datos ingresados por el usuario y calcula la suma total y el
promedio de sus elementos.
Pista: Recorre el arreglo con un for y usa una variable acumuladora (suma += numeros[i]), igual que hiciste en los
ejercicios de ciclos, pero ahora leyendo desde el arreglo en lugar de pedir el dato en cada vuelta.*/

        //declarando el arreglo
        int[] numeros = new int[10];

        //declarando variables
        int suma;
        double promedio;

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("SUMA Y PROMEDIO DE UN ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //variable acumuladora
        suma = 0;

        //recorriendo el arreglo para sumar
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        //cálculo
        promedio = (double) suma / numeros.length;

        //salida de datos
        System.out.println("\nLa suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + String.format("%.2f", promedio));

        order.close();
    }
}
