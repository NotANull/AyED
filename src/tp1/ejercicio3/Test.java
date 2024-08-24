/*

    Creación de instancias mediante el uso del operador new

    a.  Cree una clase llamada Estudiante con los atributos especificados abajo y sus correspondientes
        métodos getters y setters
            • nombre
            • apellido
            • comision
            • email
            • direccion

    b.  Cree una clase llamada Profesor con los atributos especificados abajo y sus correspondientes
        métodos getters y setters
            • nombre
            • apellido
            • email
            • catedra
            • facultad

    c.  Agregue un métod de instancia llamada tusDatos() en la clase Estudiante y en la clase
        Profesor, que retorne un String con los datos de los atributos de las mismas. Para acceder
        a los valores de los atributos utilice los getters previamente definidos.

    d.  Escriba una clase llamada Test con el métod main, el cual cree un arreglo con 2 objetos
        Estudiante, otro arreglo con 3 objetos Profesor, y luego recorra ambos arreglos imprimiendo
        los valores obtenidos mediante el métod tusDatos(). Recuerde asignar los valores de los
        atributos de los objetos Estudiante y Profesor invocando los respectivos métodos setters.

    e.  Agregue dos breakpoints, uno en la línea donde itera sobre estudiantes y otro en la línea
        donde itera sobre los profesores.

    f.  Ejecute la clase Test en modo debug y avance paso a paso visualizando si el estudiante
        o profesor recuperado es lo esperado.

*/

package tp1.ejercicio3;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = List.of(
                new Estudiante("Omar", "Salum", "omar.salum@email.com", "10", "Calle Falsa 123"),
                new Estudiante("Cosme", "Fulanito", "cosme.fulanito@email.com", "5", "p sherman calle wallaby 42 sidney")
        );

        List<Profesor> listaProfesores = List.of(
                new Profesor("Armando", "Barreda", "armando.barreda@email.com", "alguna cátedra", "Ingeniería"),
                new Profesor("Frank", "Grimes", "frank.grimes@email.com", "alguna otra cátedra", "Físico"),
                new Profesor("Hombre", "Pay", "hombre.pay@email.com", "alguna que otra cátedra", "Medicina")

        );

        System.out.println("ESTUDIANTES");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.tusDatos());
        }

        System.out.println("\nPROFESORES");
        for (Profesor p : listaProfesores) {
            System.out.println(p.tusDatos());
        }

    }

}
