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

class stackLinkedList {
    Node first, temp;

    stackLinkedList() {
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
    private int deleteTail() {
        int value;
        if(first.getNext() == null) {
            value = first.getData();
            first = null;
        } else {
            temp = first;
            Node temp1 = temp.getNext();
            do {
                temp = temp1;
                temp1 = temp1.getNext();
                value = temp1.getData();
            } while(temp1.getNext() != null);
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
        stackLinkedList sll = new stackLinkedList();

        sll.push(10);
        sll.push(11);
        sll.push(12);
        sll.push(13);
        sll.push(14);
        sll.push(15);

        System.out.println(Integer.toString(sll.pop()));
        System.out.println(Integer.toString(sll.pop()));
        System.out.println(Integer.toString(sll.pop()));
        System.out.println(Integer.toString(sll.pop()));

    }
}







