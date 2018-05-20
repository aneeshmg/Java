// Two ways - InputStreamBuffer vs Scanner(will be used in other example, former is better as
// scanner is used more for recognising tokens from stream and buffer is small making it CPU&mem
// intensive as it needs to run regex too

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanfEquivalent {
    public static void main(String[] args) {

        System.out.println("Enter number of lines to take as input");
        Integer n;
        String s;

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(bufferRead.readLine());
            while(n-- > 0) {
                s = bufferRead.readLine();
                System.out.println(s);
                s = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
            // Marking for GC
            s = null;
            n = null;
        }
    }
}
