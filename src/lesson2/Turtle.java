package lesson2;

public class Turtle extends Animal implements Speakable, Runable, Swimable {

    public Turtle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public Integer runSpead() {
        return 1;
    }

    @Override
    public String speak() {
        return "-";
    }

    @Override
    public Integer swimSpead() {
        return 30;
    }

    @Override
    public String toString() {
        return "Turtle" + super.toString();
    }
}
