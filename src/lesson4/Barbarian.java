package lesson4;

public class Barbarian extends Warrior<Axe> {

    public Barbarian(String name, int healthpoint, Axe axe) {
        super(name, healthpoint, axe);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}
