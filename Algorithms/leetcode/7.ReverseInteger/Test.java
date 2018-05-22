public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        // Base case:
        assert s.reverse(123) == 321 : "Expected 321";
        assert s.reverse(0) == 0 : "Expected 0";
        assert s.reverse(120) == 21 : "Expected 21";
        // Negative numbers:
        assert s.reverse(-50) == -5 : "Expected -5";
        // Edge case:
        assert s.reverse(1463847412) == 2147483641 : "Expected 2147483641";
        // Integer overflow case
        assert s.reverse(1534236469) == 0 : "Expected 0";
    }
}
