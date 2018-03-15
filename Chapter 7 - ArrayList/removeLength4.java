import java.util.ArrayList;

public class removeLength4 {
    public static ArrayList<String> RemoveLength4(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
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
