//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class LeetCode2FindNumberWithEvenDigit {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896,432,435667,2134};
        System.out.println(digitCount2(01));
        //System.out.println(evenDigits(nums));

    }
    static int evenDigits(int[]arr){
        int count=0;
        for(int num:arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        return digitCount(num)%2==0;
    }

    static int digitCount2(int num){
        return (int)Math.log10(num)+1;
    }

    static int digitCount(int num){
        int count=0;
        if(num==0){
            return 1;
        }
        if(num<0){
            num=num*-1;
        }
        while (num != 0) {
            count++;
            num=num/10;
        }
        return count;
    }
    }
