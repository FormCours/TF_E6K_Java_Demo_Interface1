package models;

import interfaces.IPerson;

public class Person implements IPerson {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void sayHello(IPerson person) {
        System.out.printf("%s dit bonjour à %s \n", this.getFullname(), person.getFullname());
    }

    @Override
    public void eat(String food) {
        System.out.printf("%s mange %s \n", this.getFullname(), food);
    }
}
