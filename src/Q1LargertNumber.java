import java.util.Scanner;

public class Q1LargertNumber {
    public static void main(String[] args) {

        //Q1 Find the Largest Number using 3 inputs
        Scanner sc=new Scanner(System.in);
        int max=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b){
            max=b;
        }else{
            max=a;
        }
      //  max=Math.max(a,b); another method using Math.max()
        if(max<c){
            max=c;
        }
        //max=Math.max(c,Math.max(a,b)); another code metgod using Math.max using single line
        System.out.println(max);
    }

}
