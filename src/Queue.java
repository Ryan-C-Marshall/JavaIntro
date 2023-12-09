public class Queue<E> {
    int length;
    Node<E> head;


    public Queue() {
        length = 0;
    }

    public void enqueue(E data) {  // O(n)
        if (length == 0){
            head = new Node<>(data);
        } else {
            Node<E> currentNode = head;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.nextNode = new Node<>(data);
        }
        length += 1;
    }

    public E dequeue() {  // O(1)
        if (length == 0) {
            return null;
        }
        Node<E> toReturn = head;
        head = head.getNext();
        length -= 1;
        return toReturn.getData();
    }

    public int getSize() {  // O(1)
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
