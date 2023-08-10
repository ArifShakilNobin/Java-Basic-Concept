package Super;

/**
 * Super can be used to refer immediate parent class instance variable
 * Super can be used to invoke immediate parent class method.
 * Super can be used to invoke immediate parent class constructor.
 *
 * process to use super keyword
 *
 * class A{
 *
 * }
 *  1st way: In this case,we bring all the members of class A into RAM for just calling m2() method.
 *  So,Unnecessary memory will be allocated for other member.
 */



public class SuperExample {

    public static void main(String[] args) {

        /**
         * 1st way: In this case,we bring all the members of class PersonSuperExample into RAM for just calling PersonSuperExample default constructor.
         * So,Unnecessary memory will be allocated for other member.
         */
        EmployeeSuperExample e1 = new EmployeeSuperExample(1,"nobin",200);
        e1.display();
    }
}