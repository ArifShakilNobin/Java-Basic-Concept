package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeFn {
    String eName;
    int salary;

    EmployeeFn(String name, int salary) {
        this.eName = name;
        this.salary = salary;
    }
}

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> f = n -> n * n;
        System.out.println(f.apply(5));

        System.out.println("string -----> length ------> int");

        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Nobin"));

        System.out.println("-------object pass-----------");
        ArrayList<EmployeeFn> empList = new ArrayList<>();
        empList.add(new EmployeeFn("Nobin", 60000));
        empList.add(new EmployeeFn("Emon", 50000));
        empList.add(new EmployeeFn("Ayon", 5000000));


        Function<EmployeeFn, Integer> empFn = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return (sal*10/100);
            else if(sal>=20000 && sal<=30000)
                return (sal*20/100);
            else
                return (sal*60/100);
        };

        Predicate<Integer> p = b->b>5000;

        for (EmployeeFn emp: empList) {
            int bonus = empFn.apply(emp); //function use

            if (p.test(bonus)){ //predicate use
                System.out.println(emp.eName +" "+ emp.salary+" " + "Bonus is:" +bonus );
            }



//            System.out.println("Bonus is:" +bonus);

        }
    }
}
