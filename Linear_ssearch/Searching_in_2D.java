import java.util.Arrays;

public class Searching_in_2D {
    //SEARCHING IN 2D ARRAYS
    public static void main(String[] args) {
        int[][] arr = {
                {11, 21, 31},
                {12, 22},
                {13, 23, 33, 43},
                {14, 34, 54}
        };
        int target = 34;
         int[] ans = search(arr,target); //format of return value (row,col)
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){

                if (arr[row][col] == target) {

                    return new int[]{row, col}; //making a new object to initialize over here
                }
            }
        }
        return new int[]{-1,-1};
    }
    //MAX VALUE

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr){
            for (int element : ints){

                if (element > max) {

                    max = element;
                }
            }
        }
        return max;
    }

}