/*
    Dado un arreglo de valores de tipo entero se desea calcular el valor máximo, mínimo y promedio
    en un único métod. Escriba tres métodos de clase, donde respectivamente.
        a.  Devuelva lo pedido por el mecanismo de retorno de un métod en Java ("return").
        b.  Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de tipo arreglo).
        c.  Devuelva lo pedido sin usar parámetros ni la sentencia "return".
*/

package tp1;

public class Ejercicio5 {

    private static String procesarArreglo1(int[] arregloEnteros) {

        int max = -1;
        int min = 9999;
        int total = 0;

        for (int n : arregloEnteros) {
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }

            total+= n;
        }

        arregloEnteros[0] = 10;

        return "Número máximo: " + max +
               "\nNúmero mínimo: " + min +
               "\nPromedio: " + (total / arregloEnteros.length);

    }

    public static void procesarArreglo2(int[] arregloEnteros, Objeto o) {

        int total = 0;

        for (int n : arregloEnteros) {
            if (n > o.getMax()) {
                o.setMax(n);
            }

            if (n < o.getMin()) {
                o.setMin(n);
            }

            total+= n;

        }

        o.setPromedio(total / arregloEnteros.length);
    }

    public static void main(String[] args) {

        int[] arregloEnteros = {5, 15, -4, 4, 6};

        System.out.println("UTILIZANDO RETURN\n" + procesarArreglo1(arregloEnteros));

        Objeto o = new Objeto();
        procesarArreglo2(arregloEnteros, o);
        System.out.println("UTILIZANDO PARÁMETRO\n" + o);

    }

}

class Objeto {

    private int max = -1;
    private int min = 9999;
    private int promedio = 0;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Valor máximo: " + this.getMax() +
               "\nValor mínimo: " + this.getMin() +
               "\nPromedio: " + this.getPromedio();
    }

}
