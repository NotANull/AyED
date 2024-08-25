/*
    Una pequeña observación acerca del ejercicio 4

    Si bien los tipos de datos que se utilizan en las variables c y d son un objeto, en
    este caso Integer, son inmutables ya que una vez instanciados con sus valores no se
    podrán modificar por lo que así como son son enviados por argumentos vuelven sin ser
    modificados.

    Si bien las líneas de código están:

    Integer c = 3;
    Integer d = 4;

    es lo mismo que hacer

    Integer c = new Integer(3);
    Integer c = new Integer(4);

    porque a pesar de que se declaren como si fueran un tipo de dato primitivo, en realidad se
    las está instanciando. Al principio, a los wrappers, se las declaraba con = new ...(); y
    en unas las versiones se las decidió reducir su declaración e instanciación.

    Así que veamos los siguiente, vamos a utilizar el mismo métod swap2 pero envíandole
    por argumento un tipo de dato objeto que NO SEA INMUTABLE.
    Hagamos de cuenta que tenemos un clase Persona declarada en otro archivo.
*/

package tp1.ejerecicio4;

public class Ejercicio4Observacion {

    public static void swap2 (Persona persona) {
        persona.nombre = "Fulanito";
    }

    public static void main(String[] args) {

        Persona p = new Persona("Cosme");
        System.out.println("Atributo ANTES de ser modificado" +
                "\nNombre: " + p.nombre);

        swap2(p);

        System.out.println("Atributo DESPUÉS de ser modificado" +
                "\nNombre: " + p.nombre);
    }

}

class Persona {
    String nombre; //El atributo tendría que ser privado pero es para el ejemplo

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
