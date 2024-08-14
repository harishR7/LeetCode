import java.util.Scanner;

public class Q6Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Input of the Operator:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
                System.out.println("Input of num1:");
                int num1 = sc.nextInt();
                System.out.println("Input of num2:");
                int num2 = sc.nextInt();
                switch (op) {
                    case '+':
                        System.out.println("Sum of the numbers are: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Subraction of the numbers are: " + (num1 - num2));
                        break;
                    case '/':
                        System.out.println("Division of the numbers are: " + (num1 / num2));
                        break;
                    case '*':
                        System.out.println("Multiple of the numbers are: " + (num1 * num2));
                        break;
                    case '%':
                        System.out.println("Remainder of the numbers are: " + (num1 + num2));
                        break;
                    default:
                        break;
                }
            } else if (op=='x' || op=='X') {
                break;
            } else {
                System.out.println("Invalid Symbol");
            }
        }
    }
    }
