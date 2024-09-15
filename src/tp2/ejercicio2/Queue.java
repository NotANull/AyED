package tp2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Queue<T>{

    protected List<T> data;

    public Queue() {
        this.data = new ArrayList<>();
    }

    public void enqueue(T dato) {
        data.add(dato);
    }

    public T dequeue() {
        if (this.data.isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        }
        return this.data.remove(0);
    }

    public T head() {
        if (this.data.isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        }
        return this.data.get(0);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public int size() {
        return this.data.size();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + data +
                '}';
    }
}
