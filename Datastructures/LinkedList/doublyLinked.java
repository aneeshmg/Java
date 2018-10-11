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

class doublyLinked {
    Node first, temp;

    doublyLinked() {
        first = null;
    }
    void insertTail(int value) {
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
    void insertHead(int value) {
        if(first == null) {
            first = new Node();
            first.setData(value);
            return;
        }
        temp = new Node();
        temp.setData(value);
        temp.setNext(first);
        first.setPrev(temp);
        first = temp;
    }
    int deleteTail() {
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
    int deleteHead() {
        int value;
        value = first.getData();
        first = first.getNext();
        first.setPrev(null);
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
        doublyLinked dl = new doublyLinked();
        doublyLinked dl1 = new doublyLinked();

        dl.insertHead(1);
        dl.insertHead(2);
        dl.insertHead(3);
        dl.insertHead(4);
        dl.insertHead(5);
        System.out.println("Deleting head " + Integer.toString(dl.deleteHead()));
        System.out.println("Deleting tail " + Integer.toString(dl.deleteTail()));

        dl.printAll();

        dl1.insertTail(1);
        dl1.insertTail(2);
        dl1.insertTail(3);
        dl1.insertTail(4);
        dl1.insertTail(5);
        System.out.println("Deleting head " + Integer.toString(dl1.deleteHead()));
        System.out.println("Deleting tail " + Integer.toString(dl1.deleteTail()));

        dl1.printAll();
    }
}







