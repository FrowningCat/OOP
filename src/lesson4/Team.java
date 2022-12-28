package lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Comandor comandor;

    public Team(Comandor comandor) {
        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarrior(T newWarrior) {
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() {
        int sumDamage = 0;
        for (T item : this) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealth() {
        int sumHealth = 0;
        for (T item : this) {
            sumHealth += item.getHealthpoint();
        }
        return sumHealth;
    }

    public int getMaxReange() {
        int maxRang = 1;
        for (T item : this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRang < bow.range()) {
                    maxRang = bow.range();
                }
            }
        }
        return maxRang;
    }
}
