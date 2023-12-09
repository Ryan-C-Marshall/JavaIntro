public class Deque<E> implements DequeInterface<E> {
    int length = 0;
    DoubleNode<E> front;
    DoubleNode<E> back;

    public Deque() {
        length = 0;
    }


    @Override
    public void addFront(E data) {
        if (length == 0) {
            front = new DoubleNode<>(data);
            back = front;
        } else {
            front.setNext(new DoubleNode<>(data, null, front));
            front = front.getNext();
        }
        length ++;
    }

    @Override
    public void addBack(E data) {
        if (length == 0) {
            back = new DoubleNode<>(data);
            front = back;
        } else {
            back.setPrevious(new DoubleNode<>(data));
            back.getPrevious().setNext(back);
            back = back.getPrevious();
        }
        length ++;
    }

    @Override
    public E removeFront() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            E retVal = front.getData();
            front = null;
            back = null;
            length = 0;
            return retVal;
        }
        E retVal = front.getData();
        front = front.getPrevious();
        front.setNext(null);
        length --;
        return retVal;
    }

    @Override
    public E removeBack() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            E retVal = back.getData();
            back = null;
            front = null;
            length = 0;
            return retVal;
        }
        E retVal = back.getData();
        back = back.getNext();
        back.setPrevious(null);
        length --;
        return retVal;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    public void remove(E data) {
        if (length == 0) {
            return;
        }

        DoubleNode<E> temp = back;

        while (temp != null) {
            if (temp.getData() == data) {
                if (temp.getNext() != null) {  // if not back
                    temp.getNext().setPrevious(temp.getPrevious());
                }
                if (temp.getPrevious() != null) {  // if not front
                    temp.getPrevious().setNext(temp.getNext());
                }
                length --;
                return;
            }
            temp = temp.getNext();
        }
    }
}
