package Lamda;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] twoArray = {{1,2,3,4},{5,6,7,8}};
        int rows = twoArray.length;
        int column = twoArray[0].length;

        int[] singleArray = new int[rows*column];

        int index = 0;
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                singleArray[index++] = twoArray[i][j];
            }
        }
        for (int num: singleArray)
        {
            System.out.println(num);
        }

    }
}
