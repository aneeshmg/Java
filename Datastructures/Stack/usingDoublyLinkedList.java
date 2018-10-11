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
    private int deleteTail() {
        int value;
        if(first.getNext() == null) {
            value = first.getData();
            first = null;
        } else {
            temp = first;
            while(temp.getNext() != null)
                temp = temp.getNext();

            value = temp.getData();
            temp = temp.getPrev();
            temp.setNext(null);
        }
        return value;
    }
    void push(int value) {
        this.insertTail(value);
    }
    int pop() {
        return this.deleteTail();
    }
}

class Main {
    public static void main(String args[]) {
        usingDoublyLinkedList udll = new usingDoublyLinkedList();

        udll.push(10);
        udll.push(11);
        udll.push(12);
        udll.push(13);
        udll.push(14);
        udll.push(15);

        System.out.println("Popping " + Integer.toString(udll.pop()));
        System.out.println("Popping " + Integer.toString(udll.pop()));
        System.out.println("Popping " + Integer.toString(udll.pop()));
    }
}







