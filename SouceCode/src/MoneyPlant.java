import javax.swing.*;

/**
 * This is a plant class that generates money
 * @author Dmytro Sytnik (VanArman)
 * @version 13 October, 2018
 *
 * @author Ahmed Romih (decarbonite)
 * @version 26 October, 2018
 */
public class MoneyPlant extends Plant {
    private int moneyToRise;

    /**
     * Initializes a new MoneyPlant
     * @param name Plant's name
     * @param health Plant's health
     * @param money Amount of money generated by MoneyPlant
     * @param imgURL String image URL
     */
    public MoneyPlant(String name, int health, int money, ImageIcon imgURL){
        super(name, health, imgURL);
        this.moneyToRise = money;
    }

    /**
     * Method is not used
     * @param npc NPC to be attacked
     */
    @Override
    public void attack(NPC npc) {
        return;
    }

    /**
     * Return money generated by MoneyPlant
     * @return int amount of money player gain from one MoneyFlower
     */
    public int getMoney(){
        return moneyToRise;
    }
}
