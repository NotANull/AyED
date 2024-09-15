package tp2.ejercicio4;

import tp2.BinaryTree;

public class RedBinariaLlena {

    public int retardoReenvio(BinaryTree<Integer> ab) { //El enunciado dice que no recibe parámetros pero... 🤷‍♂️
        if(ab == null) { //Tendría que usar .isEmpty() pero me tira error
            return 0;
        }
        if(ab.isLeaf()) {
            return ab.getData();
        }
        int retardoIzquierdo = retardoReenvio(ab.getLeftChild());
        int retardoDerecho = retardoReenvio(ab.getRightChild());
        return ab.getData() + Math.max(retardoIzquierdo, retardoDerecho);
    }
}
