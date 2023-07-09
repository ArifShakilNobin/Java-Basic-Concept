package Super;

public class EmployeeSuperExample extends PersonSuperExample {
//    int id;
//    String name;
    double salary;

    public EmployeeSuperExample(int id, String name, double salary) {
        /**
         * implicitly here call super() and super() keyword call parent(PersonSuperExample) class default constructor
         */

//        super();

        /**
         * No super() keyword call parent(PersonSuperExample) args constructor
         */

        super(id, name);

//        this.id = id;
//        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + " " + salary);

    }
}
