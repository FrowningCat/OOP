package lesson3;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 30));
        personal.addUser(new User("Petr", "Volkov", 19));
        personal.addUser(new User("Oleg", "Kirov", 44));
        personal.addUser(new User("Ivan", "Ivanov", 27));

        Personal personal2 = new Personal();

        personal2.addUser(new User("Masha", "Raf", 27));
        personal2.addUser(new User("Olga", "Rek", 34));

        User bigBoss = new User(personal, "Vlad", "Pupkin", 21);

        User smallBoss = new User(personal2, "Kiril", "Tarin", 49);
        personal.addUser(smallBoss);

        for (User item : personal) {
            System.out.println(item);
        }

        System.out.println("----------------------------------------------");

        Collections.sort(personal.getUsers());

        personal.forEach(System.out::println);

        System.out.println("----------------------------------------------");

        Company company = new Company(bigBoss);
        for (User item : company) {
            System.out.println(item);
        }
    }
}
