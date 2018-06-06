import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // This method uses the Set datastructure
    public boolean UsingDataStructure(String input) {
        boolean duplicateFound = false;
        Set<String> set = new HashSet<>();

        if(InitialChecks(input)) {
            for(int i = 0; i < input.length(); i++) {
                if(!set.contains(Character.toString(input.charAt(i))))
                    set.add(Character.toString(input.charAt(i)));
                else {
                    duplicateFound = true;
                    break;
                }
            }
            return !duplicateFound;
        }
        else
            return duplicateFound;
    }

    // This method does not use Set
    public boolean Simple(String input) {
        // Max 256 chars if unicode - nice quirk
        if (input.length() > 256) return false;

        int checker = 0;
        for(int i = 0; i < input.length(); i++) {
            int val = input.charAt(i) - 'a';

            if((checker & (1 << val)) > 0) return false;

            checker |= (1 << val);
        }
        return true;
    }

    // Utility method
    private boolean InitialChecks(String input) {

        // Find special characters
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);

        if(m.find() || input.equals("")) return false;

        else return true;
    }
}
