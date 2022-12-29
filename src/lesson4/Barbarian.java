package lesson4;

public class Barbarian extends Warrior<Axe, Armor> {

    public Barbarian(String name, int healthpoint, Axe axe, Armor armor) {
        super(name, healthpoint, axe, armor);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}
