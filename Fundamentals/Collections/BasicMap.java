import java.util.Map;
import java.util.HashMap;

public class BasicMap {

    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
        m.put("111", "aaa");
        m.put("222", "bbb");
        m.put("333", "ccc");

        System.out.println(m.get("111")); // Prints "aaa"
        if(m.get("something else") == null)
            System.out.println("Does not exist, lol");
        System.out.println(m.getOrDefault("lmao", "LMAO"));

        // Use some lambda! in a loop
        m.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

        // Using replaceAll()
        m.replaceAll((k, v) -> v.toUpperCase());
        m.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }
}
