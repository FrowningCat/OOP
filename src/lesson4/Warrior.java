package lesson4;

public abstract class Warrior<T extends Weapon, R extends Armor> {
    private String name;
    int healthpoint;
    private T weapon;
    private R armor;

    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, оружие: %s, броня: %s", name, healthpoint, weapon.toString(), armor.toString());
    }

    public Warrior(String name, int healthpoint, T weapon, R armor) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public R getEquipment() {
        return armor;
    }

    public void setEquipment(R weapon) {
        this.armor = armor;
    }
}
