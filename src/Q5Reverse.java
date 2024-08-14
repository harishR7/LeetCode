import java.util.Scanner;

public class Q5Reverse {
    public static void main(String[] args) {

        //Reverse a NUmber
//        Scanner sc =new Scanner(System.in);
//        int num=sc.nextInt();
//        int result=0;
//
//        while(num>0){
//            int rem=num%10;
//            result=result*10+rem;
//            num=num/10;
//        }
//        System.out.println(result);

        //Reverse a String

        Scanner sc =new Scanner(System.in);
        String data=sc.nextLine();
        String result="";
        for(int i= data.length()-1;i>=0;i--){
            result=result+data.toLowerCase().charAt(i);
        }
        System.out.println(result);
    }
    }
