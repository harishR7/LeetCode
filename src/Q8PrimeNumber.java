import java.util.Scanner;

public class Q8PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if(num!=-1) {
               System.out.println(isPrime(num));
//                if(isPrimeByBoolean(num)){
//                    System.out.println("Its Prime");
//                }
//                else{
//                    System.out.println("Its Not a Prime");
//                }
            }else{
            break;}
        }

    }
    static String isPrime(int num){
        if(num<=1){
           return "Its Not a Prime";
        }
        int c=2;
        while(c * c <=num){
            if(num%c==0){
                return ("Its Not a Prime");
            }
            c++;
        }
        if(c*c >num){
            return "Its Prime";
        }
        return null;
    }
    static boolean isPrimeByBoolean(int num){
        int n=num/2;
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    }
