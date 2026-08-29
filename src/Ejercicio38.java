public class Ejercicio38 {
    static void main() {
        /*38. Modularidad: método esParPositivo
BÁSICO
Crea un método llamado esPar que reciba un número entero como parámetro y retorne un valor boolean
indicando si es par. Invócalo desde main() con al menos tres números distintos.
Pista: La firma del método es algo como: public static boolean esPar(int numero) { ... return numero % 2 == 0; }. Todo
método que uses desde main() sin crear un objeto debe llevar static, igual que main().*/

        //invocando el método con tres números distintos
        int numero1 = 8;
        int numero2 = 15;
        int numero3 = 42;

        System.out.println("MODULARIDAD: MÉTODO esPar");
        System.out.println("¿" + numero1 + " es par? " + esPar(numero1));
        System.out.println("¿" + numero2 + " es par? " + esPar(numero2));
        System.out.println("¿" + numero3 + " es par? " + esPar(numero3));
    }

    //método esPar
    public static boolean esPar(int numero) {
        return numero % 2 == 0;


    }
}
