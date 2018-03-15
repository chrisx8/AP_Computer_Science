import java.util.ArrayList;

public class reorderPairs {
    public static ArrayList<Integer> reorderPairs (ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size()-1; i = i+2) {
                int num1 = arr.get(i);
                int num2 = arr.get(i+1);
                if (num1 > num2) {
                    arr.set(i, num2);
                    arr.set(i+1, num1);
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);

        ArrayList<Integer> sorted = reorderPairs(list);
        System.out.println(sorted);
    }
}
