package lesson4;

public class Kalchuga extends Armor {
    @Override
    public int protection() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("защита кальчуги: %d", protection());
    }
}
