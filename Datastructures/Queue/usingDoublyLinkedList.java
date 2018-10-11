class Node {
    int data;
    Node prev;
    Node next;
    Node() {
        this.prev = null;
        this.next = null;
    }
    int getData() {
        return this.data;
    }
    Node getNext() {
        return this.next;
    }
    Node getPrev() {
        return this.prev;
    }
    void setData(int value) {
        this.data = value;
    }
    void setNext(Node n) {
        this.next = n;
    }
    void setPrev(Node n) {
        this.prev = n;
    }
}

class usingDoublyLinkedList {
    Node first, temp;

    usingDoublyLinkedList() {
        first = null;
    }
    private void insertTail(int value) {
        if(first == null) {
            first = new Node();
            first.setData(value);
            return;
        }
        temp = first;
        while(temp.getNext() != null)
            temp = temp.getNext();

        Node n = new Node();
        n.setData(value);
        n.setPrev(temp);
        temp.setNext(n);
    }
    private int deleteHead() {
        int value;
        value = first.getData();
        first = first.getNext();
        first.setPrev(null);
        return value;
    }
    public void enqueue(int value) {
        this.insertTail(value);
    }
    public int dequeue() {
        return this.deleteHead();
    }
}

class Main {
    public static void main(String args[]) {
        usingDoublyLinkedList udll = new usingDoublyLinkedList();

        udll.enqueue(10);
        udll.enqueue(11);
        udll.enqueue(12);
        udll.enqueue(13);
        udll.enqueue(14);

        System.out.println("Dequeueing " + Integer.toString(udll.dequeue()));
        System.out.println("Dequeueing " + Integer.toString(udll.dequeue()));
        System.out.println("Dequeueing " + Integer.toString(udll.dequeue()));
    }
}







