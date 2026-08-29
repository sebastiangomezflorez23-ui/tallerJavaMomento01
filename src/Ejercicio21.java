public class Ejercicio21 {
    static void main() {
        /*21. Tabla de multiplicar completa (ciclos anidados)
INTERMEDIO
Usa dos ciclos for anidados para imprimir las tablas de multiplicar del 1 al 10 completas, una después de otra.
Pista: El for externo controla el número de la tabla (1 a 10); el for interno controla el multiplicador (1 a 10). Por cada
vuelta del externo, el interno se ejecuta completo*/

        //ciclo externo (número de la tabla)
        for (int tabla = 1; tabla <= 10; tabla++) {

            System.out.println("--- Tabla del " + tabla + " ---");

            //ciclo interno (multiplicador)
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }

            System.out.println(); //línea en blanco entre tablas
        }
    }
}
