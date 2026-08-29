public class Ejercicio39 {
    static void main() {
        /*39. Modularidad: método calcularAreaRectangulo
BÁSICO
Crea un método llamado calcularAreaRectangulo que reciba base y altura (double) como parámetros y
retorne el área calculada. Invócalo desde main() con distintos pares de valores y muestra los resultados.
Pista: El método retorna un double: public static double calcularAreaRectangulo(double base, double altura) { return
base * altura; }. Piensa en un método como una 'caja negra' reutilizable: recibe datos de entrada y entrega un
resultado, sin necesidad de repetir la fórmula cada vez.*/

        //invocando el método con distintos pares de valores
        double area1 = calcularAreaRectangulo(5.0, 3.0);
        double area2 = calcularAreaRectangulo(10.5, 4.2);
        double area3 = calcularAreaRectangulo(7.0, 7.0);

        System.out.println("MODULARIDAD: MÉTODO calcularAreaRectangulo");
        System.out.println("Área (base 5.0, altura 3.0): " + String.format("%.2f", area1));
        System.out.println("Área (base 10.5, altura 4.2): " + String.format("%.2f", area2));
        System.out.println("Área (base 7.0, altura 7.0): " + String.format("%.2f", area3));
    }

    //método calcularAreaRectangulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
