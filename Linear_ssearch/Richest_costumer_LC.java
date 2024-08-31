//https://leetcode.com/problems/richest-customer-wealth/description/
package Searching_Algorithms.Linear_search;

public class Richest_costumer_LC {

    public static void main(String[] args) {

    }

    public int max_wealth(int[][] accounts){
        //row = person & col = account
        int ans = Integer.MIN_VALUE;
        for (int person = 0 ; person < accounts.length; person++ ){
            //when you start a new column, take a new sum for that row
            int row_sum = 0 ;
            for (int account = 0; account < accounts[person].length; account++){

                row_sum += accounts[person][account];
            }
            if (row_sum > ans){
                ans = row_sum;
            }
        }
        return ans;
    }
}