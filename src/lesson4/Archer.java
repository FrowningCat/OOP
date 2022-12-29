package lesson4;

public class Archer extends Warrior<Bow, Armor> {
    public Archer(String name, int healthpoint, Bow bow, Armor armor) {
        super(name, healthpoint, bow, armor);
    }

    @Override
    public String toString() {
        return "Лучник: " + super.toString();
    }
}
