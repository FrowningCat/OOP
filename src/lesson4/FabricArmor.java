package lesson4;

public class FabricArmor extends Armor {
    @Override
    public int protection() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("защита тканевой брони: %d", protection());
    }
}
