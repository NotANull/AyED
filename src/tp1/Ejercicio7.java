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

        e.  A la lista del punto7d, agregue un nuevo estudiante. Antes de agregar, verifique que el
            estudiante no estaba incluído en la lista.

        f.  Escriba un métod que devuelva verdadero o falso si la secuencia almacenada en la lista es
            o no capicúa.

        g.  Considere que se aplica la siguiente función de forma recursiva. A partir de un número n
            positivo se obtiene una sucesión que termina en 1.

                f(n) = { n/2 si n es par, 3n+1 si n es impar.
                Por ejemplo, para n = 6, se obtiene la siguiente sucesión:
                f(6) = 6/2 = 3
                f(3) = 3*3 + 1 = 10
                f(10) = 10/2 = 5
                ...
                ...

                Es decir, la sucesión 6, 3, 10, 5, 16, 8, 4, 2, 1 para cualquier n con el que se arranque siempre
                se llegará a 1.

        h.  Implemente un métod recursivo que invierta el orden de los elementos en un ArrayList.
                public void invertirArray(ArrayList<Integer> lista)

        i.  Implemente un métod recursivo que calcule la suma de los elementos en un LinkedList.
                public int sumarLinkedList(LinkedList<Integer> lista)

                Si quiero utilizar la clase LinkedList, al pasar por parámetro la lista se verá modificada porque
                no hay métod que devuelva el elemento sin eliminarlo. A no ser que le pase por parámetro un índice
                y obtener el elemento sin eliminarlo con el métod get()

        j.  Implemente el métod combinarOrdenado que reciba 2 lista de números ordenados y devuelva una nueva lista
            también ordenada conteniendo los elementos de las 2 listas.
                public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2)
 */

package tp1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio7 {

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

    public static int sumarLinkedList(LinkedList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        return lista.removeFirst() + sumarLinkedList(lista);
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

         */

        //--------Inciso i--------\\
        LinkedList<Integer> listaLinkedListNumeros = new LinkedList<>();
        listaLinkedListNumeros.add(1);
        listaLinkedListNumeros.add(3);
        listaLinkedListNumeros.add(0);
        listaLinkedListNumeros.add(1);
        listaLinkedListNumeros.add(1);
        listaLinkedListNumeros.add(9);
        listaLinkedListNumeros.add(9);
        listaLinkedListNumeros.add(5);
        System.out.println("La suma de los números es: " + sumarLinkedList(listaLinkedListNumeros));
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
