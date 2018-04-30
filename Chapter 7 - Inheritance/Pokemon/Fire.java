/*
This program is a highly simplified version of Pokemon. It simulates the creation and battle of Pokemon characters.
 */

package Pokemon;

public class Fire extends Pokemon {
    private String type;    // Pokemon type

    public Fire(String type) {
        super();    // Define a default Pokemon
        this.type = type;    // Define type
    }

    public Fire(int level, int attack, int defense, String type) {
        super(level, attack, defense);    // Pass level, attack, defense to parent class
        this.type = type;    // Define type
    }

    public String getType() {
        return type;
    }
}
