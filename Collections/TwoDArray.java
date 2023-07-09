package Collections;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //type[][]arrayName = new type[rows][columns];


        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arrays[][] = new int[rows][columns];

        //input
        //rows
        for (int i=0; i<rows;i++){
            //columns
            for (int j=0; j<columns; j++){
                arrays[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println(arrays[i][j] + " ");
            }
            System.out.println();
        }


    }
}
