public class Solution {
    public int reverse(int x) {
        x = Integer.valueOf(x);
        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;
        if (x > 0) return justReverse(x);
        else if (x < 0) return -1 * justReverse(-1 * x);
        else return 0;
    }
    public int justReverse(int y) {
        boolean flag = false;
        int t = 0;
        while(y > 0) {
            if (t > (Integer.MAX_VALUE - (y % 10)) / 10) flag = true;
            t *= 10;
            t = t + (y % 10);
            y /= 10;
        }
        return flag == true? 0:Integer.valueOf(t);
    }
}
