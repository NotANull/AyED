package tp2.ejercicio4;

import tp2.BinaryTree;

public class MainPruebasE4 {

    public static void main(String[] args) {

        //SUBÁRBOL IZQUIERDO IZQUIERDO
        BinaryTree<Integer> hi2i = new BinaryTree<>(5);
        hi2i.addLeftChild(new BinaryTree<>(7));
        hi2i.addRightChild(new BinaryTree<>(8));

        //SUBÁRBOL IZQUIERDO DERECHO
        BinaryTree<Integer> hi2d = new BinaryTree<>(4);
        hi2d.addLeftChild(new BinaryTree<>(5));
        hi2d.addRightChild(new BinaryTree<>(6));

        BinaryTree<Integer> hi = new BinaryTree<>(2);
        hi.addLeftChild(hi2i);
        hi.addRightChild(hi2d);

        //SUBÁRBOL DERECHO IZQUIERDO
        BinaryTree<Integer> hd2i = new BinaryTree<>(9);
        hd2i.addLeftChild(new BinaryTree<>(12));
        hd2i.addRightChild(new BinaryTree<>(8));

        //SUBÁRBOL DERECHO DERECHO
        BinaryTree<Integer> hd2d = new BinaryTree<>(8);
        hd2d.addLeftChild(new BinaryTree<>(2));
        hd2d.addRightChild(new BinaryTree<>(1));

        BinaryTree<Integer> hd = new BinaryTree<>(3);
        hd.addLeftChild(hd2i);
        hd.addRightChild(hd2d);

        //RAÍZ
        BinaryTree<Integer> ab = new BinaryTree<>(10);
        ab.addLeftChild(hi);
        ab.addRightChild(hd);

        System.out.println("Mayor retardo posible: " + new RedBinariaLlena().retardoReenvio(ab));
    }
}
