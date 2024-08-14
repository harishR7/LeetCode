import java.util.Scanner;

public class Q2AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char letter=sc.nextLine().trim().charAt(0);
        if('a'<=letter && letter<='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }
    }
}
