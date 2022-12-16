package lesson2;

public class Dog extends Animal implements Speakable, Runable {

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Wow";
    }

    @Override
    public Integer runSpead() {
        return 30;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
