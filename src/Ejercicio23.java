import java.util.Scanner;

public class Ejercicio23 {
    static void main() {
        /*23. Menú con while
INTERMEDIO
Crea un menú de texto con 3 opciones (por ejemplo: sumar, restar, salir) que se repita con un ciclo while
hasta que el usuario elija la opción de salir.
Pista: Usa una variable bandera (por ejemplo un int opcion) que controle la condición del while, y un switch o if/else
dentro del ciclo para atender cada opción.*/

        //declarando variables
        int opcion;
        double num1;
        double num2;

        //scanner
        Scanner order = new Scanner(System.in);

        //variable bandera para controlar el ciclo
        opcion = 0;

        //ciclo while
        while (opcion != 3) {

            //mostrando el menú
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");
            opcion = order.nextInt();

            //atendiendo cada opción
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer número: ");
                    num1 = order.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    num2 = order.nextDouble();
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Ingresa el primer número: ");
                    num1 = order.nextDouble();
                    System.out.println("Ingresa el segundo número: ");
                    num2 = order.nextDouble();
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        order.close();
    }
}
