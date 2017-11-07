package Scrabble;

public class Scrabble {
    public static void main(String[] args) {
        //Instantiate 3 groups of tiles
        Tiles group1 = new Tiles('a', 1);
        Tiles group2 = new Tiles('b', 12);
        Tiles group3 = new Tiles('a', 1);

        System.out.println("Test tile");
        group1.testTile();          //Test tile
        System.out.println();       //Empty line

        group1.printTile();         //Print tiles of group 1
        System.out.println(group1.toString());         //Convert group 1 to string

        System.out.println("group 1 vs. group 2: " + group1.equals(group2));    //Check if group 1 is the same as group 2
        System.out.println("group 1 vs. group 3: " + group1.equals(group3));    //Check if group 1 is the same as group 3
    }
}
