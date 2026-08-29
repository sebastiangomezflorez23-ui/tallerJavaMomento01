import java.util.Scanner;

public class Ejercicio09 {
    static void main() {
        /*9. Mayoría de edad
        Pide la edad de una persona e indica si es mayor o menor de edad (18 años).
        Pista: Un solo if/else basta. Cuidado con usar >= en vez de > al comparar con 18.*/

        //declarando variables
        int edad;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("DETERMINAR MAYORÍA DE EDAD");
        System.out.println("Ingresa tu edad:");
        edad = order.nextInt();

        //validación y salida de datos
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        order.close();

    }
}
