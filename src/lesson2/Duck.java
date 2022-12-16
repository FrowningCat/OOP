package lesson2;

public class Duck extends Animal implements Speakable, Runable, Flyable {


    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public Integer flySpead() {
        return 40;
    }

    @Override
    public Integer runSpead() {
        return 20;
    }

    @Override
    public String speak() {
        return "Krya";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
