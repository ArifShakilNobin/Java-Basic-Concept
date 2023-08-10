package LamdaExpression;


import java.util.function.Predicate;

public class Employee {
    String name;
    int salary;
    int experience;

    Employee(String name, int salary, int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public static void main(String[] args) {
        Employee employeeObj = new Employee("Nobin",5,900000);
        Predicate<Employee> employeePredicate = employee -> employee.name.length()>4 && employee.experience>4 && employee.salary>80000;
        System.out.println(employeePredicate.test(employeeObj));
    }

}
