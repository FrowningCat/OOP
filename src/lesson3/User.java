package lesson3;

public class User implements Comparable<User> {
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Personal getSubordinates() {
        return subordinates;
    }

    public User(Personal subordinates, String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.subordinates = subordinates;
    }

    private Personal subordinates = new Personal();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private String firstName;
    private String lastName;
    private int age;

    @Override
    public int compareTo(User o) {
        String fallName = this.firstName + " " + this.lastName;
        String fallNameO = o.firstName + " " + o.lastName;
        if (fallName.equals(fallNameO)) {
            return this.age - o.age;
        }
        return fallName.compareTo(fallNameO);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
