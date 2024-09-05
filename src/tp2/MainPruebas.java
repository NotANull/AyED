package tp2;

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

        //OTRO ÁRBOL...

        BinaryTree<Integer> root = new BinaryTree<>(1);
        BinaryTree<Integer> left = new BinaryTree<>(2);
        BinaryTree<Integer> right = new BinaryTree<>(3);
        BinaryTree<Integer> leftLeft = new BinaryTree<>(4);
        BinaryTree<Integer> rightRight = new BinaryTree<>(5);

        root.addLeftChild(left);
        root.addRightChild(right);
        left.addLeftChild(leftLeft);
        right.addRightChild(rightRight);

        //----------EJERCICIO 2a----------\\
        System.out.println("Cantidad de hojas del árbol Binario ab: " + ab.contarHojas());
        System.out.println("Cantidad de hojas del árbol Binario root: " + root.contarHojas());

    }


}
