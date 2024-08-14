import org.apache.commons.lang3.time.StopWatch;

import java.util.Scanner;

public class LeetCode1ReverseAnumber {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        //normal funnction
//        while(num!=0){
//            int rem=num%10;
//            sum=sum*10+rem;
//            num=num/10;
//        }


        // by 32 bit restriction
//           while(num!=0){
//               if(Integer.MAX_VALUE/10<sum || sum<Integer.MIN_VALUE/10){
//                   System.out.println(0);
//               }
//            sum=sum*10+num%10;
//            num=num/10;
//        }
//        System.out.println(sum);

boolean number=num<0;
               if(Integer.MAX_VALUE<num || num<Integer.MIN_VALUE){
                   System.out.println(0);
               }
String s=Integer.toString(Math.abs(num));
StringBuilder sb=new StringBuilder(s);
 sum =Integer.parseInt(sb.reverse().toString());
        System.out.println(number?-sum:sum);
        stopwatch.stop();
        long timeTaken = stopwatch.getTime();
        System.out.println(timeTaken);
    }
}
