package models;

import interfaces.IPerson;

public class Student extends Person {

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public String getFullname() {
        return "Eleve " + super.getFullname();
    }
}
