import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);

        System.out.println(Integer.toString(s.size()));

        //s.add(1.0); // This causes compiler error

        s.add(1); // makes no difference as '1' is already present in the set
        System.out.println(Integer.toString(s.size()));
        s.add(3);
        s.add(4);
        s.add(5);

        System.out.println(Integer.toString(s.size()));
        s.remove(2);
        System.out.println(Integer.toString(s.size()));

        if(s.contains(2)) System.out.println("2 present");
        else System.out.println("2 removed");

        System.out.println("Set contents: ");
        Iterator i = s.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
