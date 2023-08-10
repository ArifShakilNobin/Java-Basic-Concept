package Abstraction;

public class Sum extends Calculator{
    @Override
    void calculate(int a, int b) {
        int result= a+b;
        System.out.println("sum: " + result);
    }
}
