package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeDemo{

    String eName;
    int salary;
    String gender;

    EmployeeDemo(String eName,int salary, String gender){
        this.eName = eName;
        this.salary = salary;
        this.gender = gender;
    }
}
public class PredictFuncConsumeSupplyDemo {

    public static void main(String[] args) {
        ArrayList<EmployeeDemo> empList = new ArrayList<>();

        empList.add(new EmployeeDemo("Nobin", 60000,"Male"));
        empList.add(new EmployeeDemo("Emon", 50000,"Male"));
        empList.add(new EmployeeDemo("Ayon", 5000000,"Male"));


        //Function
        Function<EmployeeDemo,Integer> f = emp->(emp.salary*10/100); //task 1

        //predicate
        Predicate<Integer> p = s->s>5000; //task 2

        //consumer
        Consumer<EmployeeDemo> c=emp->{
            System.out.println(emp.eName);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        }; // task 3

        //supplier


        for (EmployeeDemo emp: empList) {
            int bonus = f.apply(emp); // calculate bonus invoked function

            if (p.test(bonus)){ // invoked predicate
                c.accept(emp); // invoked consumer
                System.out.println(bonus);
            }



        }



    }
}
