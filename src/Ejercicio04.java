import java.util.Scanner;

public class Ejercicio04 {
    static void main(String[] args) {
        /*4. Área de un círculo
        BÁSICO
        Solicita el radio de un círculo y calcula su área y su circunferencia usando el valor de PI.
        Pista: Java trae la constante Math.PI ya definida; no necesitas escribir 3.1416 a mano. Área = PI × radio²; usa
        Math.pow(radio, 2) o simplemente radio*radio*/

        //declarando variables
        double radio;
        double area;
        double circunferencia;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULAR AREA Y CIRCUNFERENCIA DE UN CÍRCULO");
        System.out.println("Ingresa el radio: ");
        radio = order.nextDouble();

        //calculo
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;

        //salida de datos
        System.out.println("El area es: "+ String.format("%.2f", area));
        System.out.println("La circunferencia es: "+ String.format("%.2f", circunferencia));

        order.close();





    }
}
