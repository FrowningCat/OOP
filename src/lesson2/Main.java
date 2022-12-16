package lesson2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Goostik", 4, "Vlad"))
                .addAnimal(new Dog("Dafi", 4, "Vlad"))
                .addAnimal(new Duck("Donald", 2, "Oleg"))
                .addAnimal(new Eagle("Rob", 2, "Ivan"))
                .addAnimal(new Turtle("Leonardo", 4, "Splinter"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());

        for (Runable i : zoo.getRanabl()) {
            System.out.println(i.runSpead());
        }

        System.out.println("----------------------");
        System.out.println(zoo.getChampionSpead());
        System.out.println("----------------------");

        for (Flyable i : zoo.getFlyable()) {
            System.out.println(i.flySpead());
        }

        System.out.println("----------------------");

        for (Swimable i : zoo.getSwimable()) {
            System.out.println(i.swimSpead());
        }

        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());
    }
}
