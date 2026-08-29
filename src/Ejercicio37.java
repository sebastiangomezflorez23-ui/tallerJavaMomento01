import java.util.Scanner;

public class Ejercicio37 {
    static void main() {
        /*37. Suma de filas y columnas de una matriz
INTERMEDIO
Usando una matriz de 3x3 llenada con datos del usuario, calcula y muestra la suma de los valores de cada fila
y la suma de los valores de cada columna por separado.
Pista: Para sumar por filas, fija i y recorre j con un ciclo. Para sumar por columnas, fija j y recorre i con otro ciclo.
Necesitarás una variable acumuladora distinta para cada fila o columna que proceses.*/

        //declarando la matriz
        int[][] matriz = new int[3][3];

        //declarando variables
        int sumaFila;
        int sumaColumna;

        //scanner
        Scanner order = new Scanner(System.in);

        //llenando la matriz con ciclos anidados
        System.out.println("SUMA DE FILAS Y COLUMNAS DE UNA MATRIZ (3x3)");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingresa el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = order.nextInt();
            }
        }

        //calculando y mostrando la suma de cada fila
        System.out.println("\n--- SUMA POR FILAS ---");
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }

        //calculando y mostrando la suma de cada columna
        System.out.println("\n--- SUMA POR COLUMNAS ---");
        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + j + ": " + sumaColumna);
        }

        order.close();
    }
}
