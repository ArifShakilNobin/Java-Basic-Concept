package methodRef;

public class RefDemo {
    public static void main(String[] args) {

        WorkInter workInter = () -> System.out.println("hhjhhg");

        WorkInter inter = Stuff::doStuff;

        inter.doTask();
//        workInter.doTask();

    }
}
