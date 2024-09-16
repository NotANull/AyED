package tp2.ejercicio3;

import tp2.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {

    private BinaryTree<Integer> ab;

    public ContadorArbol() {
    }

    public ContadorArbol(BinaryTree<Integer> ab) {
        this.ab = ab;
    }

    public List<Integer> numerosPares() {
        List<Integer> listaPares = new ArrayList<>();
        //procesarABInOrden(this.ab, listaPares);
        procesarABPostOrden(this.ab, listaPares);
        return listaPares;
    }

    private void procesarABPostOrden(BinaryTree<Integer> ab, List<Integer> listaPares) {
        if (ab.isEmpty()) {
            return;
        } else {
            if (ab.hasLeftChild()) {
                procesarABPostOrden(ab.getLeftChild(), listaPares);
            }
            if (ab.hasRightChild()) {
                procesarABPostOrden(ab.getRightChild(), listaPares);
            }
            if ( (ab.getData() % 2) == 0) {
                listaPares.add(ab.getData());
            }
        }
    }

    private void procesarABInOrden(BinaryTree<Integer> ab, List<Integer> listaPares) {
        if (ab.isEmpty()) {
            return;
        } else {
            if (ab.hasLeftChild()) {
                procesarABInOrden(ab.getLeftChild(), listaPares);
            }
            if ( (ab.getData() % 2) == 0) {
                listaPares.add(ab.getData());
            }
            if (ab.hasRightChild()) {
                procesarABInOrden(ab.getRightChild(),listaPares);
            }
        }
    }

}
