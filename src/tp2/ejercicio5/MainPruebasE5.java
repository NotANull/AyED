package tp2.ejercicio5;

import tp2.BinaryTree;

public class MainPruebasE5 {

    public static void main(String[] args) {

        BinaryTree<Integer> hi = new BinaryTree<>(3);
        hi.addLeftChild(new BinaryTree<>(8));
        hi.addRightChild(new BinaryTree<>(12));

        BinaryTree<Integer> hd = new BinaryTree<>(4);
        hd.addLeftChild(new BinaryTree<>(11));
        hd.addRightChild(new BinaryTree<>(2));

        BinaryTree<Integer> ab = new BinaryTree<>(7);
        ab.addLeftChild(hi);
        ab.addRightChild(hd);

        System.out.println("Suma de los nodos que se encuentran en profundidad: " + new ProfundidadDeArbolBinario(ab).sumaElementosProfundidad(0));
    }
}
