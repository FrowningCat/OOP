package lesson1;

public class Milk extends Product {
    public Milk(String name, double price, int fatContent) {
        super(name, price);
        this.setFatContent(fatContent);
    }

    private int fatContent;

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public String toString() {
        return String.format("%s - %s", super.toString(), fatContent);
    }
}
