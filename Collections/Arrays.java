package Collections;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];



        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int targetValue = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            if (targetValue == marks[i]) {
                System.out.println("Targeted value: " + targetValue + " found at: " + i);
            }
        }
    }
}
