public class Test {

    public static void main(String[] args) {
        Solution s = new Solution();
        assert s.UsingDataStructure("ABCDE") == true : "Expected all unique";
        assert s.UsingDataStructure("xxxx") == false : "Expected all not-unique";
        assert s.UsingDataStructure("123") == true : "Expected all unique";
        assert s.UsingDataStructure("") == false : "Expected false for empty string";
        assert s.UsingDataStructure("a1b1cc") == false : "Expected all not-unique";
        assert s.UsingDataStructure("^&*(") == false : "Expect false for special characters";

        assert s.Simple("ABCDE") == true : "Expected all unique";
        assert s.Simple("xxxx") == false : "Expected all not-unique";
        assert s.Simple("123") == true : "Expected all unique";
        assert s.Simple("") == false : "Expected false for empty string";
        assert s.Simple("a1b1cc") == false : "Expected all not-unique";
        assert s.Simple("^&*(") == false : "Expect false for special characters";
    }
}
