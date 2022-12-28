package lesson4;

public class LongBow extends Bow {

    @Override
    public int range() {
        return 200;
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public String toString() {
        return "Большой лук: " + super.toString();
    }
}
