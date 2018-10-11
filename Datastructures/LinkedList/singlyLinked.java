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

class singlyLinked {
    Node first, temp;

    singlyLinked() {
        first = null;
    }
    void insertTail(int value) {
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
    void insertHead(int value) {
        if(first == null) {
            first = new Node();
            first.setData(value);
            first.setNext(null);
            return;
        }
        temp = new Node();
        temp.setData(value);
        temp.setNext(first);
        first = temp;
    }
    int deleteTail() {
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
    int deleteHead() {
        int value;
        value = first.getData();
        first = first.getNext();
        return value;
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
        singlyLinked sl = new singlyLinked();
        singlyLinked sl1 = new singlyLinked();

        sl.insertHead(10);
        sl.insertHead(20);
        sl.insertHead(30);
        sl.insertHead(40);
        sl.insertHead(50);
        System.out.println("DeletingHead " + Integer.toString(sl.deleteHead()));

        sl1.insertTail(10);
        sl1.insertTail(20);
        sl1.insertTail(30);
        sl1.insertTail(40);
        sl1.insertTail(50);
        System.out.println("DeletingTail " + Integer.toString(sl1.deleteTail()));

        sl.printAll();
        sl1.printAll();

    }
}







