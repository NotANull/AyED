package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{

    public T shift() {
        T data = super.dequeue();
        super.enqueue(data);
        return data;
    }


}
