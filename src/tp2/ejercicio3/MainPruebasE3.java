package tp2.ejercicio3;

import tp2.BinaryTree;

import java.util.List;

public class MainPruebasE3 {

    public static void main(String[] args) {

        BinaryTree<Integer> hi = new BinaryTree<>(2);
        hi.addLeftChild(new BinaryTree<>(4));
        hi.addRightChild(new BinaryTree<>(5));

        BinaryTree<Integer> hd = new BinaryTree<>(3);
        hd.addLeftChild(new BinaryTree<>(6));

        BinaryTree<Integer> ab = new BinaryTree<>(1);
        ab.addLeftChild(hi);
        ab.addRightChild(hd);

        //Recorrido InOrden
        /*List<Integer> listaPares = new ContadorArbol(ab).numerosPares();
        System.out.println("NÚMEROS PARES");
        for(Integer n : listaPares) {
            System.out.print(n + " - ");
        }*/

        //Recorrido PostOrden
        List<Integer> listaPares = new ContadorArbol(ab).numerosPares();
        System.out.println("NÚMEROS PARES");
        for(Integer n : listaPares) {
            System.out.print(n + " - ");
        }

    }

}
