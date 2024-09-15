package tp2.ejercicio2;

import tp2.BinaryTree;

public class MainPruebas {

    public static void main(String[] args) {

        //Creación del árbol binario
        BinaryTree<Integer> ab = new BinaryTree<>(1);

        BinaryTree<Integer> hi = new BinaryTree<>(2);
        hi.addLeftChild(new BinaryTree<>(4));
        hi.addRightChild(new BinaryTree<>(5));

        BinaryTree<Integer> hd = new BinaryTree<>(3);
        hd.addLeftChild(new BinaryTree<>(6));

        ab.addLeftChild(hi);
        ab.addRightChild(hd);

        //----------EJERCICIO 2a----------\\
        System.out.println("Cantidad de hojas del árbol Binario ab: " + ab.contarHojas());

    }


}
