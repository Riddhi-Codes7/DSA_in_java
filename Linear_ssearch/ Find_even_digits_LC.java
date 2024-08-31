//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Find_even_digits_LC {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(FindNumbers(nums));

        System.out.println(digits2(234556));
    }

    static int FindNumbers(int[] nums){

        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }

        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){

        int num_of_digits  = digits(num);
//        if (num_of_digits % 2 == 0){
//            return true;
//        }
//        return false;
        return num_of_digits % 2 == 0;
    }

    //Optimised way to find number of digits
    static int digits2(int num){
        return (int)(Math.log10(num) + 1);
    }
    //function to count digits in a number
    static int digits(int num){

        //for negative numbers
        if (num < 0)
        {
            num = num * -1;
        }

        if (num == 0 ){
            return 1;
        }
        int count = 0;

        while(num > 0 ){
            count++;
            num = num /10;
        }
        return count;
    }

}