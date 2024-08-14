import java.util.Arrays;

public class LeetCode15PlusOne {
    public static void main(String[] args) {
        int num[]={8,9,9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }
    public static int[] plusOnes(int[] digits) {
        int len=digits.length-1;
        if(digits[len]==9)
        {
            String data="";
            int [] arr=new int[len==0?digits.length+1:digits.length];
            int k=arr.length-1;
            for(int n:digits){
                data=data+n;
            }
            int num=Integer.parseInt(data)+1;
            while(num>0){
                arr[k]=num%10;
                k--;
                num=num/10;
            }
            //    int i=0;
            //    for(int num:digits) {
            // 	   if(i<len) {
            // 		   arr[i]=num;
            // 		   i++;
            // 	   }
            // 	   else {
            // 		  if (len==0){
            // 			   arr[i]= 1;
            // 		   }else {
            // 			   arr[i]= digits[i-1]+1;
            // 		   }
            // 		   arr[i+1]=0;
            // 	   }
            //    }
            return arr;
        }else {
            digits[len]=digits[len]+1;
            return digits;
        }
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
