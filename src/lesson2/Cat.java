package lesson2;

public class Cat extends Animal implements Speakable, Runable {

    public Cat(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Mya";
    }

    @Override
    public Integer runSpead() {
        return 25;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
