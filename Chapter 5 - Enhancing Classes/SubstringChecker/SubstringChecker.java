/*
The SubstringChecker class implements the Checker interface.
The accept method will check if the string contains the substring defined during instantiation.
The toString method returns the string that is being checked.
 */

package SubstringChecker;

public class SubstringChecker implements Checker{
    private String substrMatch, checkedText;

    // Accepts the substring definition
    public SubstringChecker (String match) {
        substrMatch = match;
    }

    // Checks with indexOf method
    public boolean accept(String text) {
        checkedText = text;
        // indexOf returning -1 means the substring is not found
        if (text.indexOf(substrMatch) == -1)
            return false;
        // Otherwise, the substring is found
        else
            return true;
    }

    public String toString() {
        return checkedText;
    }
}
