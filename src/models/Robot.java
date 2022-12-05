package models;

import interfaces.IPerson;

public class Robot implements IPerson {
    @Override
    public String getFirstname() {
        return "Robot";
    }

    @Override
    public String getLastname() {
        return null;
    }

    @Override
    public String getFullname() {
        return this.getLastname();
    }

    @Override
    public void sayHello(IPerson person) {
        System.out.printf("Bip bip! %s! \n", person.getFullname());
    }

    @Override
    public void eat(String food) {
        System.out.println("Error !!!");
    }
}
