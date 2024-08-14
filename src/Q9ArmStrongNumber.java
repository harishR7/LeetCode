import java.util.Scanner;

public class Q9ArmStrongNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
//        while(true) {
//            int n = sc.nextInt();
//            int temp=n;
//            while (temp > 0) {
//                int rem = temp % 10;
//                int cube = (int) Math.pow(rem, 3);
//                sum += cube;
//                temp = temp / 10;
//            }
//            if (sum == n) {
//                System.out.println("Its ArmStrong Number");
//            } else {
//                System.out.println("Its not ArmStrong Number");
//            }
//        }
        while(true) {
            int n = sc.nextInt();
            for (int i = 0; i <=n;i++){
                int temp = i;
                while (temp > 0) {
                    int rem = temp % 10;
                    int cube = (int) Math.pow(rem, 3);
                    sum += cube;
                    temp = temp / 10;
                }
                if (sum == n) {
                    System.out.print(sum+" ");
                }
            }
        }
    }
}
