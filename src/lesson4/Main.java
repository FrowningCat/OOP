package lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------- новая команда --------------------");
        Comandor comandor = new Comandor("Vasia", 300, new LongBow(), new Kalchuga());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarrior(new Archer("Vlad", 100, new LongBow(), new Kalchuga()));
        archers.addWarrior(new Archer("Petr", 100, new LongBow(), new Kalchuga()));
        archers.forEach(item -> System.out.println(item));
        System.out.println("Сумарный урон команды: " + archers.getAllDamage());
        System.out.println("Сумарные жизни команды: " + archers.getAllHealth());
        System.out.println("Максимальный радиус поражения: " + archers.getMaxReange());

        System.out.println("\n" + "-------------------- новая команда --------------------");
        Comandor comandor1 = new Comandor("Oleg", 320, new LongBow(), new Kalchuga());
        Team<Barbarian> barbarians = new Team<>(comandor1);
        System.out.println(comandor1);
        barbarians.addWarrior(new Barbarian("Sergy", 250, new Sekira(), new FabricArmor()));
        for (Barbarian item : barbarians) {
            System.out.println(item);
        }
        System.out.println("Сумарный урон команды: " + barbarians.getAllDamage());
        System.out.println("Сумарные жизни команды: " + barbarians.getAllHealth());
        System.out.println("Максимальный радиус поражения: " + barbarians.getMaxReange());

        System.out.println("\n" + "-------------------- новая команда --------------------");
        Comandor comandor2 = new Comandor("Dmitriy", 280, new LongBow(), new Kalchuga());
        Team<Warrior> geng = new Team<>(comandor2);
        System.out.println(comandor2);
        geng.addWarrior(new Archer("Macha", 80, new LongBow(), new Kalchuga()));
        geng.addWarrior(new Barbarian("Egor", 200, new Sekira(), new FabricArmor()));
        geng.forEach(item -> System.out.println(item));
        System.out.println("Сумарный урон команды: " + geng.getAllDamage());
        System.out.println("Сумарные жизни команды: " + geng.getAllHealth());
        System.out.println("Максимальный радиус поражения: " + geng.getMaxReange());
    }
}
