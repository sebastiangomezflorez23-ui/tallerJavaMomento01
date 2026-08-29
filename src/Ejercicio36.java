import java.util.Scanner;

public class Ejercicio36 {
    static void main() {
        /*36. Mi primera matriz
CESDE · Segundo Semestre
INTERMEDIO
Declara una matriz (arreglo bidimensional) de 3x3 enteros. Llénala con datos ingresados por el usuario
usando dos ciclos for anidados, y luego muéstrala completa con el mismo formato de filas y columnas.
Pista: Se declara así: int[][] matriz = new int[3][3];. El for externo recorre las filas (i) y el for interno recorre las
columnas (j); accedes a cada posición con matriz[i][j]*/

        //declarando la matriz
        int[][] matriz = new int[3][3];

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando la matriz con ciclos anidados
        System.out.println("MI PRIMERA MATRIZ (3x3)");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingresa el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = order.nextInt();
            }
        }

        //mostrando la matriz completa
        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); //salto de línea al terminar cada fila
        }

        order.close();
    }
}
