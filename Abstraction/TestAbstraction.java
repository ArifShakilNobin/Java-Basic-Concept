package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//        Shape s;
//        s = new Circle();
//        s.draw();
//
//        s = new Rectangle();
//        s.draw();

        Calculator c;
        c = new Sum();
        c.calculate(5,10);
        c=new Subtraction();
        c.calculate(10,5);
    }
}
