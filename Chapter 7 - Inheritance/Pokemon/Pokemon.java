/*
This program is a highly simplified version of Pokemon. It simulates the creation and battle of Pokemon characters.
 */

package Pokemon;

import java.util.Random;

public class Pokemon {
    private int level, attack, defense;    // Pokemon level, attack/defense factor
    private double damage;    // Pokemon damage
    private String type;

    // Default Pokemon constructor
    public Pokemon() {
        level = 1;
        attack = 1;
        defense = 1;
        damage = 50;    // damage start from 50
    }

    // Pokemon constructor with level, attack/defense factor defined by user
    public Pokemon(int level, int attack, int defense) {
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        damage = 50;    // damage start from 50
    }

    public double getDamage() {
        return damage;
    }

    // Placeholder. Type handled by child classes
    public String getType() {
        return type;
    }

    // Find modifier used in damage calculation
    private double findModifier(Pokemon defender) {
        /*
        Fire against water (modifier = 0.5)
        Fire against grass (modifier = 2)
        Water against grass (modifier = 0.5)
        Water against fire (modifier = 2)
        Grass against water (modifier = 2 )
        Grass against fire (modifier = 0.5)
         */

        double modifier = 0;
        if (getType().equals("Fire")) {
            if (defender.getType().equals("Water"))
                modifier = 0.5;
            if (defender.getType().equals("Grass"))
                modifier = 2;
        }
        else if (getType().equals("Water")) {
            if (defender.getType().equals("Grass"))
                modifier = 0.5;
            if (defender.getType().equals("Fire"))
                modifier = 2;
        }
        else if (getType().equals("Grass")) {
            if (defender.getType().equals("Water"))
                modifier = 2;
            if (defender.getType().equals("Fire"))
                modifier = 0.5;
        }
        return modifier;
    }

    // Attack another Pokemon
    public void attack(Pokemon defender) {
        double modifier = findModifier(defender);    // Find modifier in calculation
        double randomX;
        Random rand = new Random();

        // Get a random boolean for randomX
        if (rand.nextBoolean())
            randomX = 1;    // x=1 when true
        else
            randomX = 1.5;    // x=1.5 when false

        int randomZ = rand.nextInt(38)+217;    // Generate a random Z between 217 and 255

        /*
        Damage = ((((((((2A/5+2)*B)/D)/50)+2)*X)*Y/10)*Z)/255
        A = attacker's Level - #1 attribute
        B = attacker's Attack - #2 attribute
        D = defender's Defense - #3 attribute
        X = Randomly choose 1 or 1.5
        Y = Modifier
        Z = a random number between 217 and 255
         */
        // Calculate damage of current attack
        double calcDamage = ((((((((2*level/5+2)*attack)/defender.defense)/50)+2)*randomX)*modifier/10)*randomZ)/255;
        defender.damage -= calcDamage;    // Deduct damage of current attack
    }
}