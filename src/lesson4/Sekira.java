package lesson4;

public class Sekira extends Axe {

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Урон секирой: %d", damage());
    }
}
