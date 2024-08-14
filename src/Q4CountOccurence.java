import java.util.Scanner;

public class Q4CountOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int target=sc.nextInt();
//        int count=0;
//       int [] arr= new int []{2,3,21,78,3,6,9,3,212,534,3,76,3};
//       for(int data:arr){
//           if(data==target){
//               count++;
//           }
//       }
//       System.out.println(count);\
        int num=sc.nextInt();
        int target=sc.nextInt();
        int rem=0;
        int result=0;
        while(num>0){
            rem=num%10;
            if(rem==target){
                result++;
            }
            num=num/10;
        }
        System.out.println(result);

    }
}
