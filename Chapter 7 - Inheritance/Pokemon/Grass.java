/*
This program is a highly simplified version of Pokemon. It simulates the creation and battle of Pokemon characters.
 */

package Pokemon;

public class Grass extends Pokemon {
    private String type;    // Pokemon type

    public Grass(String type) {
        super();    // Define default Pokemon
        this.type = type;    // Define type
    }

    public Grass(int level, int attack, int defense, String type) {
        super(level, attack, defense);    // Pass level, attack, defense to parent class
        this.type = type;    // Define type
    }

    public String getType() {
        return type;
    }
}
