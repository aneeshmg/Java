class Node {
    int data;
    Node next;
    Node() {
        this.next = null;
    }
    int getData() {
        return this.data;
    }
    Node getNext() {
        return this.next;
    }
    void setData(int value) {
        this.data = value;
    }
    void setNext(Node n) {
        this.next = n;
    }
}

class queueLinkedList {
    Node first, temp;

    queueLinkedList() {
        first = null;
    }
    private void insertTail(int value) {
        if(first == null) {
            first = new Node();
            first.setData(value);
            first.setNext(null);
            return;
        }
        temp = first;
        while(temp.getNext() != null)
            temp = temp.getNext();

        Node n = new Node();
        n.setData(value);
        temp.setNext(n);
    }
    private int deleteHead() {
        int value;
        value = first.getData();
        first = first.getNext();
        return value;
    }
    void enqueue(int value) {
        this.insertTail(value);
    }
    int dequeue() {
        return this.deleteHead();
    }
    void printAll() {
        temp = first;
        System.out.println("Printing all..");
        while(temp.getNext() != null) {
            System.out.println(Integer.toString(temp.getData()));
            temp = temp.getNext();
        }
        // This is to print the last node.
        // TODO: Better way?
        System.out.println(Integer.toString(temp.getData()));
    }
}

class Main {
    public static void main(String args[]) {
        queueLinkedList qll = new queueLinkedList();

        qll.enqueue(1);
        qll.enqueue(2);
        qll.enqueue(3);
        qll.enqueue(4);
        qll.enqueue(5);
        qll.enqueue(6);

        System.out.println(Integer.toString(qll.dequeue()));
        System.out.println(Integer.toString(qll.dequeue()));
        System.out.println(Integer.toString(qll.dequeue()));
        System.out.println(Integer.toString(qll.dequeue()));
        System.out.println(Integer.toString(qll.dequeue()));
    }
}







