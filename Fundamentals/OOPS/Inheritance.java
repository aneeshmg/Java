import com.aneeshmg.Base;
import com.aneeshmg.Inherited;

public class Inheritance {

    private static Inherited inherited;

    public static void main(String[] args) {
        inherited = new Inherited("Firstname", "Lastname");

        System.out.println(inherited.getFullName());
    }
}
