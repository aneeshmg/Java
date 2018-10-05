class usingArray {
    private int size;
    private int[] data;
    private int top;

    usingArray(int n) {
        size = n;
        data = new int[size];
        top = -1;
    }

    public boolean push(int value) {
        ++top;
        if(top >= size) {
            System.out.println("Stackoverflow!");
            return false;
        }
        else {
            data[top] = value;
            System.out.println("Pushed " + Integer.toString(value));
            return true;
        }
    }

    public int pop() {
        --top;
        if(top < 0) {
            System.out.println("Stackunderflow!");
            return 0;
        }
        else {
            return data[top];
        }
    }
    public int top() {
        return top;
    }

}
class Main {
    public static void main(String args[]) {
        int SIZE = 5;
        usingArray ua = new usingArray(SIZE);

        ua.push(2);
        ua.push(3);
        ua.push(6);
        ua.push(8);

        System.out.println(Integer.toString(ua.pop()));
        System.out.println(Integer.toString(ua.top()));
    }
}
