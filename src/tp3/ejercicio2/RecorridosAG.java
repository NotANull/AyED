package tp3.ejercicio2;

import tp3.GeneralTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RecorridosAG {

    public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n){
        List<Integer> lista = new ArrayList<>();
        if ( (a != null) && (!a.isEmpty()) ) {
            recorrerArbolPreOrden(a, n, lista);
        }
        return lista;
    }

    private void recorrerArbolPreOrden(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
        if ( (a.getData() % 2 != 0 ) && (a.getData() > n) ) {
            lista.add(a.getData());
        }
        if (a.hasChildren()) {
            List<GeneralTree<Integer>> hijos = a.getChildren();
            Iterator<GeneralTree<Integer>> it = hijos.iterator();
            while (it.hasNext()) {
                GeneralTree<Integer> hijoActual = it.next();
                recorrerArbolPreOrden(hijoActual, n, lista);
            }
        }
    }

}
