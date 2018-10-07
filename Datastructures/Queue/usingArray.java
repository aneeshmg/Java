class usingArray {
    private int SIZE;
    private int head;
    private int tail;
    private int[] data;

    usingArray(int size) {
        SIZE = size;
        head = 0;
        tail = -1;
        data = new int[SIZE];
    }

    public boolean enqueue(int value) {
        ++tail;
        if(tail >= SIZE) {
            System.out.println("Queue full");
            return false;
        }
        else {
            data[tail] = value;
            return true;
        }
    }

    public int dequeue() {
        if(tail == -1 || head > tail) {
            System.out.println("Queue empty");
            return 0;
        }
        else {
            return data[head++];
        }
    }
}
class Main {
    public static void main(String args[]) {
        usingArray ua = new usingArray(5);

        ua.enqueue(10);
        ua.enqueue(20);
        ua.enqueue(30);
        ua.enqueue(40);
        ua.enqueue(50);

        System.out.println(Integer.toString(ua.dequeue()));
        System.out.println(Integer.toString(ua.dequeue()));
        System.out.println(Integer.toString(ua.dequeue()));
        System.out.println(Integer.toString(ua.dequeue()));
    }
}
