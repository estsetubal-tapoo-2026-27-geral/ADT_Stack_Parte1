package pt.unips.estsetubal.tapoo.adt;


public class StackArrayList<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 40;

    private T[] elements;
    private int size;


    public StackArrayList() {
        this.elements = (T[])new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void push(T element) throws FullStackException {
        if(this.size >= this.elements.length) throw new FullStackException();

        this.elements[this.size++] = element;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(this.size == 0) throw new EmptyStackException();

        T elem = this.elements[this.size - 1];
        this.elements[this.size - 1] = null;
        this.size--;

        return elem;
    }

    @Override
    public T peek() throws EmptyStackException {
       if(size==0)throw new EmptyStackException();
       return this.elements[this.size - 1];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {

        return size==0;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

}
