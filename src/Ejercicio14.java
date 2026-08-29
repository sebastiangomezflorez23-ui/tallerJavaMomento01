import java.util.Scanner;

public class Ejercicio14 {
    static void main() {
        /*14. Descuento por monto de compra
INTERMEDIO
Pide el valor total de una compra y aplica: 0% si es menor a $50.000, 5% si está entre $50.000 y $150.000,
10% si está entre $150.001 y $300.000, y 15% si supera $300.000. Muestra el valor final a pagar.
Pista: Define el porcentaje de descuento en una variable double dentro de cada bloque condicional y aplícalo al final:
total - (total * descuento)*/

        //declarando variables
        double total;
        double descuento;
        double totalConDescuento;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("CALCULAR DESCUENTO POR MONTO DE COMPRA");
        System.out.println("Ingresa el valor total de la compra: ");
        total = order.nextDouble();

        //validación del porcentaje de descuento
        if (total < 50000) {
            descuento = 0.0;
        } else if (total <= 150000) {
            descuento = 0.05;
        } else if (total <= 300000) {
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }

        //cálculo
        totalConDescuento = total - (total * descuento);

        //salida de datos
        System.out.println("Descuento aplicado: " + String.format("%.0f", descuento * 100) + "%");
        System.out.println("Valor final a pagar: $" + String.format("%.2f", totalConDescuento));

        order.close();
    }
}
