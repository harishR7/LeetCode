//https://leetcode.com/problems/richest-customer-wealth/description/
public class LeetCode3RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {10, 9, 5}};
        System.out.println(maxWealth(accounts));
    }

    public static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        //person is row
        //account is column
        for (int person = 0; person < accounts.length; person++) {
            //when you start a new col,take a new sum of it
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            // checking he max value
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
