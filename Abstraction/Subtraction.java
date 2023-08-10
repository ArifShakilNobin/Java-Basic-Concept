package Abstraction;

public class Subtraction extends Calculator{
    @Override
    void calculate(int a, int b) {
        int result = a-b;
        System.out.println("sub :" + result);
    }
}
