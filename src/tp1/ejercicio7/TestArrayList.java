/*
    Uso de las estructuras de listas provistas por la API de Java.

        a.  Escriba una clase llamada TestArrayList cuyo métod main recibe una secuencia
            de números, los agrega a una lista de tipo ArrayList, y luego de haber agregado
            todos los números a la lista, imprime el contenido en la misma iterando sobre
            cada elemento.

        b.  Si en lugar de usar un ArrayList en el inciso anterior hubiera usado un LinkedList
            ¿Qué diferencia encuentra respecto de la implementación? Justifique

        c. ¿Existen otras alternativas para recorrer los elementos de la lista del punto 7a?

        d. Escriba un métod que realice las siguientes acciones:
            i. cree una lista que contenga 3 estudiantes.
            ii. genere una nueva lista que sea una copia de la lista del inciso i.
            iii. imprima el contenido de la lista original y el contenido de la nueva lista.
            iv. modifique algún dato de los estudiantes.
            v. vuelva a imprimir el contenido de la lista original y el contenido de la nueva lista.
                ¿Qué conclusiones obtiene a partir de lo realizado?
            vi. ¿Cuántas formas de copiar una lista existen?¿Qué diferencias existen entre ellas?
 */

package tp1.ejercicio7;

import tp1.ejercicio3.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

    public static boolean isCapicua(List n, int pri, int ult) {
        if (pri >= ult) {
            return true;
        }
        if (!n.get(pri).equals(n.get(ult))) {
            return false;
        }

        return isCapicua(n, (pri+1), (ult-1));
    }

    public static List<Integer> calcularSucesion(int n) {
        List<Integer> listaEnteros = new ArrayList<>();
        procesarNumeros(listaEnteros, n);
        return listaEnteros;
    }

    private static void procesarNumeros(List<Integer> listaEnteros, int n) {
        listaEnteros.add(n);
        if(n == 1) {
            return;
        }
        if ((n % 2) == 0) {
            procesarNumeros(listaEnteros, n/2);
        } else {
            procesarNumeros(listaEnteros, (3*n)+1);
        }
    }

    public static void invertirArrayList(List lista, int pri, int ult) {
        if (pri > ult) {
            return;
        }

        int aux = (int) lista.get(pri);
        lista.set(pri, lista.get(ult));
        lista.set(ult, aux);

        invertirArrayList(lista, (pri+1), (ult-1));
    }

    public static void main(String[] args) {
        /*
        //--------Inciso a--------\\

        Scanner teclado = new Scanner(System.in);
        List<Integer> listaEnteros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Agregue un número a la lista de enteros: ");
            listaEnteros.add(teclado.nextInt());
        }

        for (Integer dato : listaEnteros) {
            System.out.print(dato + "-");
        }

        //--------Inciso b--------\\

        List<Estudiante> listaEstudiantes = List.of(
                new Estudiante("Cosme", "Fulanito", "cosme.fulanito@email.com", "1", "Calle Falsa 123"),
                new Estudiante("Armando", "Barreda", "armando.barreda@email.com", "2", "p sherman calle wallaby 42 sidney"),
                new Estudiante("Frank", "Grimes", "frank.grimes@email.com", "3", "Avenida Siempre Viva 742 Springfield")
        );

        List<Estudiante> listaEstudiantesCopia = new ArrayList<>();
        listaEstudiantesCopia.addAll(listaEstudiantes);

        System.out.println("\nLISTA ORIGINAL DE ESTUDIANTES");
        for (Estudiante dato : listaEstudiantes) {
            System.out.println(dato);
        }

        System.out.println("\nLISTA COPIA DE ESTUDIANTES");
        for (Estudiante dato : listaEstudiantesCopia) {
            System.out.println(dato);
        }

        listaEstudiantes.get(0).setNombre("Omar");
        listaEstudiantes.get(0).setApellido("Salum");
        listaEstudiantes.get(0).setEmail("omar.salum@email.com");
        listaEstudiantes.get(0).setComision("0");
        listaEstudiantes.get(0).setDireccion("Alguna dirección");

        System.out.println("\nLISTA ORIGINAL DE ESTUDIANTES");
        for (Estudiante dato : listaEstudiantes) {
            System.out.println(dato);
        }

        System.out.println("\nLISTA COPIA DE ESTUDIANTES");
        for (Estudiante dato : listaEstudiantesCopia) {
            System.out.println(dato);
        }

        //--------Inciso f--------\\
        if(isCapicua(listaEnteros, 0, listaEnteros.size()-1)) {
            System.out.println("Es capicúa");
        }


        //--------Inciso g--------\\
        List<Integer> lista = calcularSucesion(6);
        System.out.println("Sucesión de números");
        for (Integer dato : lista) {
            System.out.print(dato + " - ");
        }

         */

        //--------Inciso h--------\\
        ArrayList<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(3);
        listaOriginal.add(0);
        listaOriginal.add(1);
        listaOriginal.add(1);
        listaOriginal.add(9);
        listaOriginal.add(9);
        listaOriginal.add(5);
        invertirArrayList(listaOriginal, 0, listaOriginal.size()-1);
        System.out.println("Lista Invertida");
        for (Integer n : listaOriginal) {
            System.out.print(n + " - ");
        }
    }

}

/*
    b.  La diferencia sería la forma de almacenar los datos, si bien ambas clases implementan
        los métodos de la interfaz List, cada una tiene su forma de almacenar. ArrayList
        es más eficiente para acceder a elementos por índice, mientras que LinkedList es más
        eficiente para insertar o eliminar elementos en posiciones intermedias.

    c.  Existen varias formas de recorrer una lista:

            1.  For con índice: permite acceder a los elementos directamente a través de su posición.
            2.  for each: es útil cuando no se quiere acceder al índice de los elementos y solo se
                quiere iterar cada uno de ellos.
            3.  Iterator: utiliza un objeto Iterator para recorrer la lista.
            4.  API Stream: es una forma funcional y declarativa para recorrer y procesar los elementos
                de la lista.

    d-v.  Al copiar una lista de objetos en Java, la copia no crea nuevos objetos, sino que ambas listas
          apuntan a los mismos objetos en memoria. Esto significa que si se modifica un objeto a través de
          una lista, el cambio también se verá reflejado en la otra lista, ya que ambas listas contienen
          referencias a los mismos objetos.
*/
