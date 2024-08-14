public class GFG3Reverse {
    public static void main(String[] args) {
        System.out.println(reverse_digit(127324));
    }
    static long reverse_digit(long n)
    {
        Long result=0L;
        while(n>0){
            result=result*10+n%10;
            n/=10;
        }
        return result;
    }
}
