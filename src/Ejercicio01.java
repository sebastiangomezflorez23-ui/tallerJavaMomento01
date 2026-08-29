import java.util.Scanner;

public class Ejercicio01 {
    static void main() {

        //1.Mi primera variable en Java

        //declarando variables
        int edad;
        String nombre;
        double estatura;
        boolean matricula;

        //scanner
        Scanner order = new Scanner(System.in);

        //pedir datos
        System.out.println("Escribe el nombre...");
        nombre = order.next();
        System.out.println("Escribe la edad");
        edad = order.nextInt();
        System.out.println("Escribe la estatura: ");
        estatura = order.nextDouble();
        System.out.println("¿Esta matriculado?");
        matricula = order.nextBoolean();

        //salida de datos
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
        System.out.println("Esta matriculado: "+matricula);
    }
}
