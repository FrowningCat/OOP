package lesson4;

public class Comandor extends Warrior<Weapon, Armor> {

    public Comandor(String name, int healthpoint, Weapon weapon, Armor armor) {
        super(name, healthpoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
