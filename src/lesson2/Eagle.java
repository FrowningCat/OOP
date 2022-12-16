package lesson2;

public class Eagle extends Animal implements Speakable, Runable, Flyable {

    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public Integer flySpead() {
        return 70;
    }

    @Override
    public Integer runSpead() {
        return 5;
    }

    @Override
    public String speak() {
        return "Kar";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
