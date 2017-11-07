/*
In the board game Scrabble.Scrabble, each tile contains a letter, which is used to spell words in rows and columns, and a score,
which is used to determine the value of words.

Write:
- Definition for a class named Tile that represents Scrabble.Scrabble tiles. The instance variables should include a character
  named letter and an integer named value.
- A constructor that takes parameters named letter and value and initializes the instance variables.
- A method named printTile that takes a Tile object as a parameter and displays the instance variables in a reader-
  friendly format.
- A method named testTile that creates a Tile object with the letter Z and the value 10, and then uses printTile to
  display the state of the object.
- Implement the toString and equals methods for a Tile.
- Create getters and setters for each of the attributes.
*/

package Scrabble;

public class Tiles {
    private char letter;
    private int value;

    public Tiles(char letter_in, int value_in) {
        letter = letter_in;
        value = value_in;
    }

    public void printTile() {
        System.out.println("Your letter is: " + letter);
        System.out.println("Your number is: " + value);
    }

    public void testTile() {
        Tiles testTile = new Tiles ('z', 10);
        testTile.printTile();
    }

    public char getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    public void setLetter(char letter_in) {
        letter = letter_in;
    }

    public void setValue(int value_in) {
        value = value_in;
    }

    public String toString() {
        return String.format("%c,%d", letter, value);
    }

    public boolean equals(Tiles tilesGroup) {
        return tilesGroup.value == value && tilesGroup.letter == letter;
    }
}