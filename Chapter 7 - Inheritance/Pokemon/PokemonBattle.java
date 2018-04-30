/*
This program is a highly simplified version of Pokemon. It simulates the creation and battle of Pokemon characters.
 */

package Pokemon;

public class PokemonBattle {
    public static void main(String[] args) {
        Fire pokeFire = new Fire(2, 50, 40, "Fire");    // Create a Fire Pokemon
        Grass pokeGrass = new Grass("Grass");    // Create a default Grass Pokemon

        // Battle until the damage of a Pokemon drops below 0
        while (pokeFire.getDamage() > 0 && pokeGrass.getDamage() > 0) {
            // Fight only if damage > 0
            if (pokeFire.getDamage() > 0) {
                System.out.println("PokeFire: Attacking PokeGrass");
                pokeFire.attack(pokeGrass);
                System.out.println("Current damage:");
                System.out.printf("PokeFire: %.2f\nPokeGrass: %.2f\n\n", pokeFire.getDamage(), pokeGrass.getDamage());
            }
            if (pokeGrass.getDamage() > 0) {
                System.out.println("PokeGrass: Attacking PokeFire");
                pokeGrass.attack(pokeFire);
                System.out.println("Current damage:");
                System.out.printf("PokeFire: %.2f\nPokeGrass: %.2f\n\n", pokeFire.getDamage(), pokeGrass.getDamage());
            }
        }

        // After battle, display who won
        if (pokeFire.getDamage() > pokeGrass.getDamage())
            System.out.println("PokeFire Won!");
        else
            System.out.println("PokeGrass Won!");
    }
}
