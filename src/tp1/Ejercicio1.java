/*
    Escriba tres métodos de clase (static) que reciban por parámetro dos números enteros
    (tipo int) a y b e impriman todos los números enteros comprendidos entre a; b (inclusive), uno
    por cada línea en la salida estándar. Para ellos, dentro de una nueva clase escriba un métod
    por cada uno de los siguientes incisos:
        a. Que realice lo pedido con un for.
        b. Que realice lo pedido con un while.
        c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do while).

    Por último, escriba en el métod de clase main el llamado de cada uno de los métodos creados, con
    valores de ejemplo. En su computadora, ejecute el programa y verifique que se cumple con lo pedido.
 */

package tp1;

public class Ejercicio1 {

    public static void recorridoPorFor(int a, int b) {

        System.out.println("RECORRIDO POR FOR");
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }

    }

    public static void recorridoPorWhile(int a, int b) {

        System.out.println("\nRECORRIDO POR WHILE");
        int i = a;
        while(i <= b) {
            System.out.println(i);
            i++;
        }

    }

    public static void recorridoPorRecursion(int a, int b) {

        if (a <= b) {
            System.out.println(a);
            recorridoPorRecursion((a+1), b);
        }

    }

    public static void main(String[] args) {

        recorridoPorFor(5, 10);
        recorridoPorWhile(2, 7);
        System.out.println("\nRECORRIDO POR RECURSIÓN");
        recorridoPorRecursion(1, 5);

    }
}
