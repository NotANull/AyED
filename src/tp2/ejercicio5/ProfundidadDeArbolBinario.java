package tp2.ejercicio5;

import tp2.BinaryTree;

public class ProfundidadDeArbolBinario {

    private BinaryTree<Integer> ab;

    public ProfundidadDeArbolBinario() {
    }

    public ProfundidadDeArbolBinario(BinaryTree<Integer> ab) {
        this.ab = ab;
    }

    public int sumaElementosProfundidad(int p) {
        return recorrerAB(this.ab, p);
    }

    private int recorrerAB(BinaryTree<Integer> ab, int p) {
        if (ab == null) {
            return 0;
        }
        if (p == 0) {
            return ab.getData();
        }
        return recorrerAB(ab.getRightChild(), p-1) + recorrerAB(ab.getLeftChild(), p-1);
    }
}