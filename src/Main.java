import interfaces.IPerson;
import models.Person;
import models.Robot;
import models.Student;

public class Main {

    public static void main(String[] args) {

        IPerson zaza = new Student("Zaza", "Vanderquack");
        IPerson della = new Person("Della", "Duck");
        IPerson julien = new Robot();

        zaza.sayHello(della);
        della.eat("Saint nicolas en chocolat");
        julien.sayHello(zaza);
    }

}