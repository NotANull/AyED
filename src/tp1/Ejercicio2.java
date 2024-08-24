/*
    Escriba un métod de clase dado un número n devuelva un nuevo arreglo de tamaño n con los n primeros
    múltiplos enteros de n mayores o iguales que 1.

        Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k}

    Agregue al programa la posibilidad de probar con distintos valores de n ingresándolos por teclado,
    mediante el uso de System.in. La clase Scanner permite leer de forma sencilla valores de entrada.
*/
package tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static List<Integer> generarArray(int n) {

        List<Integer> listaEnteros = new ArrayList<>();

        insertar(listaEnteros, 0, n);

        return listaEnteros;

    }

    private static void insertar(List<Integer> listaEnteros, int i, int n) {

        if (i < n) {
            listaEnteros.add(n * (i+1));
            insertar(listaEnteros, (i+1), n);
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();
        List<Integer> listaEnteros = generarArray(n);

        System.out.println("\nLista de números desde " + n + " hasta " + (n*n));
        for (Integer dato : listaEnteros) {
            System.out.print(dato + " - ");
        }

        teclado.close();

    }

}
