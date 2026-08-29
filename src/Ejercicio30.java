import java.util.Scanner;

public class Ejercicio30 {
    static void main() {
        /*30. Sistema de calificaciones (ejercicio integrador)
INTERMEDIO
Pide cuántos estudiantes hay en un curso (N). Con un ciclo, lee la nota de cada uno, acumula la suma total,
cuenta cuántos aprobaron (nota >= 3.0) y cuántos reprobaron, y al final muestra el promedio del curso junto
con el total de aprobados y reprobados.
Pista: Este ejercicio integra todo el taller: ciclo controlado por contador, acumulador de suma, dos contadores
adicionales (aprobados/reprobados) y condicionales dentro del ciclo. Resuélvelo por partes: primero el ciclo y la suma,
luego agrega los contadores*/

        //declarando variables
        int n;
        double nota;
        double suma;
        double promedio;
        int aprobados;
        int reprobados;

        //scanner
        Scanner order = new Scanner(System.in);

        //pidiendo datos
        System.out.println("SISTEMA DE CALIFICACIONES DEL CURSO");
        System.out.println("¿Cuántos estudiantes hay en el curso?: ");
        n = order.nextInt();

        //inicializando acumuladores y contadores
        suma = 0;
        aprobados = 0;
        reprobados = 0;

        //ciclo controlado por contador
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresa la nota del estudiante " + i + ": ");
            nota = order.nextDouble();

            //acumulando la suma
            suma = suma + nota;

            //contando aprobados y reprobados
            if (nota >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        //cálculo
        promedio = suma / n;

        //salida de datos
        System.out.println("\n--- RESULTADOS DEL CURSO ---");
        System.out.println("Promedio del curso: " + String.format("%.2f", promedio));
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        order.close();
    }
}
