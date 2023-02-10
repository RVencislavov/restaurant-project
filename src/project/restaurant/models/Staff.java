package project.restaurant.models;

public class Staff {
    private String firstName;
    private String lastName;
    private int salary;

    public Staff(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
