import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        /*12. Calculadora de IMC
INTERMEDIO
Pide peso (kg) y estatura (m), calcula el Índice de Masa Corporal (IMC = peso / estatura²) y clasifica el
resultado en: bajo peso (<18.5), normal (18.5–24.9), sobrepeso (25–29.9) u obesidad (>=30).
Pista: Con 4 categorías necesitas una cadena de if / else if / else if / else. Evalúa los rangos de menor a mayor para
no repetir comparaciones innecesarias.*/

        //declarando variables
        double peso;
        double estatura;
        double imc;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULADORA DE IMC");
        System.out.println("Ingresa el peso (kg): ");
        peso = order.nextDouble();
        System.out.println("Ingresa la estatura (m): ");
        estatura = order.nextDouble();

        //cálculo
        imc = peso / (estatura * estatura);

        //validación y salida de datos
        System.out.println("Tu IMC es: " + String.format("%.2f", imc));

        if (imc < 18.5) {
            System.out.println("Clasificación: BAJO PESO");
        } else if (imc < 25) {
            System.out.println("Clasificación: NORMAL");
        } else if (imc < 30) {
            System.out.println("Clasificación: SOBREPESO");
        } else {
            System.out.println("Clasificación: OBESIDAD");
        }

        order.close();


    }
}
