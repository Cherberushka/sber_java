package lr3.Ex8;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private int size;

    public void createHead(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void createTail(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size++;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = head;
        while (current != null) {
            sb.append(current.getValue());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }

        sb.append("]");
        return sb.toString();
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        size++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        int value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        if (head.getNext() == null) {
            int value = head.getValue();
            head = null;
            size--;
            return value;
        }

        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        int value = current.getNext().getValue();
        current.setNext(null);
        size--;
        return value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }

    public void createHeadRec(int value) {
        head = createHeadRec(head, value);
        size++;
    }

    private Node createHeadRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        node.setNext(createHeadRec(node.getNext(), value));
        return node;
    }

    public void createTailRec(int value) {
        head = createTailRec(head, value);
        size++;
    }

    private Node createTailRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        node.setNext(createTailRec(node.getNext(), value));
        return node;
    }

    public String toStringRec() {
        return "[" + toStringRec(head) + "]";
    }

    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        }

        if (node.getNext() == null) {
            return node.getValue() + "";
        }

        return node.getValue() + ", " + toStringRec(node.getNext());
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
