public class LinkedList<E> implements SinglyLinkedList<E> {

    private Node<E> head;
    private int length;

    public LinkedList(E initialData) {
        head = new Node<>(initialData, null);
        length = 1;
    }

    public LinkedList() {
        head = new Node<>(null, null);
        length = 0;
    }


    @Override
    public boolean contains(E data) {
        if (length == 0){
            return false;
        }

        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    @Override
    public void insert(E data) {
        length += 1;

        if (length == 0) {
            head = new Node<>(data);
            return;
        }

        Node<E> currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.nextNode = new Node<>(data);
    }

    @Override
    public void remove(E data) {
        if (length == 0) {
            return;
        }
        if (head.data == data) {
            head = head.nextNode;
            length -= 1;
            return;
        }

        Node<E> currentNode = head;

        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData() == data) {
                currentNode.nextNode = currentNode.getNext().getNext();
                length -= 1;
                return;
            }
            currentNode = currentNode.getNext();
        }
    }

    @Override
    public int getLength() {
        return length;
    }
}
