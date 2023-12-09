public class DoubleNode<E> extends Node<E> {

    DoubleNode<E> previous;
    DoubleNode<E> nextNode;


    DoubleNode(E data, DoubleNode<E> next, DoubleNode<E> previous) {
        super(data, next);
        setPrevious(previous);
    }

    DoubleNode(E data) {
        super(data);
    }

    public DoubleNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode<E> p) {
        previous = p;
    }

    @Override
    public DoubleNode<E> getNext() {
        return nextNode;
    }


    public void setNext(DoubleNode<E> n) {
        nextNode = n;
    }

}
