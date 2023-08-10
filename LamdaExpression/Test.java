package LamdaExpression;
interface Cab{
    public void bookCab(String sorce, String destination);
}

class Ola implements Cab{
    public void bookCab(String sorce, String destination){
        System.out.println("ola is book from"+" "+ sorce + " " + "To" +" "+ destination);
    }
}
public class Test {
    public static void main(String[] args) {
        Cab cab= ( sorce,  destination) ->System.out.println("ola is book from"+" "+ sorce + " " + "To" +" "+ destination);
        cab.bookCab("sylet","dhaka");

    }
}