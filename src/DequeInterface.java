public interface DequeInterface<E> {

    public void addFront(E data);
    public void addBack(E data);
    public E removeFront();
    public E removeBack();
    public int getSize();
    public boolean isEmpty();
}
