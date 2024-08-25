/*
    Pasaje de parámetros en Java

        a.  Sin ejecutar el programa en su computadora, sólo analizándolo, indique qué
            imprime el código.

        b.  Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado
            en el inciso anterior.

        c.  Inserte un breakpoint en las líneas donde se indica (y = tmp) y ejecute en modo
            debug. ¿Los valores que adoptan las variables x, y coinciden con los valores
            impresos por consola?
*/

package tp1.ejercicio4;

public class Ejercicio4 {

    public static void swap1 (int x, int y) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
    }

    public static void swap2 (Integer x, Integer y) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
    }

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        Integer c = 3;
        Integer d = 4;
        swap1(a, b);
        swap2(c, d);
        System.out.println("a = " + a + ", b = " + b); //a = 1, b = 2
        System.out.println("c = " + c + ", d = " + d); //c = 3, d = 4

        /*
            Cuando se le envía los argumentos a y b al métod swap1 se les envía una copia de cada dato
            por lo que, a pesar que esos valores modifiquen en dicho métod, no serán modificados cuando
            termine de ejecutarse el métod.

            Ahora bien, lo mismo pasa cuando se le envía los argumentos c y d (que son de tipo wrapper) al
            métod swap2 pero a diferencia de los tipos de datos primitivos, se le envía una copia de la referencia del
            objeto. En este caso, al utilizar un tipo de dato Integer (wrapper), tampoco se modificará el dato ya que
            es un tipo de dato INMUTABLE lo que quiere decir que es aquel cuyo estado no puede cambiar después
            de haber sido creado, una vez instanciado el objeto con cierto valores no pueden ser modificados.

            Algunas características de un objeto inmutable:
                • Todos sus campos con finales.
                • No tiene métodos modificadores.
        */

    }

}
