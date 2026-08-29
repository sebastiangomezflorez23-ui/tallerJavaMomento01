import java.util.Scanner;

public class Ejercicio28 {
    static void main() {
        /*28. Invertir los dígitos de un número
CESDE · Segundo Semestre
INTERMEDIO
Pide un número entero positivo y muestra sus dígitos invertidos (por ejemplo, 1234 se convierte en 4321),
usando operaciones aritméticas y un ciclo while.
Pista: En cada vuelta obtén el último dígito con número % 10, agrégalo al número invertido (invertido = invertido*10 +
digito) y reduce el número original con número /= 10, hasta que sea 0*/

        //declarando variables
        int numero;
        int invertido;
        int digito;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("INVERTIR LOS DÍGITOS DE UN NÚMERO");
        System.out.println("Ingresa un número entero positivo: ");
        numero = order.nextInt();

        //guardando el número original para mostrarlo al final
        int numeroOriginal = numero;

        //variable acumuladora
        invertido = 0;

        //ciclo while
        while (numero != 0) {
            digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        //salida de datos
        System.out.println("El número " + numeroOriginal + " invertido es: " + invertido);

        order.close();
    }
}
