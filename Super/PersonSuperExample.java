package Super;

public class PersonSuperExample {
    int id;
    String name;


    public PersonSuperExample(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public PersonSuperExample() { //default constructor
        System.out.println("Person:Base Class- no-arg constructor");
    }
}
