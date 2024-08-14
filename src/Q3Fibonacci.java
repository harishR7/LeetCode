import java.util.Scanner;

public class Q3Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
                int num=sc.nextInt();
                int a=0;
                int b=1;
                int count=2;
                if(num==0 || num==1){
                    System.out.println(num);
                }
                while(count<=num){
                   int temp=b;
                   b=b+a;
                   a=temp;
                   count++;
                }
        System.out.println(b);
    }
}
