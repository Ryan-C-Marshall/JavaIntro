public class Stack<E> {
    int length;
    Node<E> tip;

    public Stack() {
        length = 0;
    }

    public void push(E data) {
        tip = new Node<>(data, tip);
        length += 1;
    }

    public E pullOut() {
        if (length == 0) {
            return null;
        }

        Node<E> retNode = tip;
        tip = tip.getNext();
        length -= 1;
        return retNode.getData();
    }

    public E justTheTip() {
        if (length == 0) {
            return null;
        }
        return tip.getData();
    }

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
