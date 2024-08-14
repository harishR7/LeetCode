import java.util.Scanner;

public class Q7Weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=null;
        int num=sc.nextInt();
        switch (num){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        System.out.println(day);
    }
}
