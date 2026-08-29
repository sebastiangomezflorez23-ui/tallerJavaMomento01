import java.util.Scanner;

public class Ejercicio34 {
    static void main() {
        /*34. Contar pares en un arreglo
BÁSICO
Declara un arreglo de 10 enteros, llénalo con datos ingresados por el usuario y cuenta cuántos de sus
elementos son pares.
Pista: Combina lo aprendido: recorre el arreglo con for y, dentro del ciclo, usa un condicional con el operador % para
saber si numeros[i] es par; si lo es, incrementa un contador*/

        //declarando el arreglo
        int[] numeros = new int[10];

        //declarando variables
        int contadorPares;

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando el arreglo
        System.out.println("CONTAR PARES EN UN ARREGLO");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el número en la posición " + i + ": ");
            numeros[i] = order.nextInt();
        }

        //variable contadora
        contadorPares = 0;

        //recorriendo el arreglo para contar pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        //salida de datos
        System.out.println("\nCantidad de números pares en el arreglo: " + contadorPares);

        order.close();
    }
}
