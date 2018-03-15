/*
The RemoveLength4 method removes four-character strings from an ArrayList of String.
*/

import java.util.ArrayList;

public class removeLength4 {
    public static ArrayList<String> RemoveLength4(ArrayList<String> arr) {
        // For each string in the ArrayList
        for (int i = 0; i < arr.size(); i++) {
            // Remove if string contains four characters
            if (arr.get(i).length() == 4)
                arr.remove(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("This");
        list.add("is");
        list.add("a");
        list.add("very");
        list.add("simple");
        list.add("ArrayList");
        list.add("code");

        ArrayList<String> removed = RemoveLength4(list);
        System.out.println(removed);
    }
}
