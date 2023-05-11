import java.util.Iterator;

public class NodesList<Integer> implements Iterable<Integer>{
    int size = 0;
    private Node first;
    private Node last;

    void addLast(int data) {
        Node<Integer> nextNode = new Node<>(data);
        Node currentNode = first;

        if (first == null) {
            first = nextNode;
            last = nextNode;
        } else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = nextNode;
        }
        size += 1;
    }

    void addFront(int data) {
        {
            Node<Integer> nextNode = new Node<>(data);
            Node currentNode = last;

            if (last == null) {
                first = nextNode;
                last = nextNode;
            } else {
                nextNode.next = first;
                first = nextNode;
            }
        }
        size += 1;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            Node<Integer> iterNode = first;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public Integer next() {
                int value = iterNode.getData();
                iterNode = iterNode.next;
                index++;
                return value;
            }
        };
    }
}