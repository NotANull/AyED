package tp2;

import tp2.ejercicio2.Queue;

public class BinaryTree<T> {

    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;

    public BinaryTree() {
        super();
    }

    public BinaryTree(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public BinaryTree<T> getRightChild() {
        return this.rightChild;
    }

    public void addLeftChild(BinaryTree<T> child) {
        this.leftChild = child;
    }

    public void addRightChild(BinaryTree<T> child) {
        this.rightChild = child;
    }

    public void removeLeftChild() {
        this.leftChild = null;
    }

    public void removeRightChild() {
        this.rightChild = null;
    }

    public boolean isEmpty() {
        return (this.isLeaf() && this.getData() == null);
    }

    public boolean isLeaf() {
        return (!this.hasLeftChild() && !this.hasRightChild());
    }

    public boolean hasLeftChild() {
        return this.leftChild != null;
    }

    public boolean hasRightChild() {
        return this.rightChild != null;
    }

    @Override
    public String toString() {
        return this.getData().toString();
    }

    public int contarHojas() {
        if (this.isEmpty()) {
            return 0;
        }
        if (this.isLeaf()) {
            return 1;
        }
        int hojasIzquierdas = 0;
        int hojasDerechas = 0;
        if (this.hasLeftChild()) {
            hojasIzquierdas = this.leftChild.contarHojas();
        }
        if (this.hasRightChild()) {
            hojasDerechas = this.rightChild.contarHojas();
        }
        return (hojasIzquierdas + hojasDerechas);
    }

    public BinaryTree<T> espejo() {
        if (this.isEmpty()) {
            return null;
        }
        BinaryTree<T> nuevoArbol = new BinaryTree<>(this.data);
        if (this.hasRightChild()) {
            nuevoArbol.addLeftChild(this.getRightChild().espejo());
        }
        if (this.hasLeftChild()) {
            nuevoArbol.addRightChild(this.getLeftChild().espejo());
        }
        return nuevoArbol;
    }

    // 0<=n<=m
    public void entreNiveles(int n, int m) {
        BinaryTree<T> ab = null;
        Queue<BinaryTree<T>> cola = new Queue<>();
        int nivel = 0;
        cola.enqueue(this);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            ab = cola.dequeue();
            if (ab != null) {
                if ((nivel >= n) && (nivel <= m)) {
                    System.out.print(ab.getData());
                    if (ab.hasLeftChild()) {
                        cola.enqueue(ab.getLeftChild());
                    }
                    if (ab.hasRightChild()) {
                        cola.enqueue(ab.getRightChild());
                    }
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
                nivel++;
            }
        }
    }

}

