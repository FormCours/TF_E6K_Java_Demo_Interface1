package interfaces;

public interface IPerson {

    String getFirstname();
    String getLastname();

    default String getFullname() {
        return getFirstname() + " " + getLastname();
    }

    void sayHello(IPerson person);
    void eat(String food);
}
