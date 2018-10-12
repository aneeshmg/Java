class circularQueue {
    int SIZE;
    int[] data;
    int head, tail;

    circularQueue(int size) {
        this.SIZE = size;
        this.head = -1;
        this.tail = -1;
        this.data = new int[SIZE];
    }

    void enqueue(int value) {
        if((head == tail + 1) || (head == 0 && tail == SIZE - 1)) {
            System.out.println("Queue full");
        } else {
            if(head == -1) head = 0;
            tail = (tail + 1) % SIZE;
            data[tail] = value;
        }
    }

    int dequeue() {
        int toReturn;
        if(head == -1) {
            System.out.println("Queue empty");
            return 0;
        } else {
            toReturn = data[head];
            if(head == tail) {
                head = -1; tail = -1;
            } // Reset queue
            else {
                head = (head + 1) % SIZE;
            }
            return toReturn;
        }
    }
}
class Main {
    public static void main(String args[]) {
        circularQueue cq = new circularQueue(10);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.enqueue(6);

        System.out.println("Dequeuing " + Integer.toString(cq.dequeue()));
        System.out.println("Dequeuing " + Integer.toString(cq.dequeue()));
        System.out.println("Dequeuing " + Integer.toString(cq.dequeue()));
        System.out.println("Dequeuing " + Integer.toString(cq.dequeue()));
    }
}
