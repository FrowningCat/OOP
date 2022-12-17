package lesson1;

import java.util.ArrayList;
import java.util.List;

public class lesson {

    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine machine = new VendingMachine();
        System.out.println(machine);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine", 12));
        tovary.add(new Product("dust", 10));
        tovary.add(new Soda("king", 19, "grapes"));
        tovary.add(new Milk("Domik v derevne", 20, 3));

        VendingMachine machine2 = new VendingMachine(tovary);
        System.out.println(machine2);
        System.out.println(machine2.fideByName("king"));
        System.out.println(machine2.fideByPrice(12));
        System.out.println(machine2.fideByPriceRange(9, 13));
    }
}