public class Node<E> implements SingleNode<E> {
    E data;
    Node<E> nextNode;

    public Node(E data, Node<E> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(E data) {
        this.data = data;
        this.nextNode = null;
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public Node<E> getNext() {
        return nextNode;
    }

    public void setNext(Node<E> n) {
        nextNode = n;
    }
}
