import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {

        // Without type safety
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add("hi");
        al1.add(999);
        al1.add(true);

        for(Object o:al1)
            System.out.println(o.toString());

        // With type safety
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Something");
        al2.add("looks");
        al2.add("good");
        // Uncommenting the below line would produce an error
        //al2.add(10);

        for(String s:al2)
            System.out.println(s);

        // Some arraylist util methods TODO: Unsure what this subList is doing
        Collections.sort(al2.subList(1, al2.size()));
        for(String s:al2)
            System.out.println(s);
        System.out.println(al2.contains("bad"));

    }
}
