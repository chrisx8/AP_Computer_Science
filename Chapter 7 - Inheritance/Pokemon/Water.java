/*
This program is a highly simplified version of Pokemon. It simulates the creation and battle of Pokemon characters.
 */

package Pokemon;

public class Water extends Pokemon {
    private String type;    // Pokemon type

    public Water(String type) {
        super();    // Default default Pokemon
        this.type = type;    // Define type
    }

    public Water(int level, int attack, int defense, String type) {
        super(level, attack, defense);    // Pass level, attack, defense to parent class
        this.type = type;    // Define type
    }

    public String getType() {
        return type;
    }
}
